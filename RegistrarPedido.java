
import java.io.*;

public class RegistrarPedido{
    public final String direccion = "pedidos.csv";

    public RegistrarPedido() {
    }
    public static void crearPedido(Pedido pedido)
    throws IOException{
        FileWriter fw = new FileWriter("pedidos.cvs", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(pedido.toString());
        bw.newLine();
        bw.close();
    }
}