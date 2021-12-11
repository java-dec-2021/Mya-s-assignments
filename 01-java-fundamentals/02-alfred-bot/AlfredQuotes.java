
import java.util.Date;
public class AlfredQuotes{

    public String basicGreeting(){
        return "Hello, lovely to see you! How are you?";
    }

    public String guestGreeting(String name, String dayPeriod){
        return(String.format("Good %s, %s lovely to see you!", dayPeriod, name));
    }

    public String dateAnnouncement(){
            Date date = new Date();
            return "Current date is: " + date;
        }


    public String respondBeforeAlexis(String conversation){
        
        if (conversation.indexOf("Alexis") != -1){
            return("Right away, sir. She certainly isn't sophisticated enough for that.");
        }
        else if(conversation.indexOf("Alfred") != -1){
            return "At your service! As you wish, naturally.";
        }
        else{
            return("Right, and with that I shall retire.");
        }
    }

    // Ninja Bonus
    public String CoffeeMachineBot(String conversation){
    
        if (conversation.indexOf("CoCoBot") < 1){
            return "Twee Twee! not available";
        }
        else if(conversation.indexOf("CoffeeBot") < 1){
            return "I am here!";
        }
        else{
            return "Right away sir!";
        }
    }
    }