/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import Interface.Views;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import operativosjimenezmarcano.Main;

/**
 *
 * @author cdmar
 */
public class proyectManager extends Thread {

    int salary = 40;
    studio studio;
    private boolean WatchingAnime;
    private int hourlyCycle;

    public proyectManager(studio studio) {
        this.studio = studio;
        this.WatchingAnime = false;
        this.hourlyCycle = 0;
    }

    public void addDailySalary() {
        System.out.println("La cuenta antes de pagarle al PM: " + studio.getSalaryAccount() );
        studio.setSalaryAccount(
                studio.getSalaryAccount() + salary * 24);
        // System.out.println("El equipo de " + getEmployeeCount() + " assembler" + "
        // gana: " + salary*24*getEmployeeCount()+"$");
        System.out.println("La cuenta luego de pagarle al PM: " + studio.getSalaryAccount() );
    }

    public void operate() {
        int timeSpent = 0;
        int halfHour = studio.getDayDuration() / 48;
        int hour = studio.getDayDuration() / 24;
        setHourlyCycle(0);
        while (hourlyCycle < 16) {
            try {
                // For the first 16 hours of the day, he alternates between watching porn and
                // working
                setWatchingAnime(true);

                // PRUEBA
                Main.gui.getProjectManagerStatus().setText("Anime");
                Main.gui.getProjectManagerStatusStar().setText("Anime");

                // System.out.println("El proyect Manager esta viendo anime");
                sleep(halfHour);
                timeSpent =+ halfHour;
                setWatchingAnime(false);

                // Prueba
                Main.gui.getProjectManagerStatus().setText("Trabajando");
                Main.gui.getProjectManagerStatusStar().setText("Trabajando");

                // System.out.println("El proyect Manager dejo de ver anime");
                sleep(halfHour);
                timeSpent += halfHour;
                setHourlyCycle(getHourlyCycle() + 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(proyectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // For the last 8 hours, the project manager works to change the days left for
          // release
        setWatchingAnime(false);

        // PRUEBA
        Main.gui.getProjectManagerStatus().setText("Trabajando");
        Main.gui.getProjectManagerStatusStar().setText("Trabajando");

        while (hourlyCycle < 24) {
            try {
                sleep(hour);
                timeSpent += hour;
            } catch (InterruptedException ex) {
                Logger.getLogger(proyectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            setHourlyCycle(getHourlyCycle() + 1);

        } // At the right moment, the project Manager decreases the daysLeftRelease
          // counter
        try {
            sleep(studio.getDayDuration() - timeSpent);
                
            studio.getDaysLeftSemaphore().acquire(); // Hold the semaphore to change the daysLeftRelease counter
            studio.setDaysLeftRelease(studio.getDaysLeftRelease() - 1);
            if (studio.getDaysLeftRelease() < 1) {
                studio.setDaysLeftRelease(0);
            }
            studio.getDaysLeftSemaphore().release(); // Releases the semaphore to change the daysLeftRelease counter
            System.out.println("Days left for release: " + studio.getDaysLeftRelease());

        } catch (InterruptedException ex) {
            Logger.getLogger(proyectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {

        while (true) {
            operate();
            addDailySalary();
        }

    }

    public boolean isWatchingAnime() {
        return WatchingAnime;
    }

    public void setWatchingAnime(boolean WatchingAnime) {
        this.WatchingAnime = WatchingAnime;
    }

    public int getHourlyCycle() {
        return hourlyCycle;
    }

    public void setHourlyCycle(int hourlyCycle) {
        this.hourlyCycle = hourlyCycle;
    }
}
