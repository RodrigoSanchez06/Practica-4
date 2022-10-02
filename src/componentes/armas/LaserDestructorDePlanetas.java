package componentes.armas;

public class LaserDestructorDePlanetas extends Armas {

    @Override
    public String nombre() {
        return "Laser Desctructor de Planetas.";
    }

    @Override
    public String descripcion() {
        return "Laser de última generación capaz de destruir todo a su paso.";
    }

    @Override
    public double ataque() {
        return 75.0;
    }

    @Override
    public double defensa() {
        return 20.0;
    }

    @Override
    public double velocidad() {
        return 18.0;
    }

    @Override
    public double peso() {
        return 30.0;
    }

    @Override
    public double precio() {
        return 2500.0;
    }

}
