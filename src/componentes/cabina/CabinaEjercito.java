package componentes.cabina;

public class CabinaEjercito extends Cabina {

    @Override
    public String nombre() {
        return "Cabina Ejercito.";
    }

    @Override
    public String descripcion() {
        return "Cabina gigante, capaz de albergar a un ejercito galáctico.";
    }

    @Override
    public double ataque() {
        return 34.0;
    }

    @Override
    public double defensa() {
        return 27.0;
    }

    @Override
    public double velocidad() {
        return 24.0;
    }

    @Override
    public double peso() {
        return 30.0;
    }

    @Override
    public double precio() {
        return 2320.0;
    }

}
