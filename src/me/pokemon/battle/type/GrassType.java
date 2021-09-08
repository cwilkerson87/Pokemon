package me.pokemon.battle.type;

import me.pokemon.battle.Pokemon;
import me.pokemon.battle.PokemonList;
import me.pokemon.battle.moves.GrassMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrassType extends Pokemon {

    private String name;
    private List move = new ArrayList();
    private String getMove = "";
    private PokemonList grassList = new PokemonList();

    public List getGrassType(){
        return grassList.getGrassType();
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

        move.add(GrassMove.needleArm());
        move.add(GrassMove.bulletSeed());
        move.add(GrassMove.razorLeaf());
        move.add(GrassMove.solarBeam());
        move.add(GrassMove.vineWhip());

        String grassMove = (String) move.get(ran.nextInt(move.size()));

        getMove = null;
        getMove = grassMove;

        return getMove;
    }


    public String getGrassMove(){
        return getMove;
    }

    //Returns Damage Amount
    public int damage(){

        if(getGrassMove().equals(GrassMove.bulletSeed())) {
            return GrassMove.bulletSeedDamage;
        }
        else if (getGrassMove().equals(GrassMove.needleArm())) {
            return GrassMove.needleArmDamage;
        }
        else if (getGrassMove().equals(GrassMove.razorLeaf())) {
            return GrassMove.razorLeafDamage;
        }
        else if (getGrassMove().equals(GrassMove.solarBeam())) {
            return GrassMove.solarBeamDamage;
        }
        else if (getGrassMove().equals(GrassMove.vineWhip())) {
            return GrassMove.vineWhipDamage;
        }

        return 0;
    }
}
