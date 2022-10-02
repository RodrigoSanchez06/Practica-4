package componentes.cabina;

public class CabinaUnPiloto extends Cabina {

    @Override
    public String nombre() {
        return "Cabina Un Piloto";
    }

    @Override
    public String descripcion() {
        return "Cabina con capacidad para un solo tripulante galáctico.";
    }

    @Override
    public double ataque() {
        return 12.0;
    }

    @Override
    public double defensa() {
        return 10.0;
    }

    @Override
    public double velocidad() {
        return 8.0;
    }

    @Override
    public double peso() {
        return 10.0;
    }

    @Override
    public double precio() {
        return 880.0;
    }

}
