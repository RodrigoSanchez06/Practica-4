package componentes.SistemaDePropulsion;

/**
 * Clase que extiende de SistemaDePropulsion, y representa a un sistema de
 * propulsion de tipo Viaje Interplanetario.
 */
public class ViajeInterplanetario extends SistemaDePropulsion {

    /**
     * Regresa el nombre del componente.
     * 
     * @return nombre del componente.
     */
    @Override
    public String nombre() {
        return "Viaje interplanetario.";
    }

    /**
     * Regresa la descripción del componente.
     * 
     * @return descripción del componente
     */
    @Override
    public String descripcion() {
        return "Sistema de propulsión de medio alcance capaz de viajar por un sistema solar.";
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
        return 13.0;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return velocidad del componente.
     */
    @Override
    public double velocidad() {
        return 57.0;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return peso del componente.
     */
    @Override
    public double peso() {
        return 26.0;
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public double precio() {
        return 2570.0;
    }

}
