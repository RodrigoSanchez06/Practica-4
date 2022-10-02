package componentes.blindaje;

public class BlindajeReforzado extends Blindaje {

    @Override
    public String nombre() {
        return "Blindaje Reforzado";
    }

    @Override
    public String descripcion() {
        return "Blindaje Avanzado capaz de resistir algunos misiles de plasma.";
    }

    @Override
    public double ataque() {
        return 0;
    }

    @Override
    public double defensa() {
        return 47.0;
    }

    @Override
    public double velocidad() {
        return 12.0;
    }

    @Override
    public double peso() {
        return 30.0;
    }

    @Override
    public double precio() {
        return 2380.0;
    }

}
