public class Restaurantes {
    private String nombre;
    private String descripcion;
    private String tipo;
    private String direccion;
    private int horario;

    public Restaurantes(String nombre, String descripcion, String tipo, String direccion, int horario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
}
