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
public class assemblerTeam extends Thread{
 
    private Semaphore assemblerSemaphore;
    private Semaphore animatorSemaphore;
    private Semaphore plotTwisterSemaphore;
    private Semaphore scriptwriterSemaphore;
    private Semaphore setDesignerSemaphore;
    private Semaphore voiceActorSemaphore;
    private drive animatorDrive;
    private drive plotTwisterDrive;
    private drive scriptwriterDrive;
    private drive setDesignerDrive;
    private drive voiceActorDrive;
    private int employeeCount;
    private int dayDuration;
    private int dayCicle;
    private int episodeCicle;
    private int salaryAccount;
    private driveAssembler assemblerDrive;
    private driveAssembler plotAssemblerDrive;
    int salary = 50;
    private int scriptReq;      //This int represents the amount of scripts required to assemble an episode
    private int sceneryReq;  //This int represents the amount of scenerys required to assemble an episode
    private int animationReq;     //This int represents the amount of animations required to assemble an episode
    private int dubReq;     //This int represents the amount of dubs required to assemble an episode
    private int plotEpisodeRatio;    //This int represents the ratio of common episodes per plotTwist episode
    private int plotTwistsAmount;  //This int represent the amount of plotTwists per plotTwist episode
    
    public assemblerTeam(Semaphore assemblerSemaphore, int employeeCount, int dayDuration, driveAssembler assemblerDrive, Semaphore animatorSemaphore,
                         drive animatorDrive, Semaphore plotTwisterSemaphore, drive plotTwisterDrive, Semaphore scriptwriterSemaphore,
                         drive scriptwriterDrive, Semaphore setDesignerSemaphore, drive setDesignerDrive, Semaphore voiceActorSemaphore, drive voiceActorDrive, int plotTwistsAmount, int plotEpisodeRatio,
                         driveAssembler plotAssemblerDrive, int scriptReq, int sceneryReq, int animationReq, int dubReq ) {
        
        this.assemblerSemaphore = assemblerSemaphore;
        this.employeeCount = employeeCount;
        this.dayDuration = dayDuration;
        this.dayCicle = 0;
        this.episodeCicle = 0;        
        this.salaryAccount = 0;
        this.assemblerDrive = assemblerDrive;
        this.animatorSemaphore = animatorSemaphore;
        this.animatorDrive = animatorDrive;
        this.plotTwisterSemaphore = plotTwisterSemaphore;
        this.plotTwisterDrive = plotTwisterDrive;
        this.scriptwriterSemaphore = scriptwriterSemaphore;
        this.scriptwriterDrive = scriptwriterDrive;
        this.setDesignerSemaphore = setDesignerSemaphore;
        this.setDesignerDrive = setDesignerDrive;
        this.voiceActorSemaphore = voiceActorSemaphore;
        this.voiceActorDrive = voiceActorDrive;
        this.plotTwistsAmount = plotTwistsAmount;
        this.plotAssemblerDrive = plotAssemblerDrive;
        this.plotEpisodeRatio = plotEpisodeRatio;
        this.scriptReq = scriptReq;
        this.sceneryReq = sceneryReq;
        this.animationReq = animationReq;
        this.dubReq = dubReq;
        
        
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

    public driveAssembler getAssemblerDrive() {
        return assemblerDrive;
    }
    
    
 
    public void operate() { // HAY UN PROBLEMA CON EL ENSAMBLADOR, SOLO ESTA ENSAMBLANDO CAPITULOS DE PLOTTWIST
        setDayCicle(getDayCicle() + 1);
        if (getDayCicle() >= 2) {
            try {
                for (int i = 0; i < getEmployeeCount(); i++) { // Repeats the process of assembling an episode for each employee in the team
                    
                    if (getEpisodeCicle() == getPlotEpisodeRatio()){ // PlotTwist episode assembly escenario
                        getScriptwriterSemaphore().acquire();
                        getAnimatorSemaphore().acquire();
                        getPlotTwisterSemaphore().acquire();
                        getSetDesignerSemaphore().acquire();
                        getVoiceActorSemaphore().acquire();
                        if (getScriptwriterDrive().substract(getScriptReq()) && //Verifies if all drive requirements are met for assembling the episode
                                getAnimatorDrive().substract(getAnimationReq()) &&
                                getSetDesignerDrive().substract(getSceneryReq()) &&
                                getVoiceActorDrive().substract(getDubReq()) &&
                                getPlotTwisterDrive().substract(getPlotTwistsAmount())
                                ) {
                            // This only happens if all requirements were met
                            getAssemblerSemaphore().acquire();
                            int addedAmount = getPlotAssemblerDrive().add(1);
                            System.out.println("Un ensamblador agrego " + addedAmount + " capitulo DE PLOTTWIST al drive de Plottwist! ");
                            System.out.println(" /---Hay " + getPlotAssemblerDrive().getResourse() + " capitulos de plotTwist ensamblados---/");
                            getAssemblerSemaphore().release();
                            setEpisodeCicle(0); // Resets plotTwist cicle
                            
                        }else{ // This happens if all requirements weren't met
                            System.out.println("Un ensamblador no pudo ensamblar un episodio por falta de requerimientos");
                        }
                        getScriptwriterSemaphore().release(); // Releases every semaphore
                        getAnimatorSemaphore().release();
                        getSetDesignerSemaphore().release();
                        getVoiceActorSemaphore().release();
                        getPlotTwisterSemaphore().release();
                        
                    }
                    else{  //Common episode assembly escenario
                        getScriptwriterSemaphore().acquire();
                        getAnimatorSemaphore().acquire();
                        getSetDesignerSemaphore().acquire();
                        getVoiceActorSemaphore().acquire();
                        
                        if (getScriptwriterDrive().substract(getScriptReq()) && //Verifies if all drive requirements are met for assembling the episode
                                getAnimatorDrive().substract(getAnimationReq()) &&
                                getSetDesignerDrive().substract(getSceneryReq()) &&
                                getVoiceActorDrive().substract(getDubReq())
                                ){
                            // This only happens if all requirements were met
                            getAssemblerSemaphore().acquire();
                            int addedAmount = getAssemblerDrive().add(1); //Adds 1 episode to the drive
                            System.out.println("Un ensamblador agrego " + addedAmount + " capitulos a su drive! ");
                            System.out.println(" /---Hay " + getAssemblerDrive().getResourse() + " capitulos comunes ensamblados---/");
                            getAssemblerSemaphore().release();  // Releases every semaphore
                            setEpisodeCicle(getEpisodeCicle() + 1); // Adds 1 count to the cicle for a plotTwist episode
                        }
                        else{ // This happens if all requirements weren't met
                            System.out.println("Un ensamblador no pudo ensamblar un episodio por falta de requerimientos");
                        }
                        getScriptwriterSemaphore().release();  //Releases every semaphore
                        getAnimatorSemaphore().release();
                        getSetDesignerSemaphore().release();
                        getVoiceActorSemaphore().release();
                    }
                }
                setDayCicle(0); //Resets the day cicle
            }
             catch (InterruptedException ex) {
                Logger.getLogger(assemblerTeam.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(assemblerTeam.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        
    }
        /*
                                                                                            
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                ████████████                                            
                              ██░░░░░░░░░░░░████          ██      ██                    
                            ██░░░░░░░░░░░░░░░░░░██      ██  ██  ██  ██                  
                          ██░░░░████████████░░░░░░██        ██  ██                      
                        ██░░░░██░░░░░░░░░░░░██░░░░░░██  ████████                        
                      ██░░░░██░░░░██████░░░░░░██░░░░████░░░░░░░░██                      
                      ██░░░░██░░██░░░░░░██░░░░██░░░░████░░██░░██░░██                    
                      ██░░░░██░░██░░██░░██░░░░██░░░░████░░░░░░░░░░██                    
                      ██░░░░██░░░░██░░░░██░░░░██░░░░████░░████░░██                      
                      ██░░░░░░██░░░░░░░░██░░░░██░░░░██  ██░░░░██                        
                        ██░░░░░░████████░░░░░░██░░██  ██░░░░██                          
                          ██░░░░░░░░░░░░░░░░██░░░░██  ██░░██                            
                      ██████░░░░░░░░░░░░░░██░░░░██  ██░░░░██                            
                    ██░░░░░░██░░░░░░░░░░██░░░░██████░░░░░░██                            
                      ██░░░░░░████████████████░░░░░░░░░░██                              
                        ████░░░░░░░░░░░░░░░░░░░░░░░░████                                
                            ████████████████████████CM                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    */
    
    public Semaphore getAssemblerSemaphore() {
        return assemblerSemaphore;
    }

    public int getEpisodeCicle() {
        return episodeCicle;
    }

    public void setEpisodeCicle(int episodeCicle) {
        this.episodeCicle = episodeCicle;
    }

    public Semaphore getAnimatorSemaphore() {
        return animatorSemaphore;
    }

    public Semaphore getPlotTwisterSemaphore() {
        return plotTwisterSemaphore;
    }

    public Semaphore getScriptwriterSemaphore() {
        return scriptwriterSemaphore;
    }

    public Semaphore getSetDesignerSemaphore() {
        return setDesignerSemaphore;
    }

    public Semaphore getVoiceActorSemaphore() {
        return voiceActorSemaphore;
    }

    public drive getAnimatorDrive() {
        return animatorDrive;
    }

    public drive getPlotTwisterDrive() {
        return plotTwisterDrive;
    }

    public drive getScriptwriterDrive() {
        return scriptwriterDrive;
    }

    public drive getSetDesignerDrive() {
        return setDesignerDrive;
    }

    public drive getVoiceActorDrive() {
        return voiceActorDrive;
    }

    public int getScriptReq() {
        return scriptReq;
    }

    public int getSceneryReq() {
        return sceneryReq;
    }

    public int getAnimationReq() {
        return animationReq;
    }

    public int getDubReq() {
        return dubReq;
    }

    public int getPlotEpisodeRatio() {
        return plotEpisodeRatio;
    }

    public int getPlotTwistsAmount() {
        return plotTwistsAmount;
    }

    public driveAssembler getPlotAssemblerDrive() {
        return plotAssemblerDrive;
    }
}
