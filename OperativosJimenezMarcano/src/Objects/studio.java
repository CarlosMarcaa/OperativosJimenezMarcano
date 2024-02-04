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
public class studio extends Thread{ //The studio class contains all the studio information for each team, studio economics and studio management
    //Identification section
    private String studioName;
    
    //Time managing section
    private int deadlineRatio;
    private int daysLeftRelease;
    private int dayDuration;
    private int daysGoneBy;

    //Economy section
    private int profits;
    private int pmFaults;
    private int pmDiscountedAmount;
    private int salaryAccount;
    private int episodesReleased;
    private int plotEpisodesReleased;
    private int commonEpisodeProfit;
    private int plotEpisodeProfit;
    
    //Semaphore section
    private Semaphore scriptwriterSemaphore;
    private Semaphore setDesignerSemaphore;
    private Semaphore animatorSemaphore;
    private Semaphore voiceActorSemaphore;
    private Semaphore plotTwisterSemaphore;
    private Semaphore assemblerSemaphore; 
    private Semaphore daysLeftSemaphore;
    private Semaphore salaryAccountSemaphore;

    //Drive section
    private drive scriptwriterDrive;
    private drive setDesignerDrive;
    private drive animatorDrive;
    private drive voiceActorDrive;
    private drive plotTwisterDrive;
    private driveAssembler assemblerDrive;
    private driveAssembler plotAssemblerDrive;
    
    //Episode requirements section
    private int scriptReq;
    private int sceneryReq;
    private int animationReq;
    private int dubReq;
    private int plotEpisodeRatio;
    private int plotTwistsAmount;

    
    //Employee type count section
    private int scriptwriterEmployeeCount;
    private int setDesignerEmployeeCount;
    private int animatorEmployeeCount;
    private int voiceActorEmployeeCount;
    private int plotTwisterEmployeeCount;
    private int assemblerEmployeeCount;
    
    //Employee type team Objects
    private scriptwriterTeam scriptwriterTeam;
    private setDesignerTeam setDesignerTeam;
    private animatorTeam animatorTeam;
    private voiceActorTeam voiceActorTeam;
    private plotTwisterTeam plotTwisterTeam;
    private assemblerTeam assemblerTeam;
    private proyectManager proyectManager;
    private director director;
    
    

    public studio(String studioName,int commonEpisodeProfit,int plotEpisodeProfit, int deadlineRatio, int dayDuration, int scriptReq, int sceneryReq, int animationReq, int dubReq, int plotEpisodeRatio, int plotTwistsAmount, int scriptwriterEmployeeCount, int setDesignerEmployeeCount, int animatorEmployeeCount, int voiceActorEmployeeCount, int plotTwisterEmployeeCount, int assemblerEmployeeCount) {
        //Id
        this.studioName = studioName;
        //Economics
        this.commonEpisodeProfit = commonEpisodeProfit;
        this.plotEpisodeProfit = plotEpisodeProfit;
        this.profits = 0;
        this.pmFaults = 0;
        this.pmDiscountedAmount = 0;
        this.salaryAccount = 0;
        this.episodesReleased = 0;
        this.plotEpisodesReleased = 0;
        //Time management
        this.deadlineRatio = deadlineRatio;
        this.daysLeftRelease = deadlineRatio;
        this.dayDuration = dayDuration;
        //Semaphores
        this.scriptwriterSemaphore = new Semaphore(1);
        this.setDesignerSemaphore = new Semaphore(1);
        this.animatorSemaphore = new Semaphore(1);
        this.voiceActorSemaphore = new Semaphore(1);
        this.plotTwisterSemaphore = new Semaphore(1);
        this.assemblerSemaphore = new Semaphore(1);
        this.daysLeftSemaphore = new Semaphore(1); //This semaphore is going to be used to try to avoid concurrencies between the project manager and director changing days left
        this.salaryAccountSemaphore = new Semaphore(1);
        
        //Drives
        this.scriptwriterDrive = new drive(25);
        this.setDesignerDrive = new drive(20);
        this.animatorDrive = new drive(55);
        this.voiceActorDrive = new drive(35);
        this.plotTwisterDrive = new drive(10);
        this.assemblerDrive = new driveAssembler(69);
        this.plotAssemblerDrive = new driveAssembler(69);
        //Requirements
        this.scriptReq = scriptReq;
        this.sceneryReq = sceneryReq;
        this.animationReq = animationReq;
        this.dubReq = dubReq;
        this.plotEpisodeRatio = plotEpisodeRatio;
        this.plotTwistsAmount = plotTwistsAmount;
        //Employee counts
        this.scriptwriterEmployeeCount = scriptwriterEmployeeCount;
        this.setDesignerEmployeeCount = setDesignerEmployeeCount;
        this.animatorEmployeeCount = animatorEmployeeCount;
        this.voiceActorEmployeeCount = voiceActorEmployeeCount;
        this.plotTwisterEmployeeCount = plotTwisterEmployeeCount;
        this.assemblerEmployeeCount = assemblerEmployeeCount;       
        //Teams
        this.scriptwriterTeam = new scriptwriterTeam(this);
        this.setDesignerTeam = new setDesignerTeam(this);
        this.animatorTeam = new animatorTeam(this);
        this.voiceActorTeam = new voiceActorTeam(this);
        this.plotTwisterTeam = new plotTwisterTeam(this);
        this.assemblerTeam = new assemblerTeam(this);
        this.proyectManager = new proyectManager(this);
        this.director = new director(this);
    }
    @Override
    public void run() {                                         
                    getScriptwriterTeam().start();
                    getSetDesignerTeam().start();
                    getAnimatorTeam().start();
                    getVoiceActorTeam().start();
                    getPlotTwisterTeam().start();
                    getAssemblerTeam().start();
                    getProyectManager().start(); // BRING ME THE MANAGER!!!!!! 
                    getDirector().start();
    }
    
    public String getStudioName() {
        return studioName;
    }

    public int getDeadlineRatio() {
        return deadlineRatio;
    }

    public void setDeadlineRatio(int deadlineRatio) {
        this.deadlineRatio = deadlineRatio;
    }

    public int getDaysLeftRelease() {
        return daysLeftRelease;
    }

    public void setDaysLeftRelease(int daysLeftRelease) {
        this.daysLeftRelease = daysLeftRelease;
    }

    public int getProfits() {
        return profits;
    }

    public void setProfits(int profits) {
        this.profits = profits;
    }

    public int getPmFaults() {
        return pmFaults;
    }

    public void setPmFaults(int pmFaults) {
        this.pmFaults = pmFaults;
    }

    public int getPmDiscountedAmount() {
        return pmDiscountedAmount;
    }

    public void setPmDiscountedAmount(int pmDiscountedAmount) {
        this.pmDiscountedAmount = pmDiscountedAmount;
    }

    public int getSalaryAccount() {
        return salaryAccount;
    }

    public void setSalaryAccount(int salaryAccount) {
        try {
            getSalaryAccountSemaphore().acquire();
            this.salaryAccount = salaryAccount;
            getSalaryAccountSemaphore().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(studio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Semaphore getScriptwriterSemaphore() {
        return scriptwriterSemaphore;
    }

    public Semaphore getSetDesignerSemaphore() {
        return setDesignerSemaphore;
    }

    public Semaphore getAnimatorSemaphore() {
        return animatorSemaphore;
    }

    public Semaphore getVoiceActorSemaphore() {
        return voiceActorSemaphore;
    }

    public Semaphore getPlotTwisterSemaphore() {
        return plotTwisterSemaphore;
    }

    public Semaphore getAssemblerSemaphore() {
        return assemblerSemaphore;
    }

    public drive getScriptwriterDrive() {
        return scriptwriterDrive;
    }

    public drive getSetDesignerDrive() {
        return setDesignerDrive;
    }

    public drive getAnimatorDrive() {
        return animatorDrive;
    }

    public drive getVoiceActorDrive() {
        return voiceActorDrive;
    }

    public drive getPlotTwisterDrive() {
        return plotTwisterDrive;
    }

    public driveAssembler getAssemblerDrive() {
        return assemblerDrive;
    }

    public driveAssembler getPlotAssemblerDrive() {
        return plotAssemblerDrive;
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

    public int getScriptwriterEmployeeCount() {
        return scriptwriterEmployeeCount;
    }

    public void setScriptwriterEmployeeCount(int scriptwriterEmployeeCount) {
        this.scriptwriterEmployeeCount = scriptwriterEmployeeCount;
    }

    public int getSetDesignerEmployeeCount() {
        return setDesignerEmployeeCount;
    }

    public void setSetDesignerEmployeeCount(int setDesignerEmployeeCount) {
        this.setDesignerEmployeeCount = setDesignerEmployeeCount;
    }

    public int getAnimatorEmployeeCount() {
        return animatorEmployeeCount;
    }

    public void setAnimatorEmployeeCount(int animatorEmployeeCount) {
        this.animatorEmployeeCount = animatorEmployeeCount;
    }

    public int getVoiceActorEmployeeCount() {
        return voiceActorEmployeeCount;
    }

    public void setVoiceActorEmployeeCount(int voiceActorEmployeeCount) {
        this.voiceActorEmployeeCount = voiceActorEmployeeCount;
    }

    public int getPlotTwisterEmployeeCount() {
        return plotTwisterEmployeeCount;
    }

    public void setPlotTwisterEmployeeCount(int plotTwisterEmployeeCount) {
        this.plotTwisterEmployeeCount = plotTwisterEmployeeCount;
    }

    public int getAssemblerEmployeeCount() {
        return assemblerEmployeeCount;
    }

    public void setAssemblerEmployeeCount(int assemblerEmployeeCount) {
        this.assemblerEmployeeCount = assemblerEmployeeCount;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public scriptwriterTeam getScriptwriterTeam() {
        return scriptwriterTeam;
    }

    public setDesignerTeam getSetDesignerTeam() {
        return setDesignerTeam;
    }

    public animatorTeam getAnimatorTeam() {
        return animatorTeam;
    }

    public voiceActorTeam getVoiceActorTeam() {
        return voiceActorTeam;
    }

    public plotTwisterTeam getPlotTwisterTeam() {
        return plotTwisterTeam;
    }

    public assemblerTeam getAssemblerTeam() {
        return assemblerTeam;
    }

    public void setAssemblerTeam(assemblerTeam assemblerTeam) {
        this.assemblerTeam = assemblerTeam;
    }

    public proyectManager getProyectManager() {
        return proyectManager;
    }

    public int getEpisodesReleased() {
        return episodesReleased;
    }

    public void setEpisodesReleased(int episodesReleased) {
        this.episodesReleased = episodesReleased;
    }

    public int getPlotEpisodesReleased() {
        return plotEpisodesReleased;
    }

    public void setPlotEpisodesReleased(int plotEpisodesReleased) {
        this.plotEpisodesReleased = plotEpisodesReleased;
    }

    public int getCommonEpisodeProfit() {
        return commonEpisodeProfit;
    }

    public int getPlotEpisodeProfit() {
        return plotEpisodeProfit;
    }

    public director getDirector() {
        return director;
    }

    public Semaphore getDaysLeftSemaphore() {
        return daysLeftSemaphore;
    }

    public Semaphore getSalaryAccountSemaphore() {
        return salaryAccountSemaphore;
    }

    public int getDaysGoneBy() {
        return daysGoneBy;
    }

    public void setDaysGoneBy(int daysGoneBy) {
        this.daysGoneBy = daysGoneBy;
    }
    
    
    
}
