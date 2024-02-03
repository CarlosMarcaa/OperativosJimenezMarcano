/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operativosjimenezmarcano;

import DataManagement.CsvManager;
import Interface.Views;
import Objects.*;

/**
 *
 * @author Miguel
 */
public class Main {

    public static CsvManager csvManager = new CsvManager();
    public static SimulationData simulationData = (SimulationData) csvManager.ReadText();

    static int dayDuration = Integer.parseInt((String) simulationData.getSimulationDuration()) * 1000;
    static int deadline = Integer.parseInt((String) simulationData.getDeadline());

    // Employee amount
    static int scriptwriter = Integer.parseInt((String) simulationData.getScreenwriters());
    static int setDesigner = Integer.parseInt((String) simulationData.getStageDesigner());
    static int animator = Integer.parseInt((String) simulationData.getAnimator());
    static int voiceActor = Integer.parseInt((String) simulationData.getVoiceActors());
    static int plotTwister = Integer.parseInt((String) simulationData.getPlotTwistScriptwriters());
    static int assembler = Integer.parseInt((String) simulationData.getAssemblers());
    public static studio CartoonNetwork = new studio("Cartoon Network", 300000, 650000, deadline, dayDuration, 1, 2, 6,
            5, 3, 1, scriptwriter, setDesigner, animator, voiceActor, plotTwister, assembler);
    public static studio StarChannel = new studio("Star Channel", 350000, 800000, deadline, dayDuration, 2, 3, 4, 6, 3,
            1, scriptwriter, setDesigner, animator, voiceActor, plotTwister, assembler);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Views gui = new Views();
        CartoonNetwork.start();

    }

}
