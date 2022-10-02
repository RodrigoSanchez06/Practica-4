package componentes.blindaje;

public class BlindajeFortaleza extends Blindaje {

    @Override
    public String nombre() {

        return "Blindaje Fortaleza";
    }

    @Override
    public String descripcion() {
        return "Blindaje impenetrable, capaz de resistir algunos disparos de laser destructor de planetas";
    }

    @Override
    public double ataque() {
        return 0;
    }

    @Override
    public double defensa() {
        return 80.0;
    }

    @Override
    public double velocidad() {
        return 5.0;
    }

    @Override
    public double peso() {
        return 40.0;
    }

    @Override
    public double precio() {
        return 3125.0;
    }

}
