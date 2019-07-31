import java.util.InputMismatchException;
import java.util.Scanner;

class Main
{
    static Scanner in = new Scanner(System.in);

    static Queue q1,q2;

    static Stack s;

    static Heap h;

    public static void main(String[] args)
    {
        dataInit();
        int menuChoice = -1;

        do
        {
            System.out.println("\n\n\n");
            System.out.println("0.Exit");
            System.out.println("1.Stack");
            System.out.println("2.Queue");
            System.out.println("3.Heap");
            try
            {
                menuChoice = in.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                in.next();
            }

            if(menuChoice < 0 || menuChoice > 4)
            {
                System.out.println("Please enter a valid option");
            }

            switch(menuChoice)
            {
                case 0:
                {
                    break;
                }

                case 1:
                {
                    stack();
                    break;
                }

                case 2:
                {
                    queue();
                    break;
                }

                case 3:
                {
                    heap();
                    break;
                }

                case 4:
                {
                    matrix();
                    break;
                }
            }
        }
        while(menuChoice != 0);
    }

    public static void stack()
    {
        int menuChoice = 0;

        do
        {
            System.out.println("\n\n\n");
            System.out.println("0.Go Back");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.isMember");
            System.out.println("5.Size");


            try
            {
                menuChoice = in.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                in.next();
            }

            if(menuChoice < 0 || menuChoice > 5)
            {
                System.out.println("Please enter a valid option");
            }


            switch(menuChoice)
            {
                case 0:
                {
                    break;
                }

                case 1:
                {
                    int x;

                    System.out.println("Enter number to push on to stack");

                    x = in.nextInt();

                    try
                    {
                        s.push(x);
                    }
                    catch(StackException e)
                    {
                        System.out.println(e);
                    }

                    break;
                }

                case 2:
                {
                    try
                    {
                        s.pop();
                    }
                    catch(StackException e)
                    {
                        System.out.println(e);
                    }

                    break;
                }

                case 3:
                {
                    try
                    {
                        s.display();
                    }
                    catch(StackException e)
                    {
                        System.out.println(e);
                    }

                    break;
                }

                case 4:
                {
                    int x;

                    System.out.println("Enter number to search for in the stack");

                    x = in.nextInt();

                    try
                    {
                        if(s.isMember(x) == true)
                        {
                            System.out.println(x + " is a member of the stack");
                        }
                        else
                        {
                            System.out.println(x + " is not a member of the stack");
                        }
                    }
                    catch(StackException e)
                    {
                        System.out.println(e);
                    }

                    break;
                }

                case 5:
                {
                    System.out.println(s.size());
                    break;
                }
            }

        }
        while(menuChoice != 0);
    }

    public static void queue()
    {
        int menuChoice = 0;
        int queueCheck;

        do
        {
            //menu
            System.out.println("\n\n\n");
            System.out.println("0.Go Back");
            System.out.println("1.Add to queue");
            System.out.println("2.Remove from queue");
            System.out.println("3.Display the queue");
            System.out.println("4.Display size of queue");
            System.out.println("5.Search for element");

            //get user input

            try
            {
                menuChoice = in.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                in.next();
            }

            if(menuChoice < 0 || menuChoice > 5)
            {
                System.out.println("Please enter a valid option");
            }

            //menu control
            switch(menuChoice)
            {
                case 0://exit
                {
                    break;
                }
                case 1://enQueue
                {
                    queueCheck = queueCheck();

                    System.out.println("\n\n");
                    System.out.println("Enter a number to add.");
                    int x = in.nextInt();

                    switch(queueCheck)
                    {
                        case 1://Circular Buffer
                        {
                            try
                            {
                                q2.enQueue(x);
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }

                            break;
                        }
                        case 2://Linked List
                        {
                            try
                            {
                                q1.enQueue(x);
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }
                            break;
                        }
                    }
                    break;
                }
                case 2://deQueue
                {
                    queueCheck = queueCheck();

                    switch(queueCheck)
                    {
                        case 1://Circular Buffer
                        {
                            try
                            {
                                System.out.println(q2.deQueue()+" has been removed");
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }

                            break;
                        }
                        case 2://Linked List
                        {
                            try
                            {
                                System.out.println(q1.deQueue()+" has been removed");
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3://display
                {
                    queueCheck = queueCheck();

                    switch(queueCheck)
                    {
                        case 1://Circular Buffer
                        {
                            try
                            {
                                q2.display();
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }

                            break;
                        }
                        case 2://Linked List
                        {
                            try
                            {
                                q1.display();
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }
                            break;
                        }
                    }
                    break;
                }
                case 4://size
                {
                    queueCheck = queueCheck();

                    switch(queueCheck)
                    {
                        case 1://Circular Buffer
                        {
                            System.out.println("Size: "+q2.getSize());
                            break;
                        }
                        case 2://Linked List
                        {
                            System.out.println("Size: "+q1.getSize());
                            break;
                        }
                    }
                    break;
                }
                case 5://isMember
                {
                    queueCheck = queueCheck();

                    System.out.println("\n\n");
                    System.out.println("Enter a number to check.");
                    int x = in.nextInt();

                    switch(queueCheck)
                    {
                        case 1://Circular Buffer
                        {
                            try
                            {
                                if(q2.isMember(x) == true)
                                {
                                    System.out.println(x+" is a member.");
                                }
                                else
                                {
                                    System.out.println(x+" is not a member");
                                }
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }
                            break;
                        }
                        case 2://Linked List
                        {
                            try
                            {
                                if(q1.isMember(x) == true)
                                {
                                    System.out.println(x+" is a member.");
                                }
                                else
                                {
                                    System.out.println(x+" is not a member");
                                }
                            }
                            catch(QueueException e)
                            {
                                System.out.println("Exception thrown: " + e);
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
        while(menuChoice != 0);
    }

    public static int queueCheck()
    {
        System.out.println("\n\n");
        System.out.println("Which queue do you wish to use?");
        System.out.println("1.Circular Buffer");
        System.out.println("2.Linked List");

        int menuChoice = -1;

        do
        {
            try
            {
                menuChoice = in.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                in.next();
            }

            if(menuChoice < 1 || menuChoice > 2)
            {
                System.out.println("Please enter a valid option");
                in.next();
            }

            System.out.println("Menu Choice = " + menuChoice);
        }
        while(menuChoice < 1 && menuChoice > 2);

        return menuChoice;
    }

    public static void heap()
    {
        int menuChoice = 0;

        do
        {
            System.out.println("\n\n\n");
            System.out.println("0.Go Back");
            System.out.println("1.Insert");
            System.out.println("2.Remove");
            System.out.println("3.Display");
            System.out.println("4.Size");
            System.out.println("5.Search");

            try
            {
                menuChoice = in.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                in.next();
            }

            if(menuChoice < 0 || menuChoice > 5)
            {
                System.out.println("Please enter a valid option");
            }

            switch(menuChoice)
            {
                case 0:
                {
                    break;
                }

                case 1:
                {
                    System.out.println("Enter a number to insert");

                    h.insert(in.nextInt());
                    break;
                }

                case 2:
                {
                    System.out.println(h.remove() + " has been removed");
                    break;
                }

                case 3:
                {
                    h.display();
                    break;
                }

                case 4:
                {
                    System.out.println("Size: " + h.size());
                    break;
                }

                case 5:
                {
                    System.out.println("Enter a number to search for");

                    int value = in.nextInt();
                    int pos = h.search(value);

                    if(pos == 0)
                    {
                        System.out.println(value + " is not in the heap");
                    }
                    else
                    {
                        System.out.println(value + " is at position " + pos + " in the heap");
                    }

                }
            }
        }
        while(menuChoice != 0);
    }

    public static void matrix()
    {
        int menuChoice = -1;

        do
        {
            System.out.println("0.Go Back");


            try
            {
                menuChoice = in.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                in.next();
            }

            if(menuChoice < 0 || menuChoice > 0)
            {
                System.out.println("Please enter a valid option");
            }
        }
        while(menuChoice != 0);
    }

    public static void dataInit()
    {
        //queues
        q1 = new QueueLL();
        q2 = new QueueCB();

        //populate queues
        for(int i = 1; i < 4; i++)
        {
            try
            {
                q1.enQueue(i);
            }
            catch (QueueException e)
            {
                System.out.println("Exception thrown: " + e);
            }

            try
            {
                q2.enQueue(i);
            }
            catch (QueueException e)
            {
                System.out.println("Exception thrown: " + e);
            }
        }

        // stack
        s = new Stack();

        //populate stack
        try
        {
            for(int i=0;i<10;i++)
            {
                s.push(i);
            }
        }
        catch(StackException e)
        {
            System.out.println(e);
        }

        //heap
        h = new Heap();
        int r; double x;
        for(int i = 1; i <= 10; ++i)
        {
            x =  (Math.random()*100.0);
            r = (int) x;
            h.insert(r);
        }
    }
}