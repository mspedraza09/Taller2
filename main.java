import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class main {
    private static final String CLIENTES_FILE = "clientes.csv";
    private static final String PEDIDOS_FILE = "pedidos.csv";
    private static final String PEDIDOS_INDEX_FILE = "pedidos.idx";

    private static final String CLIENTES_HEADER = "id_cliente,nombre,apellido,telefono,activo";
    private static final String PEDIDOS_HEADER = "id_pedido,id_cliente,producto,precio,cantidad,activo";

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            mostrarMenu();
        } catch (IOException e) {
            System.out.println("Error inicializando archivos: " + e.getMessage());
        }
    }

    private static void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Registrar un cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Eliminar un cliente");
            System.out.println("4. Registrar un pedido");
            System.out.println("5. Listar pedidos de un cliente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = leerEnteroSeguro();

            try {
                switch (opcion) {
                    case 1:
                        registrarCliente();
                        break;
                    case 2:
                        listarClientes();
                        break;
                    case 3:
                        eliminarCliente();
                        break;
                    case 4:
                        registrarPedido();
                        break;
                    case 5:
                        listarPedidosDeCliente();
                        break;
                    case 6:
                        salir = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (IOException e) {
                System.out.println("Error de archivo: " + e.getMessage());
            }
        }
    }

   
    



















