package me.pokemon.battle.type;

import me.pokemon.battle.Pokemon;
import me.pokemon.battle.PokemonList;
import me.pokemon.battle.moves.GrassMove;
import me.pokemon.battle.moves.GroundMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroundType extends Pokemon {

    private String name;
    private List move = new ArrayList();
    private String getMove = "";
    private PokemonList groundList = new PokemonList();

    public List getGroundType(){
        return groundList.getGrassType();
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

        move.add(GroundMove.earthQuake());
        move.add(GroundMove.boneClub());
        move.add(GroundMove.earthPower());
        move.add(GroundMove.mudBomb());
        move.add(GroundMove.thousandArrow());

        String groundMove = (String) move.get(ran.nextInt(move.size()));

        getMove = null;
        getMove = groundMove;

        return getMove;
    }


    public String getGroundMove(){
        return getMove;
    }

    //Returns Damage Amount
    public int damage(){

        if(getGroundMove().equals(GroundMove.boneClub())) {
            return GroundMove.boneClubDamage;
        }
        else if (getGroundMove().equals(GroundMove.earthPower())) {
            return GroundMove.earthPowerDamage;
        }
        else if (getGroundMove().equals(GroundMove.earthQuake())) {
            return GroundMove.earthQuakeDamage;
        }
        else if (getGroundMove().equals(GroundMove.mudBomb())) {
            return GroundMove.mudBombDamage;
        }
        else if (getGroundMove().equals(GroundMove.thousandArrow())) {
            return GroundMove.thousandArrowsDamage;
        }

        return 0;
    }
}
