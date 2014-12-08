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
public class LinkedQueue1<T> implements QueueADT<T> {
    
    private QueueNode<T> front,rear;
    
    public LinkedQueue1()
    {
        front = rear =null;
    }

    @Override
    public void enqueue(T element) {
       
        int n;
        QueueNode<T> node= new QueueNode<T>(element);
        
        if(isEmpty())
        {
            front = node;
            n=0;
        }
        else
        {
            n=rear.getNodeNumber();
            rear.setNext(node);
        }
        rear=node;
        
        rear.setNodeNumber(n);
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
       if(isEmpty())
           throw new EmptyCollectionException("queue");
       T result=front.getElement();
       front=front.getNext();
       
       rear.setNodeNumber(-1);
       
       if(isEmpty())
           rear=null;
       
           return result;
       
    }

    @Override
    public T first() {
       if(isEmpty())
           throw new EmptyCollectionException("queue");
       T result = front.getElement();
       return result;
    }
    
    public int size()
    {
        if(rear==null)
            return 0;
        return rear.getNodeNumber();
    }
    @Override
    public boolean isEmpty() {
       return (front==null || rear.getNodeNumber()==0);
    }

    @Override
    public String toString()
    {
        String queueElements="";
        QueueNode<T> curr=front;
        
        while(curr != null)
        {
            queueElements=queueElements +
                    (curr.getElement()).toString()+ "";
            curr=curr.getNext();
        }
        return queueElements;
    }
    
    
    
}
