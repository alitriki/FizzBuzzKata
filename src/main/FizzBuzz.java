public class FizzBuzz {

    public String evaluate(int number) {
        String result;
        if(number==3)
            result = "Fizz";
        else if(number==5)
            result = "Buzz";
        else
            result = String.valueOf(number);

        return result;
    }
}
