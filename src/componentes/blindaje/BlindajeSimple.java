package componentes.blindaje;

public class BlindajeSimple extends Blindaje {

    @Override
    public String nombre() {
        return "Blindaje Simple";
    }

    @Override
    public String descripcion() {
        return "Blindaje artesanal, capaz de soportar rocas espaciales, y laseres de calibre pequeño";
    }

    @Override
    public double ataque() {
        return 0;
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
        return 19.0;
    }

    @Override
    public double precio() {
        return 1640.0;
    }

}
