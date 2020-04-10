/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class PokemonGame {
    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        //Scanner select = new Scanner(System.in);
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
        System.out.print("What do you choose ? :");
        Pokemon obj = new Pokemon();
        //Scanner select = new Scanner(System.in);
        int kb = select.nextInt();
        obj.pokemonList(kb);
        //obj.choice(kb);
        //kb.close();
    }
}
