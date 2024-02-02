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
public class voiceActorTeam extends Thread{
 
    private Semaphore voiceActorSemaphore;
    private int employeeCount;
    private int dayDuration;
    private int dayCicle;
    private int salaryAccount;
    private drive voiceActorDrive;
    int salary = 16;
    
    public voiceActorTeam(Semaphore voiceActorSemaphore, int employeeCount, int dayDuration, drive voiceActorDrive) {
        this.voiceActorSemaphore = voiceActorSemaphore;
        this.employeeCount = employeeCount;
        this.dayDuration = dayDuration;
        this.dayCicle = 0;
        this.salaryAccount = 0;
        this.voiceActorDrive = voiceActorDrive;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getDayCicle() {
        return dayCicle;
    }

    public void setDayCicle(int dayCicle) {
        this.dayCicle = dayCicle;
    }

    public int getSalaryAccount() {
        return salaryAccount;
    }

    public void setSalaryAccount(int salaryAccount) {
        this.salaryAccount = salaryAccount;
    }
    
    public void addDailySalary(){
        setSalaryAccount(
                getSalaryAccount() + salary*24*getEmployeeCount()
        );
                            System.out.println("El equipo de "  + getEmployeeCount() + " actore de doblaje" + " gana: " + salary*24*getEmployeeCount()+"$");
    }

    public drive getVoiceActorDrive() {
        return voiceActorDrive;
    }
    

 
    public void operate() {
        setDayCicle(getDayCicle() + 1);
        if (getDayCicle() >= 1) {
            try {
                getVoiceActorSemaphore().acquire(); //wait
                int addedAmount = getVoiceActorDrive().add(getEmployeeCount()*5); //Adds 5 voice translations for each employee in the team the function .add() in drive class returns the added amount to be reported later
                System.out.println("El equipo de "  + getEmployeeCount() + " actore de doblaje" + " agrego " + addedAmount + " doblajes a su drive");
                getVoiceActorSemaphore().release(); //wait
                setDayCicle(0);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(voiceActorTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
    @Override
    public void run() {
 
            while (true){
            
                try {
                    
                    operate();
                    addDailySalary();
                    sleep(this.dayDuration);                            
                            
                } catch (InterruptedException ex) {
                    Logger.getLogger(voiceActorTeam.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        
    }

    public Semaphore getVoiceActorSemaphore() {
        return voiceActorSemaphore;
    }    
}
