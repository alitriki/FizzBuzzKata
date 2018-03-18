public class FizzBuzz {

    public String evaluate(int number) {
        String result;
        if(IsAMultipleOfThree(number))
            result = "Fizz";
        else if(number==5)
            result = "Buzz";
        else
            result = String.valueOf(number);

        return result;
    }

    private boolean IsAMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
