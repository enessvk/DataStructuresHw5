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
public class CircularArrayDequeDemo {
    
    public static void main(String[] args)
    {
        CircularArrayDeque<Integer> cad=new CircularArrayDeque<Integer>();
        
        cad.enqueueRear(25);
        cad.enqueueRear(15);
        cad.enqueueRear(30);
        cad.enqueueRear(10);
        
        cad.enqueueRear(35);
        cad.enqueueRear(20);
        
        System.out.println("The deque is empty.(T/F):");
        System.out.println(cad.isEmpty());
        
        System.out.println("The size of the deque:");
        System.out.println(cad.size());
        
        System.out.println("The elemts in the deque are:");
        System.out.println(cad.toString());
        
        System.out.println("The element at the front of the deque:");
        System.out.println(cad.first());
        
        System.out.println("The element at the rear of the deque:");
        System.out.println(cad.last());
        
        System.out.println("The removed element at the rear:");
        System.out.println(cad.last());
        
        System.out.println("The removed element at the front:");
        System.out.println(cad.dequeueFront());
        
        System.out.println("The elements in the deque are:");
        System.out.println(cad.toString());
        
        
        
        
    }
}
