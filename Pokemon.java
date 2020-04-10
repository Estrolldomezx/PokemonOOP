package main;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Pokemon {

    Double myCP;
    Double myHP;
    Double firstHP;
    Double eneCP;
    Double eneHP;
    public static String fight;
    public static String health;
    public static String berry;
    public void pokemonList(int kb) {
        switch (kb) {
            case 1:
                System.out.println("I choose you, Charmander !!!");
                myCP = 140.00;
                myHP = firstHP = 700.00; 
                break;
            case 2:
                System.out.println("I choose you, Squirtle !!!");
                myCP = 120.00;
                myHP = firstHP = 800.00;
                break;
            case 3:
                System.out.println("I choose you, Bulbasaur !!!");
                myCP = 130.00;
                myHP = firstHP = 750.00;
                break;
            case 4:
                System.out.println("I choose you, Pikatchu !!!");
                System.out.println("Pika Pika");
                myCP = 100.00;
                myHP = firstHP = 900.00;
                break;
            default:
                System.out.println("Please selected another choices");
                break;
        }
        choice();
    }
    public void choice(){
        Double rand = Math.random();
        rand = rand*100;
        Scanner choice = new Scanner(System.in);
        System.out.println("What do you want to do ?");
        System.out.println("1. Battle");
        System.out.println("2. Sleep and relax");
        System.out.println("3. Feed berries");
        System.out.println("4. Catch another Pokemon");
        System.out.println("Select activity >> ");
        int ch = choice.nextInt();
         
        
        switch(ch){
            case 1 :
                randomEne(rand);
                break;
            case 2 :
                health();
                break;
            case 3 :
                feed();
                break;
            case 4 : 
                System.out.println("What pokemon do you want to catch ?");
                int catchP = choice.nextInt();
                pokemonList(catchP);
                break;
            default :
                System.out.println("Please selected another choices");
                break;    
        }
        
    }
    public void randomEne(Double pokeCh){
        if(pokeCh >= 90 && pokeCh <= 100) {
            eneCP = 125.00;
            eneHP = 600.00;
            System.out.println(" Oh ! Entei cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 80 && pokeCh < 90) {
            eneCP= 110.00;
            eneHP = 580.00;
            System.out.println(" Oh ! Suicune cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 70 && pokeCh < 80) {
            eneCP = 135.00;
            eneHP = 650.00;
            System.out.println(" Oh ! Raikou cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 60 && pokeCh < 70) {
            eneCP = 90.00;
            eneHP = 400.00;
            System.out.println(" Oh ! Regice cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 50 && pokeCh < 60) {
            eneCP = 105.00;
            eneHP = 520.00;
            System.out.println(" Oh ! Registeel cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 40 && pokeCh < 50) {
            eneCP = 80.00;
            eneHP = 450.00;
            System.out.println(" Oh ! Regirock cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 30 && pokeCh < 40) {
            eneCP = 180.00;
            eneHP = 330.00;
            System.out.println(" Oh ! Kyogre cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 20 && pokeCh < 30) {
            eneCP = 160.00;
            eneHP = 400.00;
            System.out.println(" Oh ! Groudon cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        else if(pokeCh >= 10 && pokeCh < 20) {
            eneCP = 150.00;
            eneHP = 610.00;
            System.out.println(" Oh ! Rayquaza cp : " + eneCP + "hp : " + eneHP);
            fight();
        }
        
    }
    public void fight() {
        while(myHP != 0 && eneHP != 0){
            if(myHP == 0 || myHP < 0){
                System.out.println("You lose !");
                break;
            }
            System.out.println("My Pokemon attack !");
            eneHP = eneHP - myCP;
            System.out.println("Arghh enemy HP is " + eneHP);
            if(eneHP == 0 || eneHP < 0){
                System.out.println("You win !");
                break;
            }
            System.out.println("Enemy Attack !");
            myHP = myHP - eneCP;
            System.out.println("Arghh my pokemon HP is " + myHP);

        }
        choice();
    }

    public void health() {
        System.out.print("Okay now your Pokemon is sleep ");
        System.out.println("Zzz  Zzz  ZZz  Zz");
        if(myHP < firstHP){
            myHP += 50;
        }
        else if(firstHP < myHP + 50){
            myHP = firstHP;
        }
       choice();
    }

    public void feed() {
        System.out.println("Give a berry to my Pokemon");
        System.out.println("  (^w^)   )//  ");
        myCP += 5; 
        choice();
    }
}
