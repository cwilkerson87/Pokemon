import java.util.ArrayList;

public interface ElectricMove {

    int thunderShockDamage = 20;
    int thunderBoltDamage = 40;
    int thunderDamage = 120;
    int zapCannonDamage = 150;
    int boltChargeDamage = 60;


    //Moves
    static String thunderShock(){
        return "Thundershock!!";
    }

    static String thunderBolt(){
        return "Thunderbolt!!";
    }

    static String thunder(){
        return "Thunder!!";
    }

    static String zapCannon(){
        return "ZapCannon!!";
    }

    static String boltCharge(){
        return "BoltCharge!!";
    }


}
