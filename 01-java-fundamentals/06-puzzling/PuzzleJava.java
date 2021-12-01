import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava{
    public void getTenRolls(){
        Random randMachine = new Random();
        ArrayList <Object> arr = new ArrayList <Object>();
        // int[] x= new int [10];
        for (int i = 1; i <=10; i++){
            
            int randomInteger= randMachine.nextInt(20);
            arr.add(randomInteger);
        }
        System.out.println(arr);
    }
        // getRandomLetter
    public String getRandomLetter(){
        Random rand = new Random();
        // ArrayList <Object> arr = new ArrayList <Object>();
        String [] array={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        int randomLetters = rand.nextInt(26);
        // arr.add(randomLetters);
        return(array[randomLetters]);
        }

        // generatePassword
        public String generatePassword(){
            String password = "";
            for(int i = 0; i<8; i++){
                password = password + getRandomLetter();
            }
            return password;
        }
        
        // getNewPasswordSet
        public ArrayList<Object> getNewPassword(int length){
            ArrayList <Object> newPassword = new ArrayList <Object>();
            for(int i = 0; i<length; i++){
                newPassword.add(generatePassword());
            }
            return newPassword;
        }
        
        // Sensei Bonus;
        // shuffle way
        // public static shuffleArray(int arr[]){
        //     Random rand = new Random();
        //     for(int i = 0; i< arr[]; i++)
        //     return "hello";
        // }

    }
