
public interface PokemonInterface {

Pokemon createPokemon(String name, int health, String Type);
    
String pokemonInfo(Pokemon pokemon);

void listPokemon();
}