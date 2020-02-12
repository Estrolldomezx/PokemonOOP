package com.company;
//Novice.java

import java.util.Random;

/**
 * @author Wanish Sengkhim 6110110617
 */
public class Play {
    String monName;
    String Skills;
    boolean Skillstatus;
    int Uplevel, eneHP = 200, HP, Damage, Berrycount;

    Play() {
        monName = "Charmander";
        HP = 100;
        Damage = 15;
        Skills = "Fire Blast";
        Skillstatus = false;
        Uplevel = 0;
        Berrycount = 0;
    }

    Play(String monName, int HP, String Skills, boolean Status, int uplevel, int damage) {
        this.monName = monName;
        this.HP = HP;
        this.Skills = Skills;
        this.Skillstatus = Status;
        this.Damage = damage;
    }

    void print() {
        System.out.println("\nMy buddy is: " + monName);
        System.out.println("HP: " + HP);
        System.out.println("Skill: " + Skills);
        System.out.println("Skill Status: " + Skillstatus);
    }

    void fight() {
        do {
            System.out.println("===============================================");
            System.out.println("=================BATTLE !======================");
            System.out.println("===============================================");
            System.out.println("My Buddy is: " + monName + "\t\t\t\t\t Monster's HP" + eneHP);
            System.out.println("HP: " + HP + "\t\t\t\t\t");
            System.out.println("Skill: " + Skills + "\t\t\t\t\t");
            System.out.println("Skill Status: " + Skillstatus + "\t\t\t\t\t");

            System.out.println("What do you want to do?");
            System.out.println("(1)Battle  (2)Skills  (3)Bag  (4)Run");
            Main Val = new Main();
            int choose = Val.selectPokemon();

            if (choose == 1) {
                HP -= 10;
                eneHP -= Damage;
            } else if (choose == 2) {
                if (Skillstatus) {
                    if (monName.equals("Charmander") && Skills.equals("Fire Blast")) {
                        System.out.println("               (  .      )");
                        System.out.println("           )           (              )");
                        System.out.println("                 .  '   .   '  .  '  .");
                        System.out.println("        (    , )       (.   )  (   ',    )\t\t\t\t\t Fire Blast");
                        System.out.println("         .' ) ( . )    ,  ( ,     )   ( .\t\t\t\t\tMonsterHP: -70");
                        System.out.println("      ). , ( .   (  ) ( , ')  .' (  ,    )");
                        System.out.println("     (_,) . ), ) _) _,')  (, ) '. )  ,. (' )");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                        //HP += 20;
                        eneHP -= 70;
                        Skillstatus = false;
                    } else if (monName.equals("Squirtle") && Skills.equals("Hydro pump")) {
                        System.out.println("_      _      _      _      _      _      _      _");
                        System.out.println(")`'-.,_)`'-.,_)`'-.,_)`'-.,_)`'-.,_)`'-.,_)`'-.,_)`'-.,_\t\t\t\tHydro pump");
                        System.out.println("_     _     _     _     _     _     _     _");
                        System.out.println(")`'-.,)`'-.,)`'-.,)`'-.,)`'-.,)`'-.,)`'-.,)`'-.,\t\t\t\t\tMonsterHP: -50");
                        System.out.println(" _       _      _       _      _      _");
                        System.out.println("( `'-.,_( `'-.,( `'-.,_( `'-._( `'-.,( `'-.,");

                        //HP += 20;
                        eneHP -= 50;
                        Skillstatus = false;
                    } else if (monName.equals("Bulbasaur") && Skills.equals("Frenzy plant")) {
                        System.out.println("   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(");
                        System.out.println("`-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `");
                        System.out.println("   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(\t\t\t\t\t Frenzy plant\"");
                        System.out.println("`-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `\t\t\t\t\tMonsterHP: -45");
                        System.out.println("   ,(   ,(   ,(   ,(   ,(   ,(   ,(   ,(");
                        System.out.println("`-'  `-'  `-'  `-'  `-'  `-'  `-'  `-'  `");
                        //HP += 20;
                        eneHP -= 45;
                        Skillstatus = false;
                    } else if (monName.equals("Pikatchu") && Skills.equals("Thunder Bolt")) {
                        System.out.println("  (_                       __))");
                        System.out.println("    ((                _____)");
                        System.out.println("      (_________)----'");
                        System.out.println("         _/  /");
                        System.out.println("        /  _/");
                        System.out.println("      _/  /\t\t\t\t\t Thunder Bolt");
                        System.out.println("     / __/\t\t\t\t\tMonsterHP: -65");
                        System.out.println("   _/ /");
                        System.out.println("  /__/");
                        System.out.println(" //");
                        System.out.println("/'");
                        //HP += 20;
                        eneHP -= 65;
                        Skillstatus = false;

                    } else {
                        System.out.println("\n\t\t  ==================================");
                        System.out.println("\t\t\t <== *Cannot use skills* ==>");
                        System.out.println("\n\t\t  ==================================");
                        fight();
                    }
                } else if (choose == 3) {
                    Bag OpenBag = new Bag();
                    OpenBag.print(Berrycount);
                } else {
                    return;
                }
            }
            }while (eneHP > 0 && HP > 0) ;

            if (eneHP <= 0) {
                System.out.println("=========> You Win <=========");
                //Random rand = new Random();
                //int n = rand.nextInt(2);
            } else {
                System.out.println(" *** Game Over !!! *** ");
            }

            fight();


    }
}

