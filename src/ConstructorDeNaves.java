import componentes.SistemaDePropulsion.ViajeIntercontinental;
import componentes.SistemaDePropulsion.ViajeIntergalactico;
import componentes.SistemaDePropulsion.ViajeInterplanetario;
import componentes.armas.LaserDestructorDePlanetas;
import componentes.armas.LaserSimple;
import componentes.armas.MisilesDePlasma;
import componentes.blindaje.BlindajeFortaleza;
import componentes.blindaje.BlindajeReforzado;
import componentes.blindaje.BlindajeSimple;
import componentes.cabina.CabinaEjercito;
import componentes.cabina.CabinaTripulacionPequennia;
import componentes.cabina.CabinaUnPiloto;

public class ConstructorDeNaves {

    public Nave armaNaveIndividualDeCombate() {
        Nave nave = new Nave();
        nave.agregarComponente(new LaserSimple());
        nave.agregarComponente(new BlindajeSimple());
        nave.agregarComponente(new CabinaUnPiloto());
        nave.agregarComponente(new ViajeIntercontinental());
        return nave;
    }

    public Nave armaNaveMilitarDeTransporte() {
        Nave nave = new Nave();
        nave.agregarComponente(new MisilesDePlasma());
        nave.agregarComponente(new BlindajeReforzado());
        nave.agregarComponente(new CabinaTripulacionPequennia());
        nave.agregarComponente(new ViajeInterplanetario());
        return nave;
    }

    public Nave armaBaseEspacialDeGuerra() {
        Nave nave = new Nave();
        nave.agregarComponente(new LaserDestructorDePlanetas());
        nave.agregarComponente(new BlindajeFortaleza());
        nave.agregarComponente(new CabinaEjercito());
        nave.agregarComponente(new ViajeIntergalactico());
        return nave;
    }

    public Nave armaTuNave() {
        return null;
    }
}
