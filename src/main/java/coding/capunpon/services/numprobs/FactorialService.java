package coding.capunpon.services.numprobs;

public class FactorialService {
    public static double getFactorial(int x)
    {
        if(x > 1)
        {
            return(x * getFactorial(x - 1));
        }
        return 1;
    }
}
