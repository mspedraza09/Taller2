public class Pedido{
    private int id_pedido;
    private int id_cliente;
    private String producto;
    private double precio;
    private int cantidad;
    private int activo; 

        public Pedido(int activo, int cantidad, int id_cliente, int id_pedido, double precio, String producto) {
            this.activo = activo;
            this.cantidad = cantidad;
            this.id_cliente = id_cliente;
            this.id_pedido = id_pedido;
            this.precio = precio;
            this.producto = producto;
        }

    @Override
    public String toString() {
        return id_pedido+","+id_cliente+","+producto+","+precio+","+cantidad+","+activo;
    }
    }

