/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author cdmar
 */
public class drive {
    private int resourse;
    private int maxResourse;
    
    public drive(int maxResourse) {
        this.maxResourse = maxResourse;
        this.resourse = 0;
    }
    
    public void add(int amount){
        if (resourse + amount > maxResourse){
            resourse = maxResourse;
        }else{
            resourse = resourse + amount;
        }
    }
    
    public boolean substract(int amount){
        if (amount > resourse){
            System.out.println("Out of resourses");
            return false;
        }else{
            resourse = resourse - amount;
            return true;
        }
    }
    
    public boolean isFull(){
        return (resourse == maxResourse);
    }
}
