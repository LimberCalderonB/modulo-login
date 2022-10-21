import java.util.Date;

public class Usuario extends Persona{
    String usuario;
    String contraceña;

    public Usuario(String nombre, String primerApellido, String segundoApellido, String CI, Date fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraceña) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direccion, celular, telefono, email);
        this.usuario = usuario;
        this.contraceña = contraceña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraceña() {
        return contraceña;
    }

    public void setContraceña(String contraceña) {
        this.contraceña = contraceña;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contraceña='" + contraceña + '\'' +
                '}';
    }
}
