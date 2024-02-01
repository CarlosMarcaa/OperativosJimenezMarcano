/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author cdmar
 */
public class thread {
    /*
    The threads are going to be used to represent each employee 
    They will also work as pointers in the internal queue in each department's drive (semaphors)
    
    */
   

        private String type; //Employee type, the program will function around the type of employee group
        private Object next;
        private semaphore scriptwriterDrive; 
        private semaphore DesignerDrive; 
        private semaphore animatorDrive; 
        private semaphore voiceActorDrive; 
        private semaphore plotTwisterDrive; 
        private semaphore assemblerDrive; 
        private semaphore projectManagerDrive;  
        private semaphore directorDrive; 
        
        public thread(String employeeType) {
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

    public void setScriptwriterDrive(semaphore scriptwriterDrive) {
        this.scriptwriterDrive = scriptwriterDrive;
    }

    public void setDesignerDrive(semaphore DesignerDrive) {
        this.DesignerDrive = DesignerDrive;
    }

    public void setAnimatorDrive(semaphore animatorDrive) {
        this.animatorDrive = animatorDrive;
    }

    public void setVoiceActorDrive(semaphore voiceActorDrive) {
        this.voiceActorDrive = voiceActorDrive;
    }

    public void setPlotTwisterDrive(semaphore plotTwisterDrive) {
        this.plotTwisterDrive = plotTwisterDrive;
    }

    public void setAssemblerDrive(semaphore assemblerDrive) {
        this.assemblerDrive = assemblerDrive;
    }

    public void setProjectManagerDrive(semaphore projectManagerDrive) {
        this.projectManagerDrive = projectManagerDrive;
    }

    public void setDirectorDrive(semaphore directorDrive) {
        this.directorDrive = directorDrive;
    }
}
