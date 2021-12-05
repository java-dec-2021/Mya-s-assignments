import java.util.ArrayList;
public class Pokedex extends AbstractPokemon{

    // attributes
    ArrayList<String> myPokemons;
    public void listPokemon() {
        for (String p : myPokemons) {
            System.out.println(p);
        }
    }

    
}