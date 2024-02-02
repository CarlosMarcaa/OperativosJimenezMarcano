/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author cdmar
 */
public class driveAssembler extends drive {
    public driveAssembler(int number){
        super(number);
    }
    
    @Override
    public int add(int amount){
        int amountAdded = amount;        
        setResourse(getResourse() + amount);                  
        return amountAdded;
    }
}
