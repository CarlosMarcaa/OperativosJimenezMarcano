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
public class animatorTeam extends Thread {

    private studio studio;
    private int dayCicle;
    int salary = 40;

    public animatorTeam(studio studio) {
        this.studio = studio;
        this.dayCicle = 0;

    }

    public int getEmployeeCount() {
        return studio.getAnimatorEmployeeCount();
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
                getSalaryAccount() + salary * 24 * getEmployeeCount());
        // System.out.println("El equipo de " + getEmployeeCount() + " animadores" + "
        // gana: " + salary*24*getEmployeeCount()+"$");
    }

    public drive getAnimatorDrive() {
        return studio.getAnimatorDrive();
    }

    public void operate() {
        setDayCicle(getDayCicle() + 1);
        if (getDayCicle() >= 1) {
            try {
                getAnimatorSemaphore().acquire(); // wait
                int addedAmount = getAnimatorDrive().add(getEmployeeCount()); // Adds 1 script for each employee in the
                                                                              // team the function .add() in drive class
                                                                              // returns the added amount to be reported
                                                                              // later
                System.out
                        .println("El drive de animaciones tiene " + getAnimatorDrive().getResourse() + " animaciones");
                getAnimatorSemaphore().release(); // wait
                setDayCicle(0);

            } catch (InterruptedException ex) {
                Logger.getLogger(animatorTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void run() {

        while (true) {

            try {

                operate();
                sleep(studio.getDayDuration());
                addDailySalary();
                

            } catch (InterruptedException ex) {
                Logger.getLogger(animatorTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Semaphore getAnimatorSemaphore() {
        return studio.getAnimatorSemaphore();
    }
}
