package me.pokemon.battle.type;

import me.pokemon.battle.Pokemon;
import me.pokemon.battle.PokemonList;
import me.pokemon.battle.moves.FireMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FireType extends Pokemon implements FireMove {

    private PokemonList fireList = new PokemonList();
//    private List <String> name = new ArrayList<>();
    private String name;
    private List move = new ArrayList();
    private String getMove = "";


    public List getFireTypeName(){
        return fireList.getFireType();
    }

    public void setPokemonName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
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

        move.add(FireMove.ember());
        move.add(FireMove.fireSpin());
        move.add(FireMove.flamethrower());
        move.add(FireMove.firePunch());
        move.add(FireMove.fireBlast());

        String fireMove = (String) move.get(ran.nextInt(move.size()));

        getMove = null;
        getMove = fireMove;

        return getMove;
    }

    public String getFireMove(){
        return getMove;
    }

    //Returns Damage Amount
    public int damage(){

        if(getFireMove().equals(FireMove.ember())) {
            return FireMove.emberDamage;
        }
        else if (getFireMove().equals(FireMove.fireSpin())) {
            return FireMove.fireSpinDamage;
        }
        else if (getFireMove().equals(FireMove.firePunch())) {
            return FireMove.firePunchDamage;
        }
        else if (getFireMove().equals(FireMove.flamethrower())) {
            return FireMove.flamethrowerDamage;
        }
        else if (getFireMove().equals(FireMove.fireBlast())) {
            return FireMove.fireBlastDamage;
        }
        return 0;
    }
}
