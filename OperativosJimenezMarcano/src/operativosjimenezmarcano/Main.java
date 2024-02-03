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
        int dayDuration = 1500;
        //Cartoon Network Employee amount
        int CNscriptwriter = 10;
        int CNsetDesigner = 10;
        int CNanimator = 3;
        int CNvoiceActor= 3;
        int CNplotTwister = 5;
        int CNassembler = 2;
        studio CartoonNetwork = new studio("Cartoon NetWork",450000,500000, 5, dayDuration, 1, 2, 6, 5,5, 1,CNscriptwriter, CNsetDesigner, CNanimator, CNvoiceActor, CNplotTwister, CNassembler);
        CartoonNetwork.start();
        /*scriptwriterTeam test = new scriptwriterTeam(CartoonNetwork);
        test.start();
        CartoonNetwork.getScriptwriterDrive().setResourse(15);
        CartoonNetwork.getScriptwriterDrive().substract(10);*/
        
        
    }

}
