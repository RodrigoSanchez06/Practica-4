package componentes.armas;

public class MisilesDePlasma extends Armas {

    @Override
    public String nombre() {
        return "Misiles De Plasma.";
    }

    @Override
    public String descripcion() {
        return "Misiles de grado militar capaces de destruir naves de tamaño mediano.";
    }

    @Override
    public double ataque() {
        return 50.0;
    }

    @Override
    public double defensa() {
        return 15.0;
    }

    @Override
    public double velocidad() {
        return 13.0;
    }

    @Override
    public double peso() {
        return 25.0;
    }

    @Override
    public double precio() {
        return 1780.00;
    }

}
