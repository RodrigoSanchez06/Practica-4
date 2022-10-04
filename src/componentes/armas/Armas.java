package componentes.armas;

import componentes.Componente;

/**
 * Clase abstracta que representara a un objeto de tipo arma, que implementa a
 * componente.
 */
public abstract class Armas implements Componente {

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public abstract double precio();

}
