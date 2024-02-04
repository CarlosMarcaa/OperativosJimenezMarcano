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
    public static SimulationData simulationData = (SimulationData) csvManager.ReadText().getHead().getElement();
    public static SimulationData simulationData1 = (SimulationData) csvManager.ReadText().getTail().getElement();

    static int dayDuration = Integer.parseInt((String) simulationData.getSimulationDuration()) * 1000;
    static int deadline = Integer.parseInt((String) simulationData.getDeadline());
    
    static int dayDuration1 = Integer.parseInt((String) simulationData1.getSimulationDuration()) * 1000;
    static int deadline1 = Integer.parseInt((String) simulationData1.getDeadline());


    // Employee amount
    static int scriptwriter = Integer.parseInt((String) simulationData.getScreenwriters());
    static int setDesigner = Integer.parseInt((String) simulationData.getStageDesigner());
    static int animator = Integer.parseInt((String) simulationData.getAnimator());
    static int voiceActor = Integer.parseInt((String) simulationData.getVoiceActors());
    static int plotTwister = Integer.parseInt((String) simulationData.getPlotTwistScriptwriters());
    static int assembler = Integer.parseInt((String) simulationData.getAssemblers());

    static int scriptwriter1 = Integer.parseInt((String) simulationData1.getScreenwriters());
    static int setDesigner1 = Integer.parseInt((String) simulationData1.getStageDesigner());
    static int animator1 = Integer.parseInt((String) simulationData1.getAnimator());
    static int voiceActor1 = Integer.parseInt((String) simulationData1.getVoiceActors());
    static int plotTwister1 = Integer.parseInt((String) simulationData1.getPlotTwistScriptwriters());
    static int assembler1 = Integer.parseInt((String) simulationData1.getAssemblers());
    public static studio CartoonNetwork = new studio("Cartoon Network", 300000, 650000, deadline, dayDuration, 1, 2, 6, 5, 3, 1, scriptwriter, setDesigner, animator, voiceActor, plotTwister, assembler);
    public static studio StarChannel = new studio("Star Channel", 350000, 800000, deadline1, dayDuration1, 2, 3, 4, 6, 3, 1, scriptwriter1, setDesigner1, animator1, voiceActor1, plotTwister1, assembler1);
    public static Views gui = new Views();
//    List fot the chart

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartoonNetwork.start();
        StarChannel.start();
        CartoonNetwork.getDaysGoneBy();
        int counter = 1;

        while (true) {
            // FINANCE
            // CARTOON NETWORK
            gui.getCostsC().setText(String.valueOf(CartoonNetwork.getSalaryAccount()));
            gui.getRevenueC().setText(String.valueOf(CartoonNetwork.getProfits()));
            gui.getNetIncomeC().setText(String
                    .valueOf(Main.CartoonNetwork.getProfits() - CartoonNetwork.getSalaryAccount()));
            // STAR CHANNEL
            gui.getCosts().setText(String.valueOf(StarChannel.getSalaryAccount()));
            gui.getRevenue().setText(String.valueOf(StarChannel.getProfits()));
            gui.getNetIncome().setText(
                    String.valueOf(StarChannel.getProfits() - StarChannel.getSalaryAccount()));

            // FAULTS & DEDUCTIONS
            // CARTOON NETWORK
            gui.getProjectManagerFaults().setText(String.valueOf(CartoonNetwork.getPmFaults()));
            gui.getProjectManagerDeduction()
                    .setText(String.valueOf(CartoonNetwork.getPmDiscountedAmount()));
            // STAR CHANNEL
            gui.getProjectManagerFaultsStar().setText(String.valueOf(StarChannel.getPmFaults()));
            gui.getProjectManagerDeductionStar()
                    .setText(String.valueOf(StarChannel.getPmDiscountedAmount()));

            // DRIVE AVAILABILITY
            // CARTOON NETWORK
            gui.getScriptAvailability()
                    .setText(String.valueOf(StarChannel.getScriptwriterDrive().getMaxResourse()
                            - StarChannel.getScriptwriterDrive().getResourse()));
            gui.getDubbingAvailability()
                    .setText(String.valueOf(StarChannel.getVoiceActorDrive().getMaxResourse()
                            - StarChannel.getVoiceActorDrive().getResourse()));
            gui.getStageAvailability()
                    .setText(String.valueOf(StarChannel.getSetDesignerDrive().getMaxResourse()
                            - StarChannel.getSetDesignerDrive().getResourse()));
            gui.getAnimationAvailability()
                    .setText(String.valueOf(StarChannel.getAnimatorDrive().getMaxResourse()
                            - StarChannel.getAnimatorDrive().getResourse()));
            gui.getPlotTwistAvailability()
                    .setText(String.valueOf(StarChannel.getPlotTwisterDrive().getMaxResourse()
                            - StarChannel.getPlotTwisterDrive().getResourse()));
            // STAR CHANNEL
            gui.getScriptAvailabilityC()
                    .setText(String.valueOf(CartoonNetwork.getScriptwriterDrive().getMaxResourse()
                            - CartoonNetwork.getScriptwriterDrive().getResourse()));
            gui.getDubbingAvailabilityC()
                    .setText(String.valueOf(CartoonNetwork.getVoiceActorDrive().getMaxResourse()
                            - CartoonNetwork.getVoiceActorDrive().getResourse()));
            gui.getAnimationAvailabilityC()
                    .setText(String.valueOf(CartoonNetwork.getAnimatorDrive().getMaxResourse()
                            - CartoonNetwork.getAnimatorDrive().getResourse()));
            gui.getPlotTwistAvailabilityC()
                    .setText(String.valueOf(CartoonNetwork.getPlotTwisterDrive().getMaxResourse()
                            - CartoonNetwork.getPlotTwisterDrive().getResourse()));
            gui.getStageAvailabilityC()
                    .setText(String.valueOf(CartoonNetwork.getSetDesignerDrive().getMaxResourse()
                            - CartoonNetwork.getSetDesignerDrive().getResourse()));

            // READY
            // CARTOON NETWORK
            gui.getReadyPlotTwist()
                    .setText(String.valueOf(CartoonNetwork.getPlotAssemblerDrive().getResourse()));
            gui.getReadyStandard()
                    .setText(String.valueOf(CartoonNetwork.getAssemblerDrive().getResourse()));
            // STAR CHANNEL
            gui.getReadyPlotTwistStar()
                    .setText(String.valueOf(StarChannel.getPlotAssemblerDrive().getResourse()));
            gui.getReadyStandardStar()
                    .setText(String.valueOf(StarChannel.getAssemblerDrive().getResourse()));

            // DEADLINE COUNTER
            // CARTOON NETWORK
            gui.getDeadlineCounter().setText(String.valueOf(CartoonNetwork.getDaysLeftRelease()));
            // STAR CHANNEL
            gui.getDeadlineCounterStar().setText(String.valueOf(StarChannel.getDaysLeftRelease()));

        }
    }

}
