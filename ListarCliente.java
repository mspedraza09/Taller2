import java.io.*;

public class ListarCliente {

    private static final String ARCHIVO = "clientes.csv";

    public void listar() {

        try {

            BufferedReader br = new BufferedReader(new FileReader(ARCHIVO));
            String linea;

            System.out.println("\n📋 LISTA DE CLIENTES");
            System.out.println("-------------------------");

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                int activo = Integer.parseInt(datos[4]);

                if (activo == 1) {
                    System.out.println("ID: " + datos[0] +
                            " | Nombre: " + datos[1] +
                            " " + datos[2] +
                            " | Tel: " + datos[3]);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("No hay clientes registrados.");
        }
    }
}