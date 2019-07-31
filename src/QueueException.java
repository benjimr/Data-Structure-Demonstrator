class QueueException extends Exception
{
    public QueueException(String msg)
    {
        super("Queue Error: " + msg);
    }
}
