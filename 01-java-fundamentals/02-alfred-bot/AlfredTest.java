
public class AlfredTest{
    public static void main (String[] args){
        AlfredQuotes alfredBot= new AlfredQuotes();
        // String firstGreeting = alfredBot.basicGreeting();
        // System.out.println(firstGreeting);
        
        // String secondGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        // System.out.println(secondGreeting);

        // String dateCurrent = alfredBot.dateAnnouncement();
        // System.out.println(dateCurrent);

        String alexisBot = alfredBot.respondBeforeAlexis("Alexis");
        System.out.println(alexisBot);

        String nonRelevant = alfredBot.respondBeforeAlexis("Hello, I am a bot.");
        System.out.println(nonRelevant);

        String alfBot = alfredBot.respondBeforeAlexis("Alfred");
        System.out.println(alfBot);

        // String CooofeeeBot = alfredBot.CoffeeMachineBot("I make awesome coffee");
        // System.out.println(CooofeeeBot);
    }
}