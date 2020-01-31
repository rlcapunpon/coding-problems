package coding.capunpon.services.numprobs;

public class FibonacciService {
    public static int[] getFibonacci(int length){
        int fibo[] = new int[length];
        for(int i=0; i < length; i++) {
            fibo[i] = fibo(i);
        }
        return fibo;
    }

    private static int fibo(int num) {
        if ( num == 0 )
            return 0;
        else if ( num == 1 )
            return 1;
        else
            return fibo(num-1) + fibo(num-2);
    }
}
