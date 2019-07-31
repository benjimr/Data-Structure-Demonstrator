class QueueLL implements Queue
{
    private class Node
    {
        int data;
        Node next;
    }

    Node z;
    Node head;
    Node tail;

    public QueueLL()
    {
        z = new Node();
        z.next = z;
        head = z;
        tail = null;
    }

    public void enQueue( int x) throws QueueException
    {
        Node temp;

        temp = new Node();

        if(temp == null)
        {
            throw new QueueException("Node creation failed");
        }

        temp.data = x;
        temp.next = z;

        if(head == z)
        {
            head = temp;
        }
        else
        {
            tail.next = temp;
        }

        tail = temp;
    }

    public int deQueue() throws QueueException
    {
        if(!isEmpty())
        {
            Node temp = new Node();
            temp.data = head.data;

            head = head.next;
            return temp.data;
        }
        else
        {
            throw new QueueException("Can't dequeue from and empty queue");
        }

    }

    public void display() throws QueueException
    {
        if(!isEmpty())
        {
            System.out.println("\n\nQueue contents: \n");
            Node temp = head;

            while(temp != temp.next)
            {
                System.out.print( temp.data + "  ");
                temp = temp.next;
            }

            System.out.println("\n");
        }
        else
        {
            throw new QueueException("Can't display an empty queue");
        }
    }

    public boolean isEmpty()
    {
        if(head == z)
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
            Node temp = new Node();
            temp = head;

            while(temp != tail.next)
            {
                if(temp.data == x)
                {
                    return true;
                }

                temp = temp.next;
            }
        }
        else
        {
            throw new QueueException("Can't check on an empty queue");
        }

        return false;
    }

    public int getSize()
    {
        int count = 0;
        Node temp = new Node();
        if(!isEmpty())
        {
            count = 1;
        }
        temp = head;

        while(temp != tail && !isEmpty())
        {
            count++;
            temp = temp.next;
        }

        return count;
    }

} // end of QueueLL class
