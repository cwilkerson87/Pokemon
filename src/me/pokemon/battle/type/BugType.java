package me.pokemon.battle.type;

import me.pokemon.battle.Pokemon;
import me.pokemon.battle.PokemonList;
import me.pokemon.battle.moves.BugMove;
import me.pokemon.battle.moves.GrassMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BugType extends Pokemon {

    private String name;
    private List move = new ArrayList();
    private String getMove = "";
    private PokemonList bugList = new PokemonList();

    public List getBugType(){
        return bugList.getBugType();
    }

    public void setPokemonName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String attack() {
        return moves();
    }

    @Override
    public String defend() {
        return getName() + " dodged the attack!";
    }

    //Pokemon Moves
    public String moves(){

        Random ran = new Random();

        move.add(BugMove.megaHorn());
        move.add(BugMove.furryCutter());
        move.add(BugMove.struggleBug());
        move.add(BugMove.silverWind());
        move.add(BugMove.xScissor());

        String bugMove = (String) move.get(ran.nextInt(move.size()));

        getMove = null;
        getMove = bugMove;

        return getMove;
    }


    public String getBugMove(){
        return getMove;
    }

    //Returns Damage Amount
    public int damage(){

        if(getBugMove().equals(BugMove.furryCutter())) {
            return BugMove.furryCutterDamage;
        }
        else if (getBugMove().equals(BugMove.struggleBug())) {
            return BugMove.struggleBugDamage;
        }
        else if (getBugMove().equals(BugMove.megaHorn())) {
            return BugMove.megaHornDamage;
        }
        else if (getBugMove().equals(BugMove.xScissor())) {
            return BugMove.xScissorDamage;
        }
        else if (getBugMove().equals(BugMove.silverWind())) {
            return BugMove.silverWindDamage;
        }

        return 0;
    }

}
