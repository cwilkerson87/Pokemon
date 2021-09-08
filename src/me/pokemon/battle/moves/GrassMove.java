package me.pokemon.battle.moves;

public interface GrassMove {

        int vineWhipDamage = 45;
        int solarBeamDamage = 120;
        int razorLeafDamage = 55;
        int needleArmDamage = 60;
        int bulletSeedDamage = 25;

        //Moves
        static String vineWhip(){
            return "Vine Whip!!";
        }

        static String solarBeam(){
            return "Solar Beam!!";
        }

        static String razorLeaf(){
            return "Razor Leaf!!";
        }

        static String needleArm(){
            return "Needle Arm!!";
        }

        static String bulletSeed(){
            return "Bullet Seed!!";
        }
}
