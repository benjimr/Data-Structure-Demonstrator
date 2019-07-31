class QueueCB implements Queue
{
    private int q[], back, front;
    private int qmax, size;

    public QueueCB()
    {
        qmax = 4;
        size = front = back = 0;
        q = new int[qmax];
    }

    public void enQueue(int x) throws QueueException
    {
        //if full
        if(size == qmax)
        {
            throw new QueueException("Queue full, wait for dequeue");
        }
        else
        {
            //write to front(add to empty spot)
            q[front] = x;
            size++;
            front  = (front+1)%qmax;
        }
    }

    public int deQueue() throws QueueException
    {
        if(!isEmpty())
        {
            int temp = q[back];
            q[back] = 0;

            back = (back+1)%qmax;
            size--;

            return temp;
        }
        else
        {
            throw new QueueException("Can't dequeue from an empty queue");
        }
    }

    public void display() throws QueueException
    {
        if(!isEmpty())
        {
            System.out.println("\n\nQueue contents: \n");
            for(int i=0;i<qmax;i++)
            {
                System.out.print(q[i]+"  ");
            }
            System.out.println("");
        }
        else
        {
            throw new QueueException("Can't display and empty queue");
        }
    }

    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isMember(int x) throws QueueException
    {
        if(!isEmpty())
        {
            for(int i=0;i<qmax;i++)
            {
                if(q[i] == x)
                {
                    return true;
                }
            }
            return false;
        }
        else
        {
            throw new QueueException("Can't check on an empty queue");
        }

    }

    public int getSize()
    {
        return size;
    }
}
