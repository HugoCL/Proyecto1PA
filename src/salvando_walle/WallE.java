package salvando_walle;

/***
 * En esta clase de Walle se comprueban sus movimientos, se guardan y se ejectutan sus instrucciones, además se guarda el destino al que debe llegar.
 * @author Hugo
 * @version 0.1
 *
 */
public class WallE {

    private boolean isDestino;

    private boolean isMovimientoValido;

    private Instrucciones[] instruccion = new Instrucciones[40];

    private int destinoX;

    private int destinoY;


    public WallE(Recinto recinto) {
    }

    /***
     * Este método tiene como objetivo el comprobar si el movimiento realizado llevó a WallE a su destino
     * @param instruccion Es un char que se recibe y que entrega la accion que se realizó
     * @return Se retorna true si ya se ha llegado al destino y false en caso contrario
     */
    public boolean comprobarDestino(char instruccion) {
        return true;
    }

    /***
     * El metodo se encarga de realizar una comprobación de la "integridad" de WallE, por si sale de los limites o
     * si tocó una bomba
     * @return Se retorna true si el movimiento es valido (No es una bomba o limite) y false en caso contrario
     */
    public boolean comprobarValidez() {
        return true;
    }

    /***
     * Este método se encarga de hacer las acciones dadas por el archivo, cambiando la posición y/o orientacion de WallE
     * @param ordenActual Es un entero que indica la instruccion a realizar, dada por un orden numérico
     *
     */
    public void ejecutarInstruccion(int ordenActual) {
    }

    /***
     * Este metodo se encarga de cargar las instrucciones en la colleción de instrucciones
     * @param orden Es un int que indica el orden numerico actual de la orden a cargar
     * @param accion Es el char que contiene la instrucción (I, D o A)
     */
    public void cargarInstrucciones(int orden, char accion){

    }
}
