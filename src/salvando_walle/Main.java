/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salvando_walle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Hugo\\Documents\\GitHub\\Proyecto1\\src\\salvando_walle\\WALLE.in");
        try  {
            Scanner entrada = new Scanner(archivo);
            entrada.useDelimiter("\\s");
            Recinto recinto = new Recinto();

            int y = 0;
            int x = 0;
            while (true){
                recinto.crearRecinto(x, y, Integer.parseInt(entrada.next()));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
