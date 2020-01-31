package coding.capunpon.services.numprobs;

import coding.capunpon.services.array.ArrayPrinterService;

public class NumberProblems {

    public static void main(String[] args) {
        System.out.println(FactorialService.getFactorial(0));

        FibonacciService fibonacciService = new FibonacciService();
        ArrayPrinterService.printArr(fibonacciService.getFibonacci(10), "Fibonacci Series: ");
    }
}
