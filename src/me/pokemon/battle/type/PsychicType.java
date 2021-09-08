package me.pokemon.battle.type;

import me.pokemon.battle.Pokemon;
import me.pokemon.battle.PokemonList;
import me.pokemon.battle.moves.GrassMove;
import me.pokemon.battle.moves.PsychicMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PsychicType extends Pokemon {

    private String name;
    private List move = new ArrayList();
    private String getMove = "";
    private PokemonList psychicList = new PokemonList();

    public List getPsychicType(){
        return psychicList.getGrassType();
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

        move.add(PsychicMove.psychic());
        move.add(PsychicMove.psychicFangs());
        move.add(PsychicMove.mistBall());
        move.add(PsychicMove.prismaticLaser());
        move.add(PsychicMove.psyBeam());

        String psychicMove = String.valueOf(move.get(ran.nextInt(move.size())));

        getMove = null;
        getMove = psychicMove;

        return getMove;
    }


    public String getPsychicMove(){
        return getMove;
    }

    //Returns Damage Amount
    public int damage(){

        if(getPsychicMove().equals(PsychicMove.psychicFangs())) {
            return PsychicMove.psychicFangsDamage;
        }
        else if (getPsychicMove().equals(PsychicMove.psychic())) {
            return PsychicMove.psychicDamage;
        }
        else if (getPsychicMove().equals(PsychicMove.psyBeam())) {
            return PsychicMove.psyBeamDamage;
        }
        else if (getPsychicMove().equals(PsychicMove.mistBall())) {
            return PsychicMove.mistBallDamage;
        }
        else if (getPsychicMove().equals(PsychicMove.prismaticLaser())) {
            return PsychicMove.prismaticLaserDamage;
        }

        return 0;
    }


}
