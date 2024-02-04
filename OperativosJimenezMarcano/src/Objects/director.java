/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import Interface.Views;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import operativosjimenezmarcano.Main;

/**
 *
 * @author cdmar
 */
public class director extends Thread {

    int salary = 60;
    studio studio;
    private boolean checkingPM;
    private int hourlyCycle;

    public director(studio studio) {
        this.studio = studio;
        this.checkingPM = false;
        this.hourlyCycle = 0;
    }

    public void addDailySalary() {
        studio.setSalaryAccount(
                
                studio.getSalaryAccount() + salary * 24
        );
        System.out.println("El director gana " + salary * 24 + "$");
    }

    public void operate() {
        if (studio.getDaysLeftRelease() == 0) {  // If there are 0 days left for release, the director focuses on releasing all episodes
            try {  //Procedure for releasing episodes      
                sleep(studio.getDayDuration()); // The director last 24 hours to release the episodes

                studio.getAssemblerSemaphore().acquire(); //Holds de assembler Semaphore
                int releasedCommonEpisodes = studio.getAssemblerDrive().getResourse();  // Variable for saving temporarily the amount of common episodes released
                studio.getAssemblerDrive().setResourse(0); // Resets common episode drive
                int releasedPlotTwistEpisodes = studio.getPlotAssemblerDrive().getResourse(); // Variable for saving temporarily the amount of plot episodes released
                studio.getPlotAssemblerDrive().setResourse(0);  // Resets plot episode drive
                studio.setEpisodesReleased(studio.getEpisodesReleased() + releasedCommonEpisodes);
                studio.setPlotEpisodesReleased(studio.getPlotEpisodesReleased() + releasedPlotTwistEpisodes);
                int profitsToSum = releasedCommonEpisodes * studio.getCommonEpisodeProfit() + releasedPlotTwistEpisodes * studio.getPlotEpisodeProfit(); // Variable to save the current profits
                System.out.println("El director ha liberado " + releasedCommonEpisodes + " capitulos comunes y " + releasedPlotTwistEpisodes + " capitulos de plotTwist");
                System.out.println("Las ganancias totales de este ciclo, han sido " + profitsToSum + "$");
                studio.setProfits(studio.getProfits() + profitsToSum);
                studio.getDaysLeftSemaphore().acquire();
                studio.setDaysLeftRelease(studio.getDeadlineRatio());
                studio.getDaysLeftSemaphore().release();
                studio.getAssemblerSemaphore().release(); //releases de assembler Semaphore
                if (studio == Main.StarChannel) {
                    Main.gui.getScriptAvailability().setText(String.valueOf(Main.StarChannel.getScriptwriterDrive().getMaxResourse() - Main.StarChannel.getScriptwriterDrive().getResourse()));
                    Main.gui.getDubbingAvailability().setText(String.valueOf(Main.StarChannel.getVoiceActorDrive().getMaxResourse() - Main.StarChannel.getVoiceActorDrive().getResourse()));
                    Main.gui.getStageAvailability().setText(String.valueOf(Main.StarChannel.getSetDesignerDrive().getMaxResourse() - Main.StarChannel.getSetDesignerDrive().getResourse()));
                    Main.gui.getAnimationAvailability().setText(String.valueOf(Main.StarChannel.getAnimatorDrive().getMaxResourse() - Main.StarChannel.getAnimatorDrive().getResourse()));
                    Main.gui.getPlotTwistAvailability().setText(String.valueOf(Main.StarChannel.getPlotTwisterDrive().getMaxResourse() - Main.StarChannel.getPlotTwisterDrive().getResourse()));

                } else {
                    Main.gui.getScriptAvailabilityC().setText(String.valueOf(Main.CartoonNetwork.getScriptwriterDrive().getMaxResourse() - Main.CartoonNetwork.getScriptwriterDrive().getResourse()));
                    Main.gui.getDubbingAvailabilityC().setText(String.valueOf(Main.CartoonNetwork.getVoiceActorDrive().getMaxResourse() - Main.CartoonNetwork.getVoiceActorDrive().getResourse()));
                    Main.gui.getStageAvailability().setText(String.valueOf(Main.StarChannel.getSetDesignerDrive().getMaxResourse() - Main.StarChannel.getSetDesignerDrive().getResourse()));
                    Main.gui.getAnimationAvailabilityC().setText(String.valueOf(Main.CartoonNetwork.getAnimatorDrive().getMaxResourse() - Main.CartoonNetwork.getAnimatorDrive().getResourse()));
                    Main.gui.getPlotTwistAvailabilityC().setText(String.valueOf(Main.CartoonNetwork.getPlotTwisterDrive().getMaxResourse() - Main.CartoonNetwork.getPlotTwisterDrive().getResourse()));

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(director.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else { //If there are more than 0 days left for release, the director will check on the project manajer for 35 minutes

            int halfHour = studio.getDayDuration() / 48;
            int hour = studio.getDayDuration() / 24; // This variable represents 1 hour that will adapt based on the variable dayDuration
            Random random = new Random();
            int randomHour = random.nextInt(24); // Generate a random hour (between 0 and 23)
            hourlyCycle = 0;
            while (hourlyCycle < randomHour) {
                try {
                    setCheckingPM(false);

//                            PRUEBAAAA
                    if (studio == Main.CartoonNetwork) {
                        Main.gui.getDirectorStatus().setText("Administrando");
                    } else {
                        Main.gui.getDirectorStatusStar().setText("Administrando");
                    }

                    sleep(hour);
                } catch (InterruptedException ex) {
                    Logger.getLogger(director.class.getName()).log(Level.SEVERE, null, ex);
                }
                hourlyCycle++;
            }
            if (hourlyCycle == randomHour) { // The director will oberve the project manager for 35 minutes, and he will keep working for the remaining of the day
                setCheckingPM(true);

                //                            PRUEBAAAA
                if (studio == Main.CartoonNetwork) {
                    Main.gui.getDirectorStatus().setText("Supervisando PM");
                } else {
                    Main.gui.getDirectorStatusStar().setText("Supervisando PM");
                }

                try {
                    sleep(halfHour); // Checks the project manajer for 35 minutes

                } catch (InterruptedException ex) {
                    Logger.getLogger(director.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (studio.getProyectManager().isWatchingAnime()) {    //Sees if he is watching anime, if he is, he will punish him ;)
                    studio.setPmFaults(studio.getPmFaults() + 1); // Adds 1 unit to the project manager faults counter in studio

                    studio.setPmDiscountedAmount(studio.getPmDiscountedAmount() + 100);  // Adds 100$ to the project manager discounted total in studio

//                    PRUEBA
                    if (studio == Main.CartoonNetwork) {
                        Main.gui.getProjectManagerFaults().setText(String.valueOf(studio.getPmFaults()));
                        Main.gui.getProjectManagerDeduction().setText(String.valueOf(Main.CartoonNetwork.getPmDiscountedAmount()));
                    } else {
                        Main.gui.getProjectManagerFaultsStar().setText(String.valueOf(studio.getPmFaults()));
                        Main.gui.getProjectManagerDeductionStar().setText(String.valueOf(Main.StarChannel.getPmDiscountedAmount()));
                    }
                    studio.setSalaryAccount(studio.getSalaryAccount() - 100); //Substracts 100$ to the salary account
                    System.out.println("El director atrapo al PM viendo anime");
                }

                try {
                    setCheckingPM(false);

//                            PRUEBAAAA
                    if (studio == Main.CartoonNetwork) {
                        Main.gui.getDirectorStatus().setText("Administrando");
                    } else {
                        Main.gui.getDirectorStatusStar().setText("Administrando");
                    }

                    sleep(halfHour);
                } catch (InterruptedException ex) {
                    Logger.getLogger(director.class.getName()).log(Level.SEVERE, null, ex);
                }
                hourlyCycle++; // By the time the event is over, 1 hour has gone by
                while (hourlyCycle < 24) {
                    try {
                        sleep(hour);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(director.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    hourlyCycle++;
                }

            }

        }

    }

    @Override
    public void run() {

        while (true) {
            operate();
            addDailySalary();
            if (studio == Main.StarChannel) {
                Main.gui.getCosts().setText(String.valueOf(Main.StarChannel.getSalaryAccount()));
                Main.gui.getRevenue().setText(String.valueOf(Main.StarChannel.getProfits()));
                Main.gui.getNetIncome().setText(String.valueOf(Main.StarChannel.getProfits() - Main.StarChannel.getSalaryAccount()));

            } else {
                Main.gui.getCostsC().setText(String.valueOf(Main.CartoonNetwork.getSalaryAccount()));
                Main.gui.getRevenueC().setText(String.valueOf(Main.CartoonNetwork.getProfits()));
                Main.gui.getNetIncomeC().setText(String.valueOf(Main.CartoonNetwork.getProfits() - Main.CartoonNetwork.getSalaryAccount()));

            }
        }

    }

    public int getHourlyCycle() {
        return hourlyCycle;
    }

    public void setHourlyCycle(int hourlyCycle) {
        this.hourlyCycle = hourlyCycle;
    }

    public boolean isCheckingPM() {
        return checkingPM;
    }

    public void setCheckingPM(boolean checkingPM) {
        this.checkingPM = checkingPM;
    }
}
