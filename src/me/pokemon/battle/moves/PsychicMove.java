package me.pokemon.battle.moves;

public interface PsychicMove {


    int psychicDamage = 90;
    int psyBeamDamage = 65;
    int psychicFangsDamage = 85;
    int mistBallDamage = 70;
    int prismaticLaserDamage = 160;

    //Moves
    static String psychic(){
        return "Psychic!!";
    }

    static String psyBeam(){
        return "PsyBeam!!";
    }

    static String psychicFangs(){
        return "Psychic Fangs!!";
    }

    static String mistBall(){
        return "Mist Ball!!";
    }

    static String prismaticLaser(){
        return "Prismatic Laser!!";
    }
}
