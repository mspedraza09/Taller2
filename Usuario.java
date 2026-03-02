public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private int telefono;
    private boolean activo;

    public Usuario(int id_cliente, String nombre, String apellido, int telefono, boolean activo) {
        this.id = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + apellido + "," + telefono + "," + activo;
    }
}
