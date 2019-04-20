package salvando_walle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * Esta clase realiza la lectura y el paso de datos a las demas clases
 * @author Hugo
 * @version 0.1
 *
 */
public class Lectura {

    private String nombreArchivo = "WallE.in";

    /***
     * Este método se encarga de la lectura del archivo y se pasar sus datos a las demás clases
     *
     */
    public void iniciarLectura() throws FileNotFoundException {
        Scanner entrada = new Scanner(new File("WALLE.in"));
        entrada.useDelimiter("\\s");
        int m, n;
        m = entrada.nextInt();
        n = entrada.nextInt();
        if (m > 100 || n > 100) {
            System.out.println("¡Los limites son mayores a 100! (M y N < 100) Ejecucion terminada incorrectamente");
            System.exit(0);
        }
        else if (m < 1 || n < 1) {
            System.out.println("¡Los limites deben ser mayores a 1 (M y N > 1) Ejecucion terminada incorrectamente");
            System.exit(0);
        }
        else {
            entrada.next();
            Recinto recinto = new Recinto();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    recinto.crearRecinto(i, j, entrada.nextInt());
                }
                entrada.next();
            }
            recinto.setLimiteFilas(n);
            recinto.setLimiteColumnas(m);
            m = entrada.nextInt();
            n = entrada.nextInt();
            recinto.nuevaPosicionX(n - 1);
            recinto.nuevaPosicionY(m - 1);
            entrada.next();
            m = entrada.nextInt();
            n = entrada.nextInt();
            recinto.newWallE(m - 1, n - 1);
            entrada.next();
            char orientacion;
            orientacion = entrada.next().charAt(0);
            if (orientacion != 'N' && orientacion != 'E' && orientacion != 'S' && orientacion != 'O') {
                System.out.println("La orientacion no es correcta, debe ser N, E, S u O. Ejecucion terminada incorrectamente");
                System.exit(0);
            }
            else {
                recinto.nuevaOrientacion(orientacion);
                entrada.next();
                int nInstrucciones = entrada.nextInt();
                if (nInstrucciones > 40){
                    System.out.println("Se supero el limite de instrucciones (>40). Ejecucion terminada incorrectamente");
                }
                else{
                    entrada.next();
                    char priIns = entrada.next().charAt(0);
                    String ins = entrada.nextLine();
                    String[] separado = ins.split("\\s+");
                    for (int i = 0; i < nInstrucciones; i++) {
                        if (i > 0) {
                            if (separado[i].charAt(0) != 'A' && separado[i].charAt(0) != 'I' && separado[i].charAt(0) != 'D'){
                                System.out.println("Hay instrucciones no validads. Ejecucion terminada incorrectamente");
                                System.exit(0);
                            }
                            else{
                                recinto.cargarInstrucciones(i, separado[i].charAt(0));
                            }
                        }
                        else {
                            if (priIns != 'A' && priIns != 'I' && priIns != 'D'){
                                System.out.println("Hay instrucciones no validas. Ejecucion terminada incorrectamente");
                                System.exit(0);
                            }
                            else{
                                recinto.cargarInstrucciones(i, priIns);
                            }
                        }
                    }
                    entrada.close();
                    recinto.empezarWallE(nInstrucciones);
                }
            }
        }
    }
}
