package me.pokemon.battle.type;

import me.pokemon.battle.Pokemon;
import me.pokemon.battle.PokemonList;
import me.pokemon.battle.moves.ElectricMove;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElectricType extends Pokemon implements ElectricMove {

    private String name;
    private List move = new ArrayList();
    private String getMove = "";
    private PokemonList electricList = new PokemonList();

    public List getElectricTypeName(){
        return electricList.getFireType();
    }

    public void setPokemonName(String name){
        this.name = name;
    }

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

        move.add(ElectricMove.thunderShock());
        move.add(ElectricMove.thunderBolt());
        move.add(ElectricMove.thunder());
        move.add(ElectricMove.zapCannon());
        move.add(ElectricMove.boltCharge());

        String electricMove = (String) move.get(ran.nextInt(move.size()));

        getMove = null;
        getMove = electricMove;

        return getMove;
    }


    public String getElectricMove(){
        return getMove;
    }

    //Returns Damage Amount
    public int damage(){

            if(getElectricMove().equals(ElectricMove.thunderShock())) {
                return ElectricMove.thunderShockDamage;
            }
            else if (getElectricMove().equals(ElectricMove.thunderBolt())) {
                return ElectricMove.thunderBoltDamage;
            }
            else if (getElectricMove().equals(ElectricMove.thunder())) {
                return ElectricMove.thunderDamage;
            }
            else if (getElectricMove().equals(ElectricMove.zapCannon())) {
                return ElectricMove.zapCannonDamage;
            }
            else if (getElectricMove().equals(ElectricMove.boltCharge())) {
                return ElectricMove.boltChargeDamage;
            }

        return 0;
    }
}
