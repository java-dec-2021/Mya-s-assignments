
public class AlfredTest{
    public static void main (String[] args){
        AlfredQuotes alfredBot= new AlfredQuotes();
        String firstGreeting = alfredBot.basicGreeting();
        System.out.println(firstGreeting);
        
        String secondGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        System.out.println(secondGreeting);

        String dateCurrent = alfredBot.dateAnnouncement();
        System.out.println(dateCurrent);

        String answerBeforeAlexis = alfredBot.respondBeforeAlexis("Play some music");
        System.out.println(answerBeforeAlexis);

        String CooofeeeBot = alfredBot.CoffeeMachineBot("I make awesome coffee");
        System.out.println(CooofeeeBot);
    }
}