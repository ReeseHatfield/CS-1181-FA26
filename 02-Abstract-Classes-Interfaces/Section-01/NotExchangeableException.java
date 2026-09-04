public class NotExchangeableException extends RuntimeException
{
    public NotExchangeableException(String expectedType)
    {
        super("Expected type " + expectedType + " for exchange");
    }
}
