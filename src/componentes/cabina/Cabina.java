package componentes.cabina;

import componentes.Componente;

/**
 * Clase abstracta que representara a un objeto de tipo Cabina, que implementa
 * a componente.
 */
public abstract class Cabina implements Componente {

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public abstract double precio();
}
