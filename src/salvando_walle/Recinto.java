package salvando_walle;

/***
 *
 * Esta clase es la que se encarga de manejar la matriz en la que se mueve WallE, modificando su posicion y orientacion.
 * @author Hugo
 * @version 0.1
 *
 */
public class Recinto {

    private int limiteFilas;

    private int limiteColumnas;

    private int[][] recintoCompleto = new int [100][100];

    private int posicionWEx;

    private int posicionWEy;

    private char orientacion;

    public Recinto() {
    }

    /***
     * Es el método que se encarga de construir la matriz que conforma al recinto en el que se mueve WallE
     * @param coordX Coordenada x  de donde se ubicará el valor correspondiente a la informacion del archivo
     * @param coordY Coordenada y  de donde se ubicará el valor correspondiente a la informacion del archivo
     * @param valor Es el valor que poseerá la celda en la matriz, ya sea un 0 (Nada) o un 1 (Si es una bomba)
     */
    public void crearRecinto(int coordX, int coordY, int valor){
        recintoCompleto[coordY][coordX] = valor;
    }

    /***
     * Este método define cual es el limite de las filas y para iterar a lo largo de la matriz
     * @param limiF Numero entero que posee el limite de las filas, obtenido del archivo
     */
    public void setLimiteFilas(int limiF) {
        this.limiteFilas = limiF;
    }
    /***
     * Este método define cual es el limite de las columnas y para iterar a lo largo de la matriz
     * @param limiC Numero entero que posee el limite de las columnas, obtenido del archivo
     */
    public void setLimiteColumnas(int limiC) {
        this.limiteColumnas = limiC;
    }

    /***
     * Método que guarda la nueva orientación de WallE luego de un movimiento
     * @param orientacion Es el char que posee la nueva orientación de WallE. Proviene de la clase WallE.
     */
    public void nuevaOrientacion(char orientacion) {

    }

    /***
     * Método que asigna la nueva ubicación en el eje Y de WallE en la matriz
     * @param pY Es un int que posee la ubicación en Y luego de un movimiento, proviente de la clase WallE
     */
    public void nuevaPosicionY(int pY) {

    }
    /***
     * Método que asigna la nueva ubicación en el eje X de WallE en la matriz
     * @param pX Es un int que posee la ubicación en X luego de un movimiento, proviente de la clase WallE
     */
    public void nuevaPosicionX(int pX) {

    }

    /***
     * Es el getter que entrega el limite de las filas
     * @return Retorna el limite de las filas
     */
    public int getlimiteFilas() {
        return limiteFilas;
    }

    /***
     * Es el getter que entrega el limite de las columnas
     * @return Retorna el limite de las columnas
     */
    public int getlimiteColumnas() {
        return limiteColumnas;
    }

    /***
     * Getter que entrega la orientación actual de WallE
     * @return Retorna un char con la orientación
     */
    public char getOrientacion(){
        return orientacion;
    }

    /***
     * Getter que entrega la posición actual en X de WallE
     * @return Retornal la posición X de WallE
     */
    public int getPosicionWEx() {
        return posicionWEx;
    }
    /***
     * Getter que entrega la posición actual en Y de WallE
     * @return Retornal la posición Y de WallE
     */
    public int getPosicionWEy(){
        return  posicionWEy;
    }
}
