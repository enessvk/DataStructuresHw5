/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author MEHMET ICME
 */
public class LinkedQueue {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
        LinkedQueue1<Integer> lq1=new;
        LinkedQueue1<Integer>();
        
        lq1.enqueue(25);
        lq1.enqueue(15);
        lq1.enqueue(35);
        lq1.enqueue(30);
        lq1.enqueue(10);
        lq1.enqueue(20);
        
        System.out.println("The queue is empy.(T/F):");
        System.out.println(lq1.isEmpty());
        
        System.out.println("The size of the queue:");
        System.out.println(lq1.size());
        
        System.out.print("The element at the front of the queue: ");
        System.out.println(lq1.first());
        
        System.out.println("The elements in the queue are:");
        System.out.println(lq1.toString());
        
    }
    
}
