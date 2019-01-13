package pl.sdacademy.tdd;

public class FizzBuzz {


                //If number is div by 3 show msg "Fizz"
                //If number is div by 5 show msg "Buzz"
                //If number is div by 3 and 5 show msg "FizzBuzz"
                //In any other case return given number


        public static String msg(int number) {

                if (number % 3 == 0 && number % 5 == 0){
                        return "FizzBuzz";
                }

                if (number % 3 == 0){
                        return "Fizz";
                }
                if (number % 5 == 0){
                        return "Buzz";
                }

                return String.valueOf(number);

        }
}
