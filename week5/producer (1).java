package Task4;

public class producer {
    public static Abstractfactory gettype(boolean n)
    {
        if(n)
        {
            return new doctor();
            
        }
        else
        {
            return new teachingassistant();
        }
    }
    
}
