/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author cdmarca
 */
public class semaphore {
    private int resourse;
    private queue line;
    private int maxResourse;
    private boolean isAvailable;
    
    public semaphore(int maxResourse){
        this.maxResourse = maxResourse;
        this.resourse = 0;
        this.isAvailable = true;
    }

    public int getResourse() {
        return resourse;
    }

    public void setResourse(int resourse) {
        this.resourse = resourse;
    }

    public int getMaxResourse() {
        return maxResourse;
    }
    
    public void signal(thread employeeThread){
        
    }
    
    public void wait(thread employeeThread){
        
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
}
