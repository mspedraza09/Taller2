
import java.io.*;
import java.util.*;

public class CRUDClientes{

    public final String NOMBRE_ARCHIVO = "clientes.csv";
    public static List<Cliente> leerUsuarios() throws IOException {
    List<Cliente> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File(NOMBRE_ARCHIVO));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Cliente(
        Integer.parseInt(datos[0]),datos[1]));
    }
    sc.close();
    return lista;
}

    public void eliminarclientes() throws IOException {
        
            
    Scanner sc = new Scanner(System.in);
    System.out.println("Dígite el id del cliente que quieren eliminar");
    int id = sc.nextInt();
        ArrayList<Cliente> clientes = new ArrayList<>();
        BufferedReader bw = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
        String linea;
         List<Cliente> lista = leerUsuarios();

       for (Cliente u : lista) {
        if (u.getId() != id) {
            bw.write(u.toString());
            bw.newLine();
        }
    }
    bw.close();
        
    }
    }





    
