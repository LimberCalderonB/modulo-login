public class Privilegio {
    Funcionalidad funcionalidad;
    Rol rol;

    public Privilegio(Funcionalidad funcionalidad, Rol rol) {
        this.funcionalidad = funcionalidad;
        this.rol = rol;
    }

    public Funcionalidad getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(Funcionalidad funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
