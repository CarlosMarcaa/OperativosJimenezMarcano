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
 /*
    private Semaphore scriptwriterSemaphore;
    private int dayDuration;
    private int salaryAccount;
    int salary = 40;
    private boolean isWatchingAnime;
    private studio = 
    
    public proyectManager( int dayDuration ) {
        this.dayDuration = dayDuration;
        this.dayCicle = 0;
        this.salaryAccount = 0;
        this.scriptwriterDrive = scriptwriterDrive;
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
                            System.out.println("El equipo de "  + getEmployeeCount() + " guionistas" + " gana: " + salary*24*getEmployeeCount()+"$");
    }

    public drive getScriptwriterDrive() {
        return scriptwriterDrive;
    }
    

 
    public void operate() {
        setDayCicle(getDayCicle() + 1);
        if (getDayCicle() >= 4) {
            try {
                getScriptwriterSemaphore().acquire(); //wait
                int addedAmount = getScriptwriterDrive().add(getEmployeeCount()); //Adds 1 script for each employee in the team the function .add() in drive class returns the added amount to be reported later
                System.out.println("El equipo de "  + getEmployeeCount() + " guionistas" + " agrego " + addedAmount + " guiones a su drive");
                getScriptwriterSemaphore().release(); //wait
                setDayCicle(0);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(scriptwriterTeam.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(scriptwriterTeam.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        
    }

    public Semaphore getScriptwriterSemaphore() {
        return scriptwriterSemaphore;
    }  
*/
}
