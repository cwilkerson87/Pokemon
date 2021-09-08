package me.pokemon.battle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonList {


   public static List<String> pokemonList = new ArrayList();


    public void grass() {

        pokemonList.add("Bulbasaur");
        pokemonList.add("Oddish");
        pokemonList.add("Bellsprout");
        pokemonList.add("Exeggcute");

    }

    public List getGrassType(){
        return Arrays.asList("Bulbasaur","Oddish","Bellsprout","Exeggcute");
    }

    public void fire() {
        pokemonList.add("Charmander");
        pokemonList.add("Vulpix");
        pokemonList.add("Growlithe");
        pokemonList.add("Ponyta");
        pokemonList.add("Magmar");

    }

    public List getFireType(){
        return Arrays.asList("Charmander","Vulpix","Growlithe","Ponyta","Magmar");
    }

    public void water() {
        pokemonList.add("Squirtle");
        pokemonList.add("Poliwag");
        pokemonList.add("Seel");
        pokemonList.add("Shellder");
        pokemonList.add("Krabby");
        pokemonList.add("Horsea");
        pokemonList.add("Goldeen");
        pokemonList.add("Staryu");
        pokemonList.add("Magikarp");
        pokemonList.add("Lapras");

    }

    public List getBugType(){
        return Arrays.asList("Caterpie","Weedle","Venonat","Scyther","Pinsir");
    }

    public void bug() {
        pokemonList.add("Caterpie");
        pokemonList.add("Weedle");
        pokemonList.add("Venonat");
        pokemonList.add("Scyther");
        pokemonList.add("Pinsir");

    }

    public void flying() {
        pokemonList.add("Pidgey");
        pokemonList.add("Spearow");

    }

    public void ground() {
        pokemonList.add("Diglett");
        pokemonList.add("Sandshrew");
        pokemonList.add("Cubone");

    }
    public List getGroundType(){
        return Arrays.asList("Diglett","Sandshrew","Cubone");
    }

    public void electric() {
        pokemonList.add("Magnemite");
        pokemonList.add("Electabuzz");
        pokemonList.add("Pikachu");
        pokemonList.add("Voltorb");

    }

    public List getElectricType(){
        return Arrays.asList("Magnemite","Electabuzz","Pikachu","Voltorb");
    }

    public void pyschic() {
        pokemonList.add("Mr. Mime");
        pokemonList.add("Drowzee");
        pokemonList.add("Abra");
    }

    public List getPsychicType(){
        return Arrays.asList("Mr. Mime" , "Drowzee", "Abra");
    }


    public List<String> getPokemonList() {
        return pokemonList;
    }
}
