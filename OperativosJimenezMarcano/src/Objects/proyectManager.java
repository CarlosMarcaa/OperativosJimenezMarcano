/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cdmar
 */
public class proyectManager extends Thread{
    int salary = 40;
    studio studio;
    private boolean WatchingAnime;
    private int hourlyCycle;
    public proyectManager(studio studio) {
        this.studio = studio;
        this.WatchingAnime = false;
        this.hourlyCycle = 0;
    }
    
    public void addDailySalary(){
        studio.setSalaryAccount(
                studio.getSalaryAccount() + salary*24
        );
                            
    }
    public void operate() {
        int halfHour = studio.getDayDuration()/48;
        int hour = halfHour*2;
        hourlyCycle = 0;
        while (hourlyCycle < hour*16){ try {
            // For the first 16 hours of the day, he alternates between watching porn and working
            setWatchingAnime(true);
            System.out.println("El proyect Manager esta viendo anime");
            sleep(halfHour);
            setWatchingAnime(false);
            System.out.println("El proyect Manager dejo de ver anime");
            sleep(halfHour);
            setHourlyCycle(getHourlyCycle() + hour);
            
            } catch (InterruptedException ex) {
                Logger.getLogger(proyectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //For the last 8 hours
        setWatchingAnime(false);
        int newDaysLeft = 0;
        if (studio.getDaysLeftRelease() != 0){
                newDaysLeft = studio.getDaysLeftRelease() - 1;
                }else{newDaysLeft = 0;}
        studio.setDaysLeftRelease(newDaysLeft);
        System.out.println("Days left for release: " + studio.getDaysLeftRelease());
        try {       
            sleep(hour*8);
        } catch (InterruptedException ex) {
            Logger.getLogger(proyectManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    @Override    
    public void run() {
 
            while (true){
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
