package salvando_walle;


import salvando_walle.Instrucciones;
import salvando_walle.Recinto;
public class WallE {

    private boolean isDestino;

    private boolean isMovimientoValido;

    private Instrucciones[] instruccion = new Instrucciones[40];

    private int destinoX;

    private int destinoY;

    private Recinto recinto;

    public WallE(Recinto recinto) {

    }

    public boolean comprobarDestino() {
        if (destinoX == recinto.nuevaPosicionX() && destinoY == recinto.nuevaPosicionY()){
            this.isDestino = true;
        }
        else{
            this.isMovimientoValido = false;
        }
    }

    public boolean comprobarValidez() {

    }

    public void ejecutarInstruccion(int ordenActual) {
        char charOrdenActual;
        charOrdenActual = instruccion[ordenActual].getInstruccion();
        if (charOrdenActual == 'I'){
            char orientacion = recinto.getOrientacion();
            switch ()
        }
    }

    public void cargarInstrucciones(int orden, char accion){
        instruccion[orden] = new Instrucciones(accion);
    }
}
