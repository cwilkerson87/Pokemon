package me.pokemon.battle.moves;

public interface BugMove {

    int xScissorDamage = 80;
    int silverWindDamage = 60;
    int megaHornDamage = 120;
    int furryCutterDamage = 40;
    int struggleBugDamage = 50;

    //Moves
    static String xScissor(){
        return "X Scissor!!";
    }

    static String silverWind(){
        return "Silver Wind!!";
    }

    static String megaHorn(){
        return "Mega Horn!!";
    }

    static String furryCutter(){
        return "Furry Cutter!!";
    }

    static String struggleBug(){
        return "Struggle Bug!!";
    }

}
