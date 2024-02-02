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
public class plotTwisterTeam extends Thread{
 
    private Semaphore plotTwisterSemaphore;
    private int employeeCount;
    private int dayDuration;
    private int dayCicle;
    private int salaryAccount;
    private drive plotTwisterDrive;
    int salary = 34;
    
    public plotTwisterTeam(Semaphore plotTwisterSemaphore, int employeeCount, int dayDuration, drive plotTwisterDrive) {
        this.plotTwisterSemaphore = plotTwisterSemaphore;
        this.employeeCount = employeeCount;
        this.dayDuration = dayDuration;
        this.dayCicle = 0;
        this.salaryAccount = 0;
        this.plotTwisterDrive = plotTwisterDrive;
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
                            System.out.println("El equipo de "  + getEmployeeCount() + " guionistas de plotTwist" + " gana: " + salary*24*getEmployeeCount()+"$");
    }

    public drive getPlotTwisterDrive() {
        return plotTwisterDrive;
    }
    

 
    public void operate() {
        setDayCicle(getDayCicle() + 1);
        if (getDayCicle() >= 2) {
            try {
                getPlotTwisterSemaphore().acquire(); //wait
                int addedAmount = getPlotTwisterDrive().add(getEmployeeCount()); //Adds 1 script for each employee in the team the function .add() in drive class returns the added amount to be reported later
                System.out.println("El equipo de "  + getEmployeeCount() + " guionistas de plotTwist" + " agrego " + addedAmount + " guiones de plotTwist a su drive");
                getPlotTwisterSemaphore().release(); //wait
                setDayCicle(0);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(plotTwisterTeam.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(plotTwisterTeam.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        
    }

    public Semaphore getPlotTwisterSemaphore() {
        return plotTwisterSemaphore;
    }
}
