package salvando_walle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Recinto {

    private int limiteFilas;

    private int limiteColumnas;

    private int[][] recinto = new int [100][100];

    private int posicionWEx;

    private int posicionWEy;

    private char orientacion;

    public Recinto() {
    }

    public void crearRecinto(int coordX, int coordY, int valor){
        recinto[coordY][coordX] = valor;
    }
    public void setlimiteFilas(int limiF) {
        this.limiteFilas = limiF;
    }

    public void setlimiteColumnas(int limiC) {
      this.limiteColumnas = limiC;
    }

    public int nuevaOrientacion() {

    }

    public int nuevaPosicionY() {

    }

    public int nuevaPosicionX() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getlimiteFilas() {
      return limiteFilas;
    }

    public int getlimiteColumnas() {
      return limiteColumnas;
    }
    public char getOrientacion(){
        return orientacion;
    }
}
