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
        //Views views = new Views();
        Semaphore s_semaphore = new Semaphore(1);
        drive s_drive = new drive(25);
        scriptwriterTeam TeamScriptwriter = new scriptwriterTeam(s_semaphore, 5, 3000, s_drive);
        TeamScriptwriter.start();
        
        Semaphore s2_semaphore = new Semaphore(1);
        drive s2_drive = new drive(20);
        setDesignerTeam TeamSetDesigner = new setDesignerTeam(s2_semaphore, 2, 3000, s2_drive);
        TeamSetDesigner.start();
        
        Semaphore s3_semaphore = new Semaphore(1);
        drive s3_drive = new drive(55);
        animatorTeam TeamAnimator = new animatorTeam(s3_semaphore, 3, 3000, s3_drive);
        TeamAnimator.start();
        
        Semaphore s4_semaphore = new Semaphore(1);
        drive s4_drive = new drive(35);
        voiceActorTeam TeamVoiceActor = new voiceActorTeam(s4_semaphore, 1, 3000, s4_drive);
        TeamVoiceActor.start();
        
        Semaphore s5_semaphore = new Semaphore(1);
        drive s5_drive = new drive(10);
        plotTwisterTeam TeamPlotTwister = new plotTwisterTeam(s5_semaphore, 1, 3000, s5_drive);
        TeamPlotTwister.start();
    }
    
}
