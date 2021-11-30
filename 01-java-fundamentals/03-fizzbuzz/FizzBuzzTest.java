public class FizzBuzzTest{
    public static void main (String[] args){
        FizzBuzz test = new FizzBuzz();

        System.out.println(test.fizzbuzz(9));
        System.out.println(test.fizzbuzz(10));
        System.out.println(test.fizzbuzz(15));
        System.out.println(test.fizzbuzz(19));
        System.out.println(test.fizzbuzz(2));

        for (int i = 1; i <= 50; i++) {
            System.out.println(test.fizzbuzz(i));
        }
    }
}