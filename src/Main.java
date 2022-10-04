import java.util.Scanner;

/**
 * Clase Principal de SpaceShip Builder.
 */
public class Main {
    public static void main(String[] args) {
        ConstructorDeNaves constructor = new ConstructorDeNaves();
        // Colorcitos para terminal.
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";

        Scanner entrada = new Scanner(System.in);

        System.out.println("*****BIENVENIDO A Spaceship Builder*****");
        System.out.println("Para comenzar introduce tu presupuesto: ");
        double presupuesto;
        while (true) { // Pregunta presupuesto y lo valida.
            try {
                String opcionUsuario = entrada.nextLine();
                presupuesto = Double.parseDouble(opcionUsuario);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Ingresa un presupuesto válido.");
            }
        }
        boolean naveLista = false;
        Nave nave = constructor.armaTuNave();
        do {
            if (nave.obtenCosto() < presupuesto) { // Si el presupuesto es mayor entonces se arma la nave.
                System.out.println("*****GRACIAS POR ARMAR TU NAVE CON NOSOTROS*****");
                System.out.println("Tu nave está lista para recoger, estas son sus características: ");
                nave.muestraNave();
                System.out.println("PAGA EN CAJA LA CANIDAD DE: " + nave.obtenCosto() + "$");
                break;
            } else { // Si no alcanza se dan más opciones.
                nave.muestraNave();
                System.out.println("COSTO TOTAL: " + nave.obtenCosto());
                System.out.println("LO SENTIMOS. El costo de tu nave sobrepasa tu presupuesto :(");
                System.out.println("Selecciona alguna de las siguientes opciones: "
                        + "\n1 .- Diseñar otra nave. " +
                        "\n2 .- Ver nuestro catálogo." +
                        "\n3 .- SALIR");
                int seleccionBajoPresupuesto;
                while (true) {
                    try { // Valida la seleccion de un bajo presupuesto
                        String opcionUsuario = entrada.nextLine();
                        seleccionBajoPresupuesto = Integer.parseInt(opcionUsuario);
                        if ((seleccionBajoPresupuesto > 0) && (seleccionBajoPresupuesto < 4))
                            break;
                        System.out.println("Opcion no válida. intente de nuevo.");
                    } catch (NumberFormatException ex) {
                        System.out.println("Ingresa una opción Válida: "
                                + "\n1 .- Diseñar otra nave. " +
                                "\n2 .- Ver nuestro catálogo." +
                                "\n3 .- SALIR");
                    }
                }
                if (seleccionBajoPresupuesto == 1) { // Diseña otra nave.
                    nave = constructor.armaTuNave();
                    continue;
                } else if (seleccionBajoPresupuesto == 2) { // Da a enseñar el catálogo.
                    Nave naveIndividualDeCombate = constructor.armaNaveIndividualDeCombate();
                    Nave naveMilitarDeTransporte = constructor.armaNaveMilitarDeTransporte();
                    Nave BaseEspacialDeGuerra = constructor.armaBaseEspacialDeGuerra();
                    System.out.println("Aquí está nuestro catálogo. ");
                    System.out.println(ANSI_RED + "\n*****OPCION 1*****" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "NAVE INDIVIDUAL DE COMBATE" + ANSI_RESET);
                    naveIndividualDeCombate.muestraNave();
                    System.out.println("COSTO TOTAL: " + naveIndividualDeCombate.obtenCosto());

                    System.out.println(ANSI_RED + "\n*****OPCION 2*****" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "NAVE MILITAR DE TRANSPORTE " + ANSI_RESET);
                    naveMilitarDeTransporte.muestraNave();
                    System.out.println("COSTO TOTAL: " + naveMilitarDeTransporte.obtenCosto());

                    System.out.println(ANSI_RED + "\n*****OPCION 3*****" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "BASE ESPACIAL DE GUERRA" + ANSI_RESET);
                    BaseEspacialDeGuerra.muestraNave();
                    System.out.println("COSTO TOTAL: " + BaseEspacialDeGuerra.obtenCosto());

                    int opcionCatalogo;
                    System.out.println("\nELIGE ALGUNA OPCIÓN DE NUESTRO CATÁLOGO.");
                    while (true) {
                        try {
                            String opcionUsuario = entrada.nextLine();
                            opcionCatalogo = Integer.parseInt(opcionUsuario);
                            if ((opcionCatalogo > 0) && (opcionCatalogo < 4))
                                break;
                            System.out.println("Opcion no válida. intente de nuevo.");
                        } catch (NumberFormatException ex) {
                            System.out.println("Ingresa una opción válida.");
                            System.out.println("*****OPCION 1*****");
                            naveIndividualDeCombate.muestraNave();
                            System.out.println("*****OPCION 2*****");
                            naveMilitarDeTransporte.muestraNave();
                            System.out.println("*****OPCION 3*****");
                            BaseEspacialDeGuerra.muestraNave();
                        }
                    }
                    if (opcionCatalogo == 1) {
                        nave = naveIndividualDeCombate;
                    } else if (opcionCatalogo == 2) {
                        nave = naveMilitarDeTransporte;
                    } else {
                        nave = BaseEspacialDeGuerra;
                    }
                } else {
                    naveLista = true; // Salir del programa.
                }
            }
        } while (!naveLista);
        System.out.println("SIMULACIÓN TERMINADA.");
    }
}
