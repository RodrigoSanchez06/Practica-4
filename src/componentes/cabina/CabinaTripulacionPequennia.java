package componentes.cabina;

public class CabinaTripulacionPequennia extends Cabina {

    @Override
    public String nombre() {
        return "Cabina de Tripulación pequeña";
    }

    @Override
    public String descripcion() {
        return "Cabina mediana con capacidad para un pelotón galáctico.";
    }

    @Override
    public double ataque() {
        return 20.0;
    }

    @Override
    public double defensa() {
        return 18.0;
    }

    @Override
    public double velocidad() {
        return 16.0;
    }

    @Override
    public double peso() {
        return 20.0;
    }

    @Override
    public double precio() {
        return 1780.0;
    }

}