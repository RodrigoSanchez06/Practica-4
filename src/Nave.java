import java.util.LinkedList;

import componentes.Componente;

/**
 * Clase que representa a una nave espacial, que puede poseer distintos
 * componentes.
 */
public class Nave {
    // Lista de componentes que conforman la nave.
    private LinkedList<Componente> componentes = new LinkedList<Componente>();

    /**
     * Agrega un componente a la nave.
     * 
     * @param comp componente a agregar.
     */
    public void agregarComponente(Componente comp) {
        this.componentes.add(comp);
    }

    /**
     * Obtiene el costo total de la nave dependiendo de cada componente y lo
     * devuelve.
     * 
     * @return costo total de la nave.
     */
    public double obtenCosto() {
        double costo = 0;
        for (Componente com : componentes) {
            costo += com.precio();
        }
        return costo;
    }

    /**
     * Obtiene el ataque total de la nave dependiento de cada componente y lo
     * devuelve.
     * 
     * @return ataque total de la nave
     */
    private double obtenAtaque() {
        double ataque = 0;
        for (Componente com : componentes) {
            ataque += com.ataque();
        }
        return ataque;
    }

    /**
     * Obtiene la defensa total de la nave dependiento de cada componente y la
     * devuelve.
     * 
     * @return defensa total de la nave
     */
    private double obtenDefensa() {
        double defensa = 0;
        for (Componente com : componentes) {
            defensa += com.defensa();
        }
        return defensa;
    }

    /**
     * Obtiene la velocidad total de la nave dependiento de cada componente y la
     * devuelve.
     * 
     * @return velocidad total de la nave
     */
    private double obtenVelocidad() {
        double velocidad = 0;
        for (Componente com : componentes) {
            velocidad += com.velocidad();
        }
        return velocidad;
    }

    /**
     * Obtiene el peso de la nave dependiento de cada componente y la
     * devuelve.
     * 
     * @return peso total de la nave
     */
    private double obtenPeso() {
        double peso = 0;
        for (Componente com : componentes) {
            peso += com.peso();
        }
        return peso;
    }

    /**
     * Muestra cada componente de la nave, y el total de cada una de sus
     * caracterísiticas
     */
    public void muestraNave() {
        for (Componente com : componentes) {
            System.out.println("*********************************");
            System.out.println("Componente: " + com.nombre());
            System.out.println("Descripción: " + com.descripcion());
            System.out.println("Ataque: " + com.ataque());
            System.out.println("defensa: " + com.defensa());
            System.out.println("velocidad: " + com.velocidad());
            System.out.println("peso: " + com.peso());
            System.out.println("precio: " + com.precio());
            System.out.println("*********************************");
        }
        System.out.println("\nAtaque TOTAL: " + obtenAtaque());
        System.out.println("defensa TOTAL: " + obtenDefensa());
        System.out.println("velocidad TOTAL: " + obtenVelocidad());
        System.out.println("peso TOTAL: " + obtenPeso());
    }
}
