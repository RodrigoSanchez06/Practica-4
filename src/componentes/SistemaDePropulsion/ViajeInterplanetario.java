package componentes.SistemaDePropulsion;

public class ViajeInterplanetario extends SistemaDePropulsion {

    @Override
    public String nombre() {
        return "Viaje interplanetario.";
    }

    @Override
    public String descripcion() {
        return "Sistema de propulsión de medio alcance capaz de viajar por un sistema solar.";
    }

    @Override
    public double ataque() {
        return 0;
    }

    @Override
    public double defensa() {
        return 13.0;
    }

    @Override
    public double velocidad() {
        return 57.0;
    }

    @Override
    public double peso() {
        return 26.0;
    }

    @Override
    public double precio() {
        return 2570.0;
    }

}
