import java.util.Scanner;

import componentes.SistemaDePropulsion.SistemaDePropulsion;
import componentes.SistemaDePropulsion.ViajeIntercontinental;
import componentes.SistemaDePropulsion.ViajeIntergalactico;
import componentes.SistemaDePropulsion.ViajeInterplanetario;
import componentes.armas.Armas;
import componentes.armas.LaserDestructorDePlanetas;
import componentes.armas.LaserSimple;
import componentes.armas.MisilesDePlasma;
import componentes.blindaje.Blindaje;
import componentes.blindaje.BlindajeFortaleza;
import componentes.blindaje.BlindajeReforzado;
import componentes.blindaje.BlindajeSimple;
import componentes.cabina.Cabina;
import componentes.cabina.CabinaEjercito;
import componentes.cabina.CabinaTripulacionPequennia;
import componentes.cabina.CabinaUnPiloto;

/**
 * Clase que representa a un constructor de naves espaciales, uniendo todos los
 * componentes necesarios.
 */
public class ConstructorDeNaves {

    /**
     * Método Builder especifico para la nave individual de combate. Consiste en una
     * Nave con: laser simple, blindaje simple, cabina de un piloto, y un sistema de
     * propulsion Intercontinental.
     * 
     * @return nave individual de combate.
     */
    public Nave armaNaveIndividualDeCombate() {
        Nave nave = new Nave();
        nave.agregarComponente(new LaserSimple());
        nave.agregarComponente(new BlindajeSimple());
        nave.agregarComponente(new CabinaUnPiloto());
        nave.agregarComponente(new ViajeIntercontinental());
        return nave;
    }

    /**
     * Método Builder especifico para la nave militar de transporte. Consiste en una
     * Nave con: misiles de plasma, Blindaje Reforzado, Cabina de tripulación
     * pequeña y un sistema de propulsión interplanetario.
     * 
     * @return nave militar de transporte.
     */
    public Nave armaNaveMilitarDeTransporte() {
        Nave nave = new Nave();
        nave.agregarComponente(new MisilesDePlasma());
        nave.agregarComponente(new BlindajeReforzado());
        nave.agregarComponente(new CabinaTripulacionPequennia());
        nave.agregarComponente(new ViajeInterplanetario());
        return nave;
    }

    /**
     * Método Builder especifico para una base espacial de guerra. Consiste en una
     * Nave con: Laser destructor de planetas, Blindaje fortaleza, cabina ejercito y
     * un sistema de propulsión intergaláctico.
     * 
     * @return Base espacial de guerra.
     */
    public Nave armaBaseEspacialDeGuerra() {
        Nave nave = new Nave();
        nave.agregarComponente(new LaserDestructorDePlanetas());
        nave.agregarComponente(new BlindajeFortaleza());
        nave.agregarComponente(new CabinaEjercito());
        nave.agregarComponente(new ViajeIntergalactico());
        return nave;
    }

    /**
     * Método Builder para armar una nave personalizada por el usuario, con cada
     * componente a su elección.
     * 
     * @return Nave personalizada.
     */
    public Nave armaTuNave() {
        Nave nave = new Nave();
        System.out.println("*****Comenzando Proceso del Armado de tu nave personalizada*****");
        System.out.println("Comenzaremos con el sistema de armas de tu nave.");
        nave.agregarComponente(colocaArmas());
        System.out.println("Ahora sigue el blindaje de tu nave. ");
        nave.agregarComponente(colocaBlindaje());
        System.out.println("Ahora toca elegir la cabina que deseas.");
        nave.agregarComponente(colocaCabina());
        System.out.println("Finalmente el Sistema de propulsión.");
        nave.agregarComponente(colocaSistemaDePropulsion());
        return nave;
    }

    /**
     * Método que pregunta el tipo de armas que prefiere el usuario.
     * 
     * @return tipo de arma que prefiere el usuario.
     */
    private Armas colocaArmas() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("***¿Que Sistema de armas deseas?***" // Pregunta por sistema de armas.
                + "\n 1 .- Laser Destructor de Planetas."
                + "\n 2 .- Misiles de plasma."
                + "\n 3 .- Laser Simple.");
        while (true) {
            try {
                String opcionUsuario = entrada.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if ((opcion > 0) && (opcion < 4)) { // Válida la opción.
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                            + "\n 1 .- Laser Destructor de Planetas."
                            + "\n 2 .- Misiles de plasma."
                            + "\n 3 .- Laser Simple.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ingresa una opcion valida"
                        + "\n 1 .- Laser Destructor de Planetas."
                        + "\n 2 .- Misiles de plasma."
                        + "\n 3 .- Laser Simple.");
            }
        }
        if (opcion == 1) {
            return new LaserDestructorDePlanetas();
        } else if (opcion == 2) {
            return new MisilesDePlasma();
        } else {
            return new LaserSimple();
        }
    }

    /**
     * Método que pregunta el tipo de blindaje que prefiere el usuario.
     * 
     * @return tipo de blindaje que prefiere el usuario.
     */
    private Blindaje colocaBlindaje() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("***¿Que Sistema de blindaje deseas?***" // Pregunta por sistema de blindaje
                + "\n 1 .- Blindaje Fortaleza."
                + "\n 2 .- Blindaje Reforzado."
                + "\n 3 .- Blindaje Simple.");
        while (true) {// Valida opción
            try {
                String opcionUsuario = entrada.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if ((opcion > 0) && (opcion < 4)) {
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                            + "\n 1 .- Blindaje Fortaleza."
                            + "\n 2 .- Blindaje Reforzado."
                            + "\n 3 .- Blindaje Simple.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ingresa una opcion valida"
                        + "\n 1 .- Blindaje Fortaleza."
                        + "\n 2 .- Blindaje Reforzado."
                        + "\n 3 .- Blindaje Simple.");
            }
        }
        if (opcion == 1) {
            return new BlindajeFortaleza();
        } else if (opcion == 2) {
            return new BlindajeReforzado();
        } else {
            return new BlindajeSimple();
        }
    }

    /**
     * Método que pregunta el tipo de cabina que prefiere el usuario.
     * 
     * @return tipo de cabina que prefiere el usuario.
     */
    private Cabina colocaCabina() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("***¿Que Cabina deseas?***" // Pregunta por tipo de cabina.
                + "\n 1 .- Cabina ejército."
                + "\n 2 .- Cabina Tripulacion pequeña."
                + "\n 3 .- Cambina de un piloto.");
        while (true) {// Valida opcion.
            try {
                String opcionUsuario = entrada.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if ((opcion > 0) && (opcion < 4)) {
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                            + "\n 1 .- Cabina ejército."
                            + "\n 2 .- Cabina Tripulacion pequeña."
                            + "\n 3 .- Cambina de un piloto.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ingresa una opcion valida"
                        + "\n 1 .- Cabina ejército."
                        + "\n 2 .- Cabina Tripulacion pequeña."
                        + "\n 3 .- Cambina de un piloto.");
            }
        }
        if (opcion == 1) {
            return new CabinaEjercito();
        } else if (opcion == 2) {
            return new CabinaTripulacionPequennia();
        } else {
            return new CabinaUnPiloto();
        }
    }

    /**
     * Método que pregunta el tipo de propulsión que prefiere el usuario.
     * 
     * @return tipo de propulsión que prefiere el usuario.
     */
    private SistemaDePropulsion colocaSistemaDePropulsion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("***¿Que Cabina deseas?***" // Pregunta por sistema de propulsión
                + "\n 1 .- Viaje Intergalactico."
                + "\n 2 .- Viaje Planetario."
                + "\n 3 .- Viaje Intercontintental.");
        while (true) {// Valida opcion
            try {
                String opcionUsuario = entrada.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if ((opcion > 0) && (opcion < 4)) {
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                            + "\n 1 .- Viaje Intergalactico."
                            + "\n 2 .- Viaje Planetario."
                            + "\n 3 .- Viaje Intercontintental.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ingresa una opcion valida"
                        + "\n 1 .- Viaje Intergalactico."
                        + "\n 2 .- Viaje Planetario."
                        + "\n 3 .- Viaje Intercontintental.");
            }
        }
        if (opcion == 1) {
            return new ViajeIntergalactico();
        } else if (opcion == 2) {
            return new ViajeInterplanetario();
        } else {
            return new ViajeIntercontinental();
        }
    }
}
