import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElectricType extends Pokemon implements ElectricMove{

    private final String name = "Pikachu";
    private List move = new ArrayList();
    private String getMove = "";

    public String getName(){
        return name;
    }

    @Override
    String attack() {
        return moves();
    }

    @Override
    String defend() {
        return getName() + " dodged the attack!";
    }

    //Pokemon Moves
     String moves(){

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
