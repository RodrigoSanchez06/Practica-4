package componentes.blindaje;

/**
 * Clase que extiende de Blindaje, y representa a un Blindaje de tipo Blindaje
 * Fortaleza.
 */
public class BlindajeFortaleza extends Blindaje {

    /**
     * Regresa el nombre del componente.
     * 
     * @return nombre del componente.
     */
    @Override
    public String nombre() {

        return "Blindaje Fortaleza";
    }

    /**
     * Regresa la descripción del componente.
     * 
     * @return descripción del componente
     */
    @Override
    public String descripcion() {
        return "Blindaje impenetrable, capaz de resistir algunos disparos de laser destructor de planetas";
    }

    /**
     * Regresa el ataque del componente.
     * 
     * @return ataque del componente.
     */
    @Override
    public double ataque() {
        return 0;
    }

    /**
     * Regresa la defensa del componente.
     * 
     * @return defensa del componente.
     */
    @Override
    public double defensa() {
        return 80.0;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return velocidad del componente.
     */
    @Override
    public double velocidad() {
        return 5.0;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return peso del componente.
     */
    @Override
    public double peso() {
        return 40.0;
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public double precio() {
        return 3125.0;
    }

}
