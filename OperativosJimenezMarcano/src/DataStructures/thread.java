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
   

        private String type; //Employee type, the program will function around the type of employee
        private Object next;

        public thread(String employeeType) {
            this.type = employeeType;
            this.next = null;
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
}
