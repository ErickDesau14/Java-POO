public class Administrador extends Funcionario implements Autenticar {

    private AutenticacionUtil util;

    public Administrador () {
        this.util = new AutenticacionUtil();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

}
