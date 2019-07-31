public class Heap
{
    private int[] heap, positions;
    int amount;
    static int maxSize= 100;

    public Heap()
    {
        amount = 0;
        heap = new int[maxSize+1];
        positions = new int[maxSize+1];
    }

    public Heap(int size)
    {
        amount = 0;
        heap = new int[size+1];
        positions = new int[size+1];
    }

    public void insert(int value)
    {
        heap[++amount] = value;
        positions[value] = amount;
        siftUp(amount);
    }

    public int remove()
    {
        int value = heap[1];
        heap[1]= heap[amount--];
        positions[value] = 0;
        siftDown(1);
        return value;
    }

    public void siftUp(int pos)
    {
        int value = heap[pos];

        heap[0] = Integer.MAX_VALUE;

        while(value > heap[pos/2])
        {
            heap[pos] = heap[pos/2];
            positions[heap[pos]] = pos;
            pos = pos/2;
        }

        heap[pos] = value;
        positions[value] = pos;
    }

    public void siftDown(int pos)
    {
        int value = heap[pos];

        while(pos <= amount/2)
        {
            int i = 2*pos;

            if(i < amount && heap[i] < heap[i+1])
            {
                ++i;
            }

            if(value >= heap[i])
            {
                break;
            }

            heap[pos] = heap[i];
            positions[heap[pos]] = pos;
            pos = i;
        }

        heap[pos] = value;
        positions[value] = pos;

    }

    public void display()
    {
        System.out.println("Heap:");
        System.out.println(heap[1]);

        for(int i = 1; i <=amount/2; i = i*2)
        {
            for(int j = 2*i; j < 4*i && j <= amount; ++j)
            {
                System.out.print(heap[j]+"  ");
            }

            System.out.println();
        }
    }

    public int size()
    {
        return amount;
    }

    public int search(int value)
    {
        if(value < positions.length)
        {
            int pos = positions[value];

            if(pos == 0)
            {
                return 0;
            }
            else
            {
                return pos;
            }
        }

        return 0;
    }
}
