public class FizzBuzz{
    public String fizzbuzz(int number){
        if( number % 3==0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if ( number % 5 == 0 ){
            return "Buzz";
        }
        else if ( number % 3==0 ){
            return "Fizz";
        }
        else{
            return String.valueOf(number);
            // return Ineger.toString(number);
        }
    }

    // ninja bonus
    public String fizzbuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word){
        if (number % 18 == 0){
            if (multOf3Word == null)
                return "fizz";
            else{
                return multOf3Word;
            }
        }
        else if (number % 25 == 0){
            if (multOf5Word == null)
                return "Buzz";
            else{
                return multOf5Word;
            }
        }
        else if (number % 30 == 0){
            if (multOf15Word == null)
                return "FizzBuzz";
            else{
                return multOf15Word;
            }
        }
        else{
            return String.valueOf(number);
        }
        
    }
}