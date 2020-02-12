package com.company;

import java.util.Scanner;

/**
 * @author Wanish Sengkhim 6110110617
 */
public class Main {
    public static Main Val;

    public int selectPokemon(){
        Scanner selected = new Scanner(System.in);
        System.out.print("What do you choose ? :");
        int val = selected.nextInt();
        return val;
    }
    public static void main(String[] args) {
	// About Pokemon
        System.out.println(" ._________________________.");
        System.out.println(" | _______________________ |");
        System.out.println(" | I                     I |");
        System.out.println(" | I                     I |");
        System.out.println(" | I        POKEMON      I |");
        System.out.println(" | I   Prayuth & Prawit  I |");
        System.out.println(" | I                     I |");
        System.out.println(" | I_____________________I |");
        System.out.println(" !_________________________!");
        System.out.println("        ._[_______]_.");
        System.out.println("    .___|___________|___.");
        System.out.println("    |::: ____           |");
        System.out.println("    |    ~~~~ [CD-ROM]  |");
        System.out.println("    !___________________!");

        System.out.println("Choose your buddy");
        System.out.println("(1) Charmander (Fire)");
        System.out.println("(2) Squirtle (Water)");
        System.out.println("(3) Bulbasaur (Grass)");
        System.out.println("(4) Pikatchu (Electric)");

        Main Val = new Main();
        int SelectedP = Val.selectPokemon();

        if(SelectedP == 1){
            System.out.println("I choose you, Charmander !!!");
            Mons1 monsI = new Mons1();
            monsI.print();
            Scanner chF = new Scanner(System.in);
            System.out.print("\nDo you want to fight? (Yes or No):");
            String fight = chF.nextLine();

            if(fight.equals("YES")||fight.equals("yes")||fight.equals("y")||fight.equals("Y")){
                Mons1 mode = new Mons1();
                mode.fight();

            }
            else{
                return;
            }

        }
        else if(SelectedP == 2){
            System.out.println("I choose you, Squirtle !!!");
            Mons2 monsII = new Mons2();
            monsII.print();
            Scanner chF = new Scanner(System.in);
            System.out.print("\nDo you want to fight? (Yes or No):");
            String fight = chF.nextLine();

            if(fight.equals("YES")||fight.equals("yes")||fight.equals("y")||fight.equals("Y")){
                Mons2 mode = new Mons2();
                mode.fight();

            }
            else{
                return;
            }

        }
        else if(SelectedP == 3){
            System.out.println("I choose you, Bulbasaur !!!");
            Mons3 monsIII = new Mons3();
            monsIII.print();
            Scanner chF = new Scanner(System.in);
            System.out.print("\nDo you want to fight? (Yes or No):");
            String fight = chF.nextLine();

            if(fight.equals("YES")||fight.equals("yes")||fight.equals("y")||fight.equals("Y")){
                Mons3 mode = new Mons3();
                mode.fight();

            }
            else{
                return;
            }

        }
        else if(SelectedP == 4){
            System.out.println("I choose you, Pikatchu !!!");
            Mons4 monsIV = new Mons4();
            monsIV.print();
            Scanner chF = new Scanner(System.in);
            System.out.print("\nDo you want to fight? (Yes or No):");
            String fight = chF.nextLine();

            if(fight.equals("YES")||fight.equals("yes")||fight.equals("y")||fight.equals("Y")){
                Mons4 mode = new Mons4();
                mode.fight();

            }
            else{
                return;
            }

        }

        else{
            System.out.print("Please choose 1 or 2 or 3 or 4");
        }


    }

}
