import java.io.*;
import java.util.*;

public class RegistrarCliente {

    private static final String ARCHIVO = "clientes.csv";

    public void registrar() {

        Scanner sc = new Scanner(System.in);

        try {
            int nuevoId = obtenerNuevoId();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Telefono: ");
            String telefono = sc.nextLine();

            FileWriter fw = new FileWriter(ARCHIVO, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(nuevoId + "," + nombre + "," + apellido + "," + telefono + ",1");
            bw.newLine();
            bw.close();

            System.out.println("✅ Cliente registrado correctamente.");

        } catch (IOException e) {
            System.out.println("❌ Error al registrar cliente.");
        }
    }

    private int obtenerNuevoId() throws IOException {

        File file = new File(ARCHIVO);

        if (!file.exists()) {
            return 1;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linea;
        int ultimoId = 0;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            ultimoId = Integer.parseInt(datos[0]);
        }

        br.close();
        return ultimoId + 1;
    }
}