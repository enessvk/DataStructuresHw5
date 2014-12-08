/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author MEHMET ICME
 * @param <T>
 */
public interface DequeADT<T> {
    
    public void enqueueRear(T element);
    
    public void enqueueFront(T element);
    
    public T dequeueFront();
    
    public T  dequeueRear();
    
    public T first();
    
    public T last();
    
    public boolean isEmpty();
    
    public int size();
    
    @Override
    public String toString();
    
    
}
