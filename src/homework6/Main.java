package homework6;

public class Main {
    public static void main(String[] args) {

        ExceptionsAndError exceptionExamples = new ExceptionsAndError();

        System.out.println("1. try-catch");
        exceptionExamples.method1();

        System.out.println("\n2. try-catch, где catch будет несколько");
        exceptionExamples.method2();

        System.out.println("\n 3. try-catch, с использованием multi - catch");
        exceptionExamples.method3();

        System.out.println("\n4. try-catch-finally");
        exceptionExamples.method4();
    }
}
