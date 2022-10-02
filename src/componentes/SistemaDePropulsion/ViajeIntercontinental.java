package componentes.SistemaDePropulsion;

public class ViajeIntercontinental extends SistemaDePropulsion {

    @Override
    public String nombre() {
        return "Viaje Intercontinental";
    }

    @Override
    public String descripcion() {
        return "Sistema de propulsión de bajo rango capaz, de hacer viajes pequeños.";
    }

    @Override
    public double ataque() {
        return 0;
    }

    @Override
    public double defensa() {
        return 10.0;
    }

    @Override
    public double velocidad() {
        return 35.0;
    }

    @Override
    public double peso() {
        return 19.0;
    }

    @Override
    public double precio() {
        return 1800.0;
    }

}
