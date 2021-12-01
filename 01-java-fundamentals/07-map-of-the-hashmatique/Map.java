import java.util.HashMap;
// import java.util.Set;
public class Map{
    public static void main(String[] args){
        HashMap<String, String> song= new HashMap<String, String>();
        song.put("Ghost", "the ghost of you ...... ghost of you");
        song.put("Champion", "waka waka aaa");
        song.put("friends", "we are friends");
        song.put("woke up late", "woke up late.....");

        // String name = song.get("waka waka aaa");
        // System.out.println("Lyrics : " + name);

        System.out.println(song.get("Ghost"));

        
        // for(HashMap.Entry<String, String> track:song.entrySet()){
        //     System.out.println(track.getKey() + " : " + track.getValue());
        
        }
     
    

}