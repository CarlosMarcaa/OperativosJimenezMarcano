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
        Semaphore scriptWriter_semaphore = new Semaphore(1);
        drive scriptWriter_drive = new drive(25);
        scriptwriterTeam TeamScriptwriter = new scriptwriterTeam(scriptWriter_semaphore, 5, 3000, scriptWriter_drive);
        TeamScriptwriter.start();
        
        Semaphore setDesigner_semaphore = new Semaphore(1);
        drive setDesigner_drive = new drive(20);
        setDesignerTeam TeamSetDesigner = new setDesignerTeam(setDesigner_semaphore, 2, 3000, setDesigner_drive);
        TeamSetDesigner.start();
        
        Semaphore animator_semaphore = new Semaphore(1);
        drive animator_drive = new drive(55);
        animatorTeam TeamAnimator = new animatorTeam(animator_semaphore, 3, 3000, animator_drive);
        TeamAnimator.start();
        
        Semaphore voiceActor_semaphore = new Semaphore(1);
        drive voiceActor_drive = new drive(35);
        voiceActorTeam TeamVoiceActor = new voiceActorTeam(voiceActor_semaphore, 1, 3000, voiceActor_drive);
        TeamVoiceActor.start();
        
        Semaphore plotTwister_semaphore = new Semaphore(1);
        drive plotTwister_drive = new drive(10);
        plotTwisterTeam TeamPlotTwister = new plotTwisterTeam(plotTwister_semaphore, 1, 3000, plotTwister_drive);
        TeamPlotTwister.start();
        
        Semaphore assembler_semaphore = new Semaphore (1);
        driveAssembler chapterDrive = new driveAssembler(69);
        driveAssembler plotChapterDrive = new driveAssembler(69);
        assemblerTeam assembler = new assemblerTeam(assembler_semaphore, 1, 3000, chapterDrive, 
                                                    animator_semaphore, animator_drive,
                                                    plotTwister_semaphore, plotTwister_drive,
                                                    scriptWriter_semaphore, scriptWriter_drive,
                                                    setDesigner_semaphore, setDesigner_drive,
                                                    voiceActor_semaphore, voiceActor_drive, 1, 3, plotChapterDrive, 2, 1, 4, 4);
        assembler.start();
        
        
    }
    
}
