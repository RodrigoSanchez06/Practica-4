package componentes.armas;

public class LaserSimple extends Armas {

    @Override
    public String nombre() {
        return "Laser Simple.";
    }

    @Override
    public String descripcion() {
        return "Laser simple capaz de destruir naves individuales.";
    }

    @Override
    public double ataque() {
        return 25.0;
    }

    @Override
    public double defensa() {
        return 5.0;
    }

    @Override
    public double velocidad() {
        return 9.0;
    }

    @Override
    public double peso() {
        return 13.0;
    }

    @Override
    public double precio() {
        return 750.0;
    }

}
