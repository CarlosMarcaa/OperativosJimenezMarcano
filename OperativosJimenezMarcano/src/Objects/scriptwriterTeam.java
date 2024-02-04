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
public class scriptwriterTeam extends Thread {

    studio studio;
    int salary = 20;
    private int dayCicle;

    public scriptwriterTeam(studio studio) {
        this.studio = studio;
    }

    public int getEmployeeCount() {
        return studio.getScriptwriterEmployeeCount();
    }

    public void setEmployeeCount(int employeeCount) {
        studio.setScriptwriterEmployeeCount(employeeCount);
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
        System.out.println("El equipo de "  + getEmployeeCount() + " guionistas" + " gana: " + salary*24*getEmployeeCount()+"$");
    }

    public drive getScriptwriterDrive() {
        return studio.getScriptwriterDrive();
    }

    public void operate() {
        setDayCicle(getDayCicle() + 1);
        if (getDayCicle() >= 4) {
            try {

                getScriptwriterSemaphore().acquire(); //wait
                int addedAmount = getScriptwriterDrive().add(getEmployeeCount()); //Adds 1 script for each employee in the team the function .add() in drive class returns the added amount to be reported later
                System.out.println("El drive de guionistas tiene " + getScriptwriterDrive().getResourse() + " guiones");
                if (studio == Main.StarChannel) {
                    Main.gui.getScriptAvailability().setText(String.valueOf(Main.StarChannel.getScriptwriterDrive().getMaxResourse() - Main.StarChannel.getScriptwriterDrive().getResourse()));
                } else {
                    Main.gui.getScriptAvailabilityC().setText(String.valueOf(Main.CartoonNetwork.getScriptwriterDrive().getMaxResourse() - Main.CartoonNetwork.getScriptwriterDrive().getResourse()));
                }
                getScriptwriterSemaphore().release(); //wait
                setDayCicle(0);

            } catch (InterruptedException ex) {
                Logger.getLogger(scriptwriterTeam.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(scriptwriterTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Semaphore getScriptwriterSemaphore() {
        return studio.getScriptwriterSemaphore();
    }
}
