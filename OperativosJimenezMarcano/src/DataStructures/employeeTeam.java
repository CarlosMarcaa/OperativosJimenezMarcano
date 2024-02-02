/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cdmar
 */
public class employeeTeam extends Thread{
    
    /*The threads are going to be used to represent each employee 
    They will also work as pointers in the internal queue in each department's drive (semaphors)*/
    
    
   

        private String type; //Employee type, the program will function around the type of employee group
        private Object next;
        private Semaphore scriptwriterDrive; 
        private Semaphore DesignerDrive; 
        private Semaphore animatorDrive; 
        private Semaphore voiceActorDrive; 
        private Semaphore plotTwisterDrive; 
        private Semaphore assemblerDrive; 
        private Semaphore projectManagerDrive;  
        private Semaphore directorDrive; 
        private int employeeCount;
        private int dayDuration;
        private int dayCicle;
        private int salaryAccount;
        
        public employeeTeam(String employeeType, int employeeCount, int dayDuration) {
            this.type = employeeType;
            this.next = null;
            this.scriptwriterDrive = null;
            this.DesignerDrive = null;
            this.animatorDrive = null;
            this.voiceActorDrive = null;
            this.plotTwisterDrive = null;
            this.assemblerDrive = null;
            this.projectManagerDrive = null;
            this.directorDrive = null;
            this.employeeCount = employeeCount;
            this.dayDuration = dayDuration;
            this.dayCicle = 0;
            this.salaryAccount = 0;
        }
        
        
        
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setNext(thread next) {
            this.next = next;
        }

        public Object getNext() {
            return next;
        }

        @Override
        public void run() {
            switch (getType()) {
                case "scriptwriter":
                    System.out.println("Action for scriptwriter");
                    break;
                    
                case "setDesigner":
                    System.out.println("Action for setDesigner");
                    break;
                    
                case "animator":
                    System.out.println("Action for animator");
                    break;
                    
                case "voiceActor":
                    System.out.println("Action for voiceActor");
                    break;
                    
                case "plotTwister":
                    System.out.println("Action for plotTwister");
                    break;
                
                case "assembler":
                    System.out.println("Action for assembler");
                    break;
                
                case "projectManager":
                    System.out.println("Action for projectManager");
                    break;
                    
                case "director":
                    System.out.println("Action for director");
                    break;
                    
                default:
                    break;
            }
                       
        }
        
        public void operate(){
            switch (getType()) {
                
                                
                case "scriptwriter":
                    int salary = 20;
                    while (true){
            
                        try {
                            run();
                            System.out.println("El equipo de " get+ getType() + " gana: ");
                            sleep(this.dayDuration);                            
                            
                        } catch (InterruptedException ex) {
                            Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                    
                    
                case "setDesigner":
                    System.out.println("Action for setDesigner");
                    break;
                    
                case "animator":
                    System.out.println("Action for animator");
                    break;
                    
                case "voiceActor":
                    System.out.println("Action for voiceActor");
                    break;
                    
                case "plotTwister":
                    System.out.println("Action for plotTwister");
                    break;
                
                case "assembler":
                    System.out.println("Action for assembler");
                    break;
                
                case "projectManager":
                    System.out.println("Action for projectManager");
                    break;
                    
                case "director":
                    System.out.println("Action for director");
                    break;
                    
                default:
                    break;
            }
        }

    public void setScriptwriterDrive(Semaphore scriptwriterDrive) {
        this.scriptwriterDrive = scriptwriterDrive;
    }

    public void setDesignerDrive(Semaphore DesignerDrive) {
        this.DesignerDrive = DesignerDrive;
    }

    public void setAnimatorDrive(Semaphore animatorDrive) {
        this.animatorDrive = animatorDrive;
    }

    public void setVoiceActorDrive(Semaphore voiceActorDrive) {
        this.voiceActorDrive = voiceActorDrive;
    }

    public void setPlotTwisterDrive(Semaphore plotTwisterDrive) {
        this.plotTwisterDrive = plotTwisterDrive;
    }

    public void setAssemblerDrive(Semaphore assemblerDrive) {
        this.assemblerDrive = assemblerDrive;
    }

    public void setProjectManagerDrive(Semaphore projectManagerDrive) {
        this.projectManagerDrive = projectManagerDrive;
    }

    public void setDirectorDrive(Semaphore directorDrive) {
        this.directorDrive = directorDrive;
    }

    public int getSalaryAccount() {
        return salaryAccount;
    }

    public void setSalaryAccount(int salaryAccount) {
        this.salaryAccount = salaryAccount;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
}
