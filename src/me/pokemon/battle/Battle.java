package me.pokemon.battle;


import me.pokemon.battle.type.*;

import java.util.*;

public class Battle {

   private ElectricType electricType = new ElectricType();
   private FireType fireType = new FireType();


   private boolean matchBegin = true;

   private boolean hit;

   private boolean p1Attack;
   private boolean p2Attack;

   private int maxHealth = 150;

    int pokemon;

   private Random ran = new Random();
   private boolean check = false;

   private PokemonList list = new PokemonList();

   private HashMap<Integer, String> menu = new HashMap<>();

   private List<String> view = new ArrayList<>();

   private int battleNumber;
   private int max;

    int incr;

    Pokemon yPokemon;


    int playerWins;
    int opponentWins;




    public Battle() {

        //Load Pokemon Types
        list.bug();
        list.electric();
        list.fire();
        list.grass();
        list.ground();
        list.pyschic();

        battleNumber = ran.nextInt(6) + 1;
        List <String> pokeballs = new ArrayList<>();
        List<String> opponent = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        System.out.println();
        System.out.println("This Will Be A " + battleNumber + " On " + battleNumber + " Battle!");
        int start = battleNumber;
        System.out.println();
        System.out.println("Choose Your Pokemon: Enter A Number 1-24 to choose!");

        int counter = 0;

        for (String pokemon : list.getPokemonList()) {
            counter++;
            menu.put(counter, pokemon);

            System.out.print((counter) + ": " + pokemon + "\n");
        }

        System.out.println();

        check = true;

        boolean select = false;

        do {

            while (!select) {
                try {

                    if (battleNumber - max == start) {

                        System.out.println("Pick A Number To Choose " + (battleNumber - max) + " Pokemon.");
                        System.out.print("#");
                        int p = sc.nextInt();
                        pokemon = p;

                        select = true;

                    } else if (battleNumber - max != 0) {
//                System.out.println();
                        System.out.println("Pick A Number To Choose " + (battleNumber - max) + " More Pokemon.");
                        System.out.print("#");
                        int p = sc.nextInt();
                        pokemon = p;

                        select = true;

                    }

                    //Picks Your Pokemon
                    switch (pokemon) {
                        case 1:
                            view.add(menu.get(1));
                            System.out.println();
                            System.out.println(view.toString() + "\n");
                            break;
                        case 2:
                            view.add(menu.get(2));
                            System.out.println();
                            System.out.println(view.toString() + "\n");
                            break;
                        case 3:
                            view.add(menu.get(3));
                            System.out.println();
                            System.out.println(view.toString() + "\n");
                            break;
                        case 4:
                            view.add(menu.get(4));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 5:
                            view.add(menu.get(5));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 6:
                            view.add(menu.get(6));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 7:
                            view.add(menu.get(7));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 8:
                            view.add(menu.get(8));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 9:
                            view.add(menu.get(9));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 10:
                            view.add(menu.get(10));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 11:
                            view.add(menu.get(11));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 12:
                            view.add(menu.get(12));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 13:
                            view.add(menu.get(13));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 14:
                            view.add(menu.get(14));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 15:
                            view.add(menu.get(15));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 16:
                            view.add(menu.get(16));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 17:
                            view.add(menu.get(17));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 18:
                            view.add(menu.get(18));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 19:
                            view.add(menu.get(19));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 20:
                            view.add(menu.get(20));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 21:
                            view.add(menu.get(21));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 22:
                            view.add(menu.get(22));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 23:
                            view.add(menu.get(23));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        case 24:
                            view.add(menu.get(24));
                            System.out.println();
                            System.out.println(view.toString());
                            break;
                        default:
                            System.out.println();
                            System.out.println("That Is An Incorrect Number!!!");
                            System.out.println("Chose a Number Between 1 And " + counter + ".");

                            select = false;
                            check = true;
                    }


                    if(select){
                        pokeballs.add(menu.get(pokemon));
                        max++;
                        select = false;
                    }

                } catch (InputMismatchException e) {
                    System.out.println();
                    System.out.println("That Was An Incorrect Choice!!!");
                    System.out.println("Choose A Number Between 1 And " + counter + ".");
                    sc.next();
                    select = false;
                }

                System.out.println("-----------------------------------------------------------------");
                System.out.println(" ");

                if(max == battleNumber){
                    select =true;
                }
            }

        } while (max != battleNumber);

        System.out.println();

        System.out.println("You Choose: ");

        int lineUpCount = 0;
        for (String lineUp : view) {
            lineUpCount++;
            System.out.println(lineUpCount + ": " + lineUp);
        }

        System.out.println();

        System.out.println("Your Opponent Choose: ");
        for (int i = 0; i < battleNumber; i++) {
            opponent.add(menu.get(ran.nextInt(24) + 1));
            System.out.println(i + 1 + ". " + opponent.get(i));

        }

        System.out.println();

        System.out.println("Lets Battle!!!");

        System.out.println();

        System.out.println("Send Out Your First Pokemon");


        while (opponentWins != battleNumber || playerWins != battleNumber) {

            int healthRemainingP1 = maxHealth;
            int healthRemainingP2 = maxHealth;
            String yourPokemon = "";
            int p = 0;

            System.out.println();
            System.out.println("Pick A Number To Choose Your Pokemon...");
            for (int i = 0; i < pokeballs.size(); i++) {
                System.out.println(i + 1 + ". " + pokeballs.get(i));

            }
            boolean tryAgain = false;

            while (!tryAgain){

                try {
                    System.out.print("#");
                    p = sc.nextInt();


                    tryAgain = true;


                    switch (p) {

                        case 1:
                            yourPokemon = pokeballs.get(0);
                            break;
                        case 2:
                            yourPokemon = pokeballs.get(1);
                            break;
                        case 3:
                            yourPokemon = pokeballs.get(2);
                            break;
                        case 4:
                            yourPokemon = pokeballs.get(3);
                            break;
                        case 5:
                            yourPokemon = pokeballs.get(4);
                            break;
                        case 6:
                            yourPokemon = pokeballs.get(5);
                            break;
                        default:
                            System.out.println();
                            System.out.println("That Is An Incorrect Number!!!");
                            System.out.println("Choose a Number Between 1 And " + counter + ".");
                            tryAgain = false;

                }

                }catch (InputMismatchException  | IndexOutOfBoundsException ex){
                    System.out.println();
                    System.out.println("That Choice Was Incorrect!!! ");
                    System.out.println("Choose A Number Between 1 And " + counter + ".");
                    tryAgain = false;
                    sc.next();

                }

            }

            String opponentPokemon = opponent.get(ran.nextInt(opponent.size()));

            System.out.println();
            System.out.print(yourPokemon + "'s " + "Health: " + healthRemainingP2 + "    ");
            System.out.println(opponentPokemon + "'s " + "Health: " + healthRemainingP1);
            System.out.println();

            //Sets Player's Pokemon's Type And Name
            if (list.getFireType().contains(yourPokemon)) {
                FireType fireTypePokemon = new FireType();
                fireTypePokemon.setPokemonName(yourPokemon);
                yPokemon = fireTypePokemon;
            } else if(list.getPsychicType().contains(yourPokemon)){
                PsychicType psychicTypePokemon = new PsychicType();
                psychicTypePokemon.setPokemonName(yourPokemon);
                yPokemon = psychicTypePokemon;
            } else if(list.getGroundType().contains(yourPokemon)){
                GroundType groundTypePokemon = new GroundType();
                groundTypePokemon.setPokemonName(yourPokemon);
                yPokemon = groundTypePokemon;
            } else if (list.getElectricType().contains(yourPokemon)) {
                ElectricType electricTypePokemon = new ElectricType();
                electricTypePokemon.setPokemonName(yourPokemon);
                yPokemon = electricTypePokemon;
            } else if (list.getGrassType().contains(yourPokemon)) {
                GrassType grassTypePokemon = new GrassType();
                grassTypePokemon.setPokemonName(yourPokemon);
                yPokemon = grassTypePokemon;
            } else if (list.getBugType().contains(yourPokemon)) {
                BugType bugTypePokemon = new BugType();
                bugTypePokemon.setPokemonName(yourPokemon);
                yPokemon = bugTypePokemon;
            }

            Pokemon opPokemon = null;

            //Sets Opponents Pokemon's Type And Name
            if (list.getFireType().contains(opponentPokemon)) {
                FireType fireTypePokemon = new FireType();
                fireTypePokemon.setPokemonName(opponentPokemon);
                 opPokemon = fireTypePokemon;
            } else if (list.getElectricType().contains(opponentPokemon)) {
                ElectricType electricTypePokemon = new ElectricType();
                electricTypePokemon.setPokemonName(opponentPokemon);
                opPokemon = electricTypePokemon;
            } else if (list.getGrassType().contains(opponentPokemon)) {
                GrassType grassTypePokemon = new GrassType();
                grassTypePokemon.setPokemonName(opponentPokemon);
                opPokemon = grassTypePokemon;
            } else if (list.getBugType().contains(opponentPokemon)) {
                BugType bugTypePokemon = new BugType();
                bugTypePokemon.setPokemonName(opponentPokemon);
                opPokemon = bugTypePokemon;
            }else if(list.getPsychicType().contains(opponentPokemon)){
                PsychicType psychicTypePokemon = new PsychicType();
                psychicTypePokemon.setPokemonName(opponentPokemon);
                opPokemon = psychicTypePokemon;
            }else if(list.getGroundType().contains(opponentPokemon)){
                GroundType groundTypePokemon = new GroundType();
                groundTypePokemon.setPokemonName(opponentPokemon);
                opPokemon = groundTypePokemon;
            }

            Pokemon poke1 = yPokemon;
            Pokemon poke2 = opPokemon;

            while (healthRemainingP2 > 0 && healthRemainingP1 > 0) {

                if (attackFirst() == 0 && matchBegin) {

                    System.out.println("Opponent's " + poke2.getName() + " Used " + poke2.moves() + "");
                    matchBegin = false;
                    p1Attack = true;
                    p2Attack = false;
                } else if (attackFirst() == 1 && matchBegin) {

                    System.out.println("Player's " + poke1.getName() + " Used " + poke1.moves() + "");
                    matchBegin = false;
                    p2Attack = true;
                    p1Attack = false;
                } else {

                    int decision = ran.nextInt(6);

                    if (decision <= 3) {

                        System.out.println("Opponent's " + poke2.getName() + " Used " + poke2.attack());
                        p1Attack = true;
                        p2Attack = false;
                    } else {

                        System.out.println("Player's " + poke1.getName() + " Used " + poke1.attack());
                        p2Attack = true;
                        p1Attack = false;
                    }
                }

                int ranNum = ran.nextInt(6);

                //Chooses Who Defends
                if (p1Attack && ranNum <= 3) {
                    System.out.println("Player's " + poke1.defend());
                    System.out.println();

                } else if (p2Attack && ranNum <= 3) {
                    System.out.println("Opponent's " + poke2.defend());
                    System.out.println();

                } else {
                    hit = true;
                }

                //Tells when pokemon has been hit and how much damage done
                if (hit && p2Attack) {

                    healthRemainingP1 = healthRemainingP1 - poke1.damage();

                    System.out.println("Opponent's " + poke2.getName() + " Was Hit. It Took " + poke1.damage() + " Damage.");

                    if (healthRemainingP1 < 0){
                        System.out.println("Opponent's " + poke2.getName() + " Has " + "0" + " Health Remaining.");
                        opponent.remove(opponentPokemon);

                    }
                    else
                        System.out.println("Opponent's " + poke2.getName() + " has " + healthRemainingP1 + " Health Remaining.");

                    hit = false;
                    System.out.println();
                }
                else if (hit && p1Attack) {

                    healthRemainingP2 = healthRemainingP2 - poke2.damage();

                    System.out.println("Player's " + poke1.getName() + " Was Hit. It Took " + poke2.damage() + " Damage.");

                    if (healthRemainingP2 <= 0) {
                        System.out.println("Player's " + poke1.getName() + " Has " + "0" + " Health Remaining.");
                        pokeballs.remove(yourPokemon);
                    }
                    else
                        System.out.println("Player's " + poke1.getName() + " Has " + healthRemainingP2 + " Health Hemaining.");
                        System.out.println();
                    hit = false;
                }
            }

            if (healthRemainingP1 <= 0) {
                System.out.println("Player's " + poke1.getName() + " WINS!!");
                System.out.println();

                int i = 0;

                if(playerWins != battleNumber) {
                    System.out.println("Opponent's Pokemon: ");
                    for (String pokemon : opponent) {
                        System.out.print(++i + ". " + pokemon + " ");
                        System.out.println();
                    }
                    System.out.println();
                }
                ++playerWins;

            }

            else if (healthRemainingP2 <= 0){
                System.out.println( "Opponent's " + poke2.getName() + " WINS!!");
                System.out.println();
                ++opponentWins;
            }

            if(pokeballs.isEmpty()){
                System.out.println("You Have No More Pokemon Left. You Lose!!");
                break;
            }
            else if(opponent.isEmpty()) {
                System.out.println("The Opponent Doesn't Have Any Pokemon Left!! You Win!!");
                break;
            }

        }
    }
    //Decides who attacks first
    private int attackFirst(){
        int ranNum = ran.nextInt(2);
        return ranNum;
    }
}
