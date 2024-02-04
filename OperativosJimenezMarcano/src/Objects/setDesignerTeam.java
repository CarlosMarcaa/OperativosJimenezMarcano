/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import operativosjimenezmarcano.Main;

/**
 *
 * @author cdmar
 */
public class setDesignerTeam extends Thread {

    private studio studio;
    private int dayCicle;
    int salary = 26;

    public setDesignerTeam(studio studio) {
        this.studio = studio;
        this.dayCicle = 0;

    }

    public int getEmployeeCount() {
        return studio.getSetDesignerEmployeeCount();
    }

    public int getDayDuration() {
        return studio.getDayDuration();
    }

    public int getDayCicle() {
        return dayCicle;
    }

    public void setDayCicle(int dayCicle) {
        this.dayCicle = dayCicle;
    }

    public int getSalaryAccount() {
        return studio.getSalaryAccount();
    }

    public void setSalaryAccount(int salaryAccount) {
        studio.setSalaryAccount(salaryAccount);
    }

    public void addDailySalary() {
        setSalaryAccount(
                getSalaryAccount() + salary * 24 * getEmployeeCount()
        );
        //System.out.println("El equipo de "  + getEmployeeCount() + " diseñadores de escenarios" + " gana: " + salary*24*getEmployeeCount()+"$");
    }

    public drive getSetDesignerDrive() {
        return studio.getSetDesignerDrive();
    }

    public void operate() {
        setDayCicle(getDayCicle() + 1);
        if (getDayCicle() >= 4) {
            try {
                getSetDesignerSemaphore().acquire(); //wait
                int addedAmount = getSetDesignerDrive().add(getEmployeeCount()); //Adds 1 script for each employee in the team the function .add() in drive class returns the added amount to be reported later
                System.out.println("El drive de escenarios tiene " + getSetDesignerDrive().getResourse() + " escenarios");
                getSetDesignerSemaphore().release(); //wait
                setDayCicle(0);

                if (studio == Main.StarChannel) {
                    Main.gui.getStageAvailability().setText(String.valueOf(Main.StarChannel.getSetDesignerDrive().getMaxResourse() - Main.StarChannel.getSetDesignerDrive().getResourse()));
                } else {
                    Main.gui.getStageAvailabilityC().setText(String.valueOf(Main.CartoonNetwork.getSetDesignerDrive().getMaxResourse() - Main.CartoonNetwork.getSetDesignerDrive().getResourse()));
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(setDesignerTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {
        while (true) {

            try {
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
                sleep(studio.getDayDuration());

            } catch (InterruptedException ex) {
                Logger.getLogger(setDesignerTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Semaphore getSetDesignerSemaphore() {
        return studio.getSetDesignerSemaphore();
    }
}
