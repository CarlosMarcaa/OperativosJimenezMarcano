/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operativosjimenezmarcano;

import Interface.Views;
import Objects.*;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dayDuration = 3000;
        //Cartoon Network Employee amount
        int CNscriptwriter = 5;
        int CNsetDesigner = 4;
        int CNanimator = 2;
        int CNvoiceActor= 3;
        int CNplotTwister = 2;
        int CNassembler = 1;
        studio CartoonNetwork = new studio("Cartoon NetWork", 5, dayDuration, 1, 2, 6, 5,4, 1,CNscriptwriter, CNsetDesigner, CNanimator, CNvoiceActor, CNplotTwister, CNassembler);
        CartoonNetwork.start();
        
    }

}
