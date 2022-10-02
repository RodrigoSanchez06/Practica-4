import java.util.LinkedList;

import componentes.Componente;

public class Nave {
    private LinkedList<Componente> componentes = new LinkedList<Componente>();

    public void agregarComponente(Componente comp) {
        this.componentes.add(comp);
    }

    public double obtenCosto() {
        double costo = 0;
        for (Componente com : componentes) {
            costo += com.precio();
        }
        return costo;
    }

    private double obtenAtaque() {
        double ataque = 0;
        for (Componente com : componentes) {
            ataque += com.ataque();
        }
        return ataque;
    }

    private double obtenDefensa() {
        double defensa = 0;
        for (Componente com : componentes) {
            defensa += com.defensa();
        }
        return defensa;
    }

    private double obtenVelocidad() {
        double velocidad = 0;
        for (Componente com : componentes) {
            velocidad += com.velocidad();
        }
        return velocidad;
    }

    private double obtenPeso() {
        double peso = 0;
        for (Componente com : componentes) {
            peso += com.peso();
        }
        return peso;
    }

    public void muestraNave() {
        System.out.println("TU NAVE ES LA SIGUIENTE: ");
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
