package componentes.blindaje;

import componentes.Componente;

/**
 * Clase abstracta que representara a un objeto de tipo blindaje, que implementa
 * a componente.
 */
public abstract class Blindaje implements Componente {

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public abstract double precio();
}
