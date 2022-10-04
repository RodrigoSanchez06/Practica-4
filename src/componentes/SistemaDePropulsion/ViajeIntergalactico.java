package componentes.SistemaDePropulsion;

/**
 * Clase que extiende de SistemaDePropulsion, y representa a un sistema de
 * propulsion de tipo Viaje Intergalactico.
 */
public class ViajeIntergalactico extends SistemaDePropulsion {

    /**
     * Regresa el nombre del componente.
     * 
     * @return nombre del componente.
     */
    @Override
    public String nombre() {
        return "Viaje Inter Galáctico";
    }

    /**
     * Regresa la descripción del componente.
     * 
     * @return descripción del componente
     */
    @Override
    public String descripcion() {
        return "Sistema de propulsión de alto alcance, capaz de viajar por galaxias enteras.";
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
        return 18.0;
    }

    /**
     * Regresa la velocidad del componente.
     * 
     * @return velocidad del componente.
     */
    @Override
    public double velocidad() {
        return 88.0;
    }

    /**
     * Regresa el peso del componente.
     * 
     * @return peso del componente.
     */
    @Override
    public double peso() {
        return 37.0;
    }

    /**
     * Regresa el precio del componente.
     * 
     * @return precio del componente.
     */
    @Override
    public double precio() {
        return 3680.0;
    }

}
