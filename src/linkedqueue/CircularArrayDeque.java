/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueue;

/**
 *
 * @author MEhmet ICME
 */
public class CircularArrayDeque<T> implements DequeADT<T> {
    
    private final int DEFAULT_CAPACITY =10;
    private int front, rear, count;
    private T[] deque;
    
    public CircularArrayDeque()
    {
        front=rear=count=0;
        deque=(T[]) (new Object[DEFAULT_CAPACITY]);
    }
    
    public CircularArrayDeque(int initialCapacity)
    {
        front =rear=count=0;
        deque=(T[])(new Object[initialCapacity]);
    }
    
    public void enqueueRear(T element)
    {
        if (size()==deque.length)
        {
            System.out.println("The deque is full.");
            return;     
        }
        deque[rear]= element;
        rear=(rear + 1)%deque.length;
        
        count++;
    }        
    
    public T dequeueFront() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("deque");
        
        T result = deque[front];
        
        deque[front]=null;
        
        front=(front+1)% deque.length;
        
        count--;
        return result;
    }
    
    public T dequeueRear() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionExcetion("deque");
        
        T result = deque[rear-1];
        deque[rear-1]=null;
        rear=(rear-1) % deque.length;
        
        count--;
        return result;
    }
    
    public int size()
    {
        return count;
    }
    
    public T first() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        T result =deque[front];
        return result;
        
    }
    
    public T last() throws EmptyCollectionException
    {
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        T result =deque[rear-1];
        return result;
        
    }
    
    public boolean isEmpty()
    {
        return(count==0);
    }
    
    public String toString()
    {
        String queueElements = "";
        
        for(int i= front, j=0;j<count; i=(i+1)%deque.length, j++)
        {
            queueElements = queueElements + deque[i].toString()+"";
        }
        return queueElements;
    }
}
