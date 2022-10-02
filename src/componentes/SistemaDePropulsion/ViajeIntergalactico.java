package componentes.SistemaDePropulsion;

public class ViajeIntergalactico extends SistemaDePropulsion {

    @Override
    public String nombre() {
        return "Viaje Inter Galáctico";
    }

    @Override
    public String descripcion() {
        return "Sistema de propulsión de alto alcance, capaz de viajar por galaxias enteras.";
    }

    @Override
    public double ataque() {
        return 0;
    }

    @Override
    public double defensa() {
        return 18.0;
    }

    @Override
    public double velocidad() {
        return 88.0;
    }

    @Override
    public double peso() {
        return 37.0;
    }

    @Override
    public double precio() {
        return 3680.0;
    }

}
