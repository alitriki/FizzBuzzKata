public class FizzBuzz {

    public static void main(String[] args) {
        for(int i=1;i<=100; i++){
            System.out.print(evaluate(i)+ " ");
        }
    }

    public static String evaluate(int number) {
        String result;
        if(isMultipleOf(number, 3) && isMultipleOf(number, 5))
            result = "FizzBuzz";
        else if(isMultipleOf(number, 3))
            result = "Fizz";
        else if(isMultipleOf(number, 5))
            result = "Buzz";
        else
            result = String.valueOf(number);

        return result;
    }

    private static boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }

}
