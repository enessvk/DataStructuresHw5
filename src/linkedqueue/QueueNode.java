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
public class QueueNode<T> {
    
    QueueNode<T> next;
    private T element;
    private int nodeNum;
    
    public QueueNode()
    {
        nodeNum=0;
        next=null;
        element=null;
    }
    
    public QueueNode(T elem)
    {
        nodeNum =1;
        next = null;
        element= elem;
    }
    
    public QueueNode<T> getNext()
    {
        return next;
    }
    
    public void set(QueueNode<T> node)
    {
        next=node;
    }
    
    public T getElement()
    {
        return element;
    }
    
    public void setElement(T elem)
    {
        element=elem;
    }
    
    public void setNodeNumber(int n)
    {
        nodeNum= nodeNum + n;
    }
    
    public int getNodeNumber()
    {
        return nodeNum;
    }
}
