/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author cdmar
 */
public class queue {

    private int length;
    private thread head;

    public queue() {
        this.length = 0;
        this.head = null;
    }

    public void setHead(thread head) {
        this.head = head;
    }

    public thread getHead() {
        return head;
    }
    
    public thread getLast(){
        thread pointer = getHead();
        while (pointer.getNext() != null){
            pointer = (thread) pointer.getNext();
        }
        return pointer;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }

    public void printQueue() {
        thread nodo = getHead();
        while (nodo != null) {
            System.out.print(" [" + nodo.getType() + "]");
            nodo = (thread) nodo.getNext();
        }
    }

    

    public void dequeue() {
        if (isEmpty()){
            System.out.println("The queue is empty");
        }else{
            thread pointer = getHead();
            while (pointer.getNext() != getLast()){
                pointer = (thread) pointer.getNext();
            }
            pointer.setNext(null);                       
        }
        length--;
    }

    public void enqueue(String Type) {
        thread nodo = new thread(Type);

        if (isEmpty()) {
            setHead(nodo);

        }else {
            nodo.setNext(getHead());
            setHead(nodo);

        }
        length++;
    }

}
