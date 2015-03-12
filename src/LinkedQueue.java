/**
 * LinkedQueue represents a linked implementation of a queue.
 * 
 * @author Lewis and Chase
 * @version 4.0
 */
public class LinkedQueue<T> implements QueueADT<T>
{
    private int count;
    private LinearNode<T> front, rear;

    /**
     * Creates an empty queue.
     */
    public LinkedQueue()
    {
        count = 0;
        front = rear = null;
    }

    /**
     * Adds the specified element to the rear of this queue.
     * @param element the element to be added to the rear of the queue
     */
    public void enqueue(T element)
    {
        LinearNode<T> node = new LinearNode<T>(element);

        if (isEmpty())
            front = node;
        else
            rear.setNext(node);

        rear = node;
        count++;
    }

    /**
     * Removes the element at the front of this queue and returns a
     * reference to it. 
     * @return the element at the front of this queue
     * @throws EmptyCollectionException if the queue is empty
     */
    public T dequeue() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        T result = front.getElement();
        front = front.getNext();
        count--;

        if (isEmpty())
            rear = null;

        return result;
    }
   
    /**
     * Returns a reference to the element at the front of this queue.
     * The element is not removed from the queue.  
     * @return a reference to the first element in this queue
     * @throws EmptyCollectionsException if the queue is empty
     */
    public T first() throws EmptyCollectionException
    {
        // To be completed as a Programming Project
    	if (this.isEmpty()) throw new EmptyCollectionException("list");
    	return front.getElement();
    }

    /**
     * Returns true if this queue is empty and false otherwise. 
     * @return true if this queue is empty 
     */
    public boolean isEmpty()
    {
        // To be completed as a Programming Project
    	return count == 0;
    }
 
    /**
     * Returns the number of elements currently in this queue.
     * @return the number of elements in the queue
     */
    public int size()
    {
        // To be completed as a Programming Project
    	return count;
    }

    /**
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    public String toString()
    {
        // To be completed as a Programming Project
    	LinearNode<T> seeker = front;
    	String temp = "";
    	for(int i = 0; i < count; i++)
    	{
    		if (i > count-2)
    			temp += ""+seeker.getElement();
    		else
    			temp += ""+seeker.getElement() + ", ";
    		seeker = seeker.getNext();
    	}
    	return temp;
    }
    
    public void clear()
    {
    	front = null;
    	rear = null;
    	count = 0;
    }
}