package componentes.cabina;

/**
 * Clase que extiende de Cabina, y representa a una cabina de tipo Cabina
 * Tripulación pequeña.
 */
public class CabinaTripulacionPequennia extends Cabina {

    /**
     * Regresa el nombre del componente.
     * 
     * @return nombre del componente.
     */
    @Override
    public String nombre() {
        return "Cabina de Tripulación pequeña";
    }

    /**
     * Regresa la descripción del componente.
     * 
     * @return descripción del componente
     */
    @Override
    public String descripcion() {
        return "Cabina mediana con capacidad para un pelotón galáctico.";
    }

    /**
     * Regresa el ataque del componente.
     * 
     * @return ataque del componente.
     */
    @Override
    public double ataque() {
        return 20.0;
    }

    /**
     * Regresa la defensa del componente.
     * 
     * @return defensa del componente.
     */
    @Override
    public double defensa() {
        return 18.0;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return velocidad del componente.
     */
    @Override
    public double velocidad() {
        return 16.0;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return peso del componente.
     */
    @Override
    public double peso() {
        return 20.0;
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public double precio() {
        return 1780.0;
    }

}