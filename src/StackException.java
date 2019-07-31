class StackException extends Exception
{
    public StackException(String msg)
    {
        super("Stack Error: " + msg);
    }
}
