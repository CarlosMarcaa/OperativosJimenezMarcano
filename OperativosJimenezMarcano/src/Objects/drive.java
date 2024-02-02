/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

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
    
    public int add(int amount){
        int amountAdded = 0;
        if (resourse + amount >= maxResourse){
            amountAdded = maxResourse - resourse;
            resourse = maxResourse;
            
        }else{
            resourse = resourse + amount;
            amountAdded = amount;
        }
        return amountAdded;
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
