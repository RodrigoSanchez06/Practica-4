package componentes.SistemaDePropulsion;

import componentes.Componente;

/**
 * Clase abstracta que representara a un objeto de tipo Sistema de propulsión,
 * que implementa a componente.
 */
public abstract class SistemaDePropulsion implements Componente {

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public abstract double precio();
}