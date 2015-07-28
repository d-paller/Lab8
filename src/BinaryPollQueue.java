/* David Paller*/


/* Implements a FIFO-Priority Queue using two LIFO Stacks.
 * offer: add an element to this queue, return true if element is added successfully, return false otherwise
 * priorityPoll: removes and returns the element with the highest priority.
 * elementPoll:  removes and returns the element at the front of the queue.
 * peek: returns the element at the front of the queue.              
 */

import java.util.*;

public class BinaryPollQueue<E extends Comparable<E>> { // Do not change this line
    
    /* Two LIFO Stacks to act as the container of this BinaryPollQueue. DO NOT CHANGE!!! */
    private Stack<E> stk1;
    private Stack<E> stk2;
    
    public void offer(E e){
        stk1.push(e);
        
        
    }//offer
    
    
    
    
    
    public E priorityPoll(){
        E max = null;
        if(stk1.size() == 0)
            return null;
        else{
            while(!stk1.empty()){
                if(stk1.peek().compareTo(max) == 1)
                    max = stk1.pop();
                stk2.push(stk1.pop());
                
            }//while stk1
            
            while(!stk2.empty()){
               if(stk1.peek().equals(max))
                   return stk2.pop();
                stk1.push(stk2.pop());
                
                
            }//while stk2
            
        }//else
        
        return null;
    }//priority poll
    
    
    
    
    
    public E elementPoll(){
        
        if(stk1.size() == 0)
            return null;
        
        else{
            while(!stk1.empty())
                stk2.push(stk1.pop());
            
            E e = stk2.pop();
            
            while(!stk1.empty())
                stk1.push(stk2.pop());
            
            return e;
            
        }//else
            
        
    }//element poll
    
    
    
    
    public E peek(){
        if (stk1.size() == 0)
            return null;
        else{
            
            while(!stk1.empty())
                stk2.push(stk1.pop());
            
            E e = stk2.peek();
            
            while(!stk2.empty())
                stk1.push(stk2.pop());
            return e;
            
            
        }//else
        
        
    }//peek
    
    
}//class


