class Stack
{
    class Node
    {
        int data;
        Node next;
    }

    private Node top;

    public Stack()
    {
        top = null;
    }

    public void push(int  x)throws StackException
    {
        Node t = new Node();

        if(t == null)
        {
            throw new StackException("Failed to create new node.");
        }

        t.data = x;
        t.next = top;
        top = t;


    }

    public int pop()throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Stack is empty");
        }

        int  i = top.data;

        top = top.next;

        return i;
    }

    public boolean isEmpty()
    {
        if(top == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int size()
    {
        Node t = top;
        int i = 0;

        while(t != null)
        {
            t = t.next;
            i++;
        }

        return i;
    }

    public void display()throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Stack is Empty");
        }

        Node t = top;

        System.out.println("\nStack contents are:  ");

        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }

        System.out.println("\n");
    }

    public boolean isMember(int x)throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Stack is Empty");
        }
        Node t = top;

        while(t != null)
        {
            if(t.data == x)
            {
                return true;
            }

            t = t.next;
        }

        return false;
    }

}