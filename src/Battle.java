import java.util.Random;

public class Battle {

   private ElectricType electricType = new ElectricType();
   private FireType fireType = new FireType();

   private boolean matchBegin = true;

   private boolean hit;

   private boolean p1Attack;
   private boolean p2Attack;

   private int healthRemainingP1 = 150;
   private int healthRemainingP2 = 150;

   private Random ran = new Random();


    public Battle(){


        System.out.println();
        System.out.print(fireType.getName() + "'s "+ " Health: " + healthRemainingP2 + "    ");
        System.out.println(electricType.getName() + "'s "+ " Health: " + healthRemainingP1);
        System.out.println();

        while(healthRemainingP2  > 0 && healthRemainingP1 > 0 ) {

            if (attackFirst() == 0 && matchBegin) {

                System.out.println(electricType.getName() + " use " + electricType.moves() + "");
                matchBegin = false;
                p1Attack = true;
                p2Attack = false;
            } else if (attackFirst() == 1 && matchBegin) {

                System.out.println(fireType.getName() + " use " + fireType.moves() + "");
                matchBegin = false;
                p2Attack = true;
                p1Attack = false;
            } else {

                int decision = ran.nextInt(6);

                if (decision <= 3) {

                    System.out.println(electricType.getName() + " use " + electricType.attack());
                    p1Attack = true;
                    p2Attack = false;
                } else {

                    System.out.println(fireType.getName() + " use " + fireType.attack());
                    p2Attack = true;
                    p1Attack = false;
                }
            }

            int ranNum = ran.nextInt(6);

            if (p1Attack && ranNum <= 3) {
                System.out.println(fireType.defend());
                System.out.println();

            }
            else if (p2Attack && ranNum <= 3) {
                System.out.println(electricType.defend());
                System.out.println();

            }
            else {
                hit = true;
            }

            //Tells when pokemon has been hit and how much damage done
            if (hit && p2Attack) {

                healthRemainingP1 =healthRemainingP1  - fireType.damage();

                System.out.println(electricType.getName() + " was hit. It took " + fireType.damage() + " damage.");

                if(healthRemainingP1 < 0)
                    System.out.println(electricType.getName() + " has " + "0" + " health remaining.");
                else
                    System.out.println(electricType.getName() + " has " + healthRemainingP1 + " health remaining.");

                hit = false;
                System.out.println();
            }

           else if (hit && p1Attack) {

                healthRemainingP2 = healthRemainingP2 - electricType.damage();

                System.out.println(fireType.getName() + " was hit. It took " + electricType.damage() + " damage.");

                if(healthRemainingP2 < 0)
                    System.out.println(fireType.getName() + " has " + "0" + " health remaining.");
                else
                    System.out.println(fireType.getName() + " has " + healthRemainingP2 + " health remaining.");

                hit = false;
                System.out.println();
            }
        }

        if(healthRemainingP1 <= 0){
            System.out.println(fireType.getName() + " WINS!!");
        }
        else if(healthRemainingP2 <= 0)
            System.out.println(electricType.getName() + " WINS!!");
    }

    //Decides who attacks first
    private int attackFirst(){
        int ranNum = ran.nextInt(2);
        return ranNum;
    }


}
