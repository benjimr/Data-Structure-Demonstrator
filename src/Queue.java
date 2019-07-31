interface Queue
{
    public void enQueue(int x) throws QueueException;
    public int deQueue() throws QueueException;
    public void display() throws QueueException;
    public boolean isEmpty();
    public boolean isMember(int x)throws QueueException;
    public int getSize();
}
