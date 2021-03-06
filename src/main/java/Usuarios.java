public class Usuarios {
    private String nombre;
    private String apellidos;
    private String email;
    private String ontraseña;

    public Usuarios(String nombre, String apellidos, String email, String ontraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.ontraseña = ontraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOntraseña() {
        return ontraseña;
    }

    public void setOntraseña(String ontraseña) {
        this.ontraseña = ontraseña;
    }
}
