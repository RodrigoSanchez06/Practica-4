package componentes;

/**
 * Interfaz que define el comportamiento de un Componente de una Nave Espacial.
 */
public interface Componente {

    /**
     * Regresa el nombre del componente.
     * 
     * @return nombre del componente.
     */
    public String nombre();

    /**
     * Regresa la descripción del componente.
     * 
     * @return descripción del componente
     */
    public String descripcion();

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    public double precio();

    /**
     * Regresa el ataque del componente.
     * 
     * @return ataque del componente.
     */
    public double ataque();

    /**
     * Regresa la defensa del componente.
     * 
     * @return defensa del componente.
     */
    public double defensa();

    /**
     * Regresa la velocidad del componente.
     * 
     * @return velocidad del componente.
     */
    public double velocidad();

    /**
     * Regresa el peso del componente.
     * 
     * @return peso del componente.
     */
    public double peso();
}
