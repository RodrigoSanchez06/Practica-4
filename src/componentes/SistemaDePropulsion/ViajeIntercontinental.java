package componentes.SistemaDePropulsion;

/**
 * Clase que extiende de SistemaDePropulsion, y representa a un sistema de
 * propulsion de tipo Viaje Intercontinental.
 */
public class ViajeIntercontinental extends SistemaDePropulsion {

    /**
     * Regresa el nombre del componente.
     * 
     * @return nombre del componente.
     */
    @Override
    public String nombre() {
        return "Viaje Intercontinental";
    }

    /**
     * Regresa la descripción del componente.
     * 
     * @return descripción del componente
     */
    @Override
    public String descripcion() {
        return "Sistema de propulsión de bajo rango capaz, de hacer viajes pequeños.";
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
        return 10.0;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return velocidad del componente.
     */
    @Override
    public double velocidad() {
        return 35.0;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return peso del componente.
     */
    @Override
    public double peso() {
        return 19.0;
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public double precio() {
        return 1800.0;
    }

}
