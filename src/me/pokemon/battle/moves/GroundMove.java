package me.pokemon.battle.moves;

public interface GroundMove {

    int boneClubDamage = 65;
    int earthQuakeDamage = 100;
    int mudBombDamage = 65;
    int thousandArrowsDamage = 90;
    int earthPowerDamage = 90;

    //Moves
    static String boneClub(){
        return "Bone Club!!";
    }

    static String earthQuake(){
        return "EarthQuake!!";
    }

    static String mudBomb(){
        return "Mud Bomb!!";
    }

    static String thousandArrow(){
        return "Thousand Arrows!!";
    }

    static String earthPower(){
        return "Earth Power!!";
    }

}
