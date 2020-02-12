package com.company;

public class Item1 extends Item{
    Item1(){
        this.name = "Berry";
        this.HP = 50;
    }
    void print(){
        System.out.println("     __");
        System.out.println(" __ {_/");
        System.out.println(" '\'_}\\_");
        System.out.println("     _'\'(_)_ \t\t\tName of Item :"+name);
        System.out.println("   (_)_)(_)_\t\t\tHp :"+HP);
        System.out.println("  (_)(_)_)(_)\t\t\tDescribes : This item can be healing HP");
        System.out.println("   (_)(_))_)");
        System.out.println("    (_(_(_)");
        System.out.println("     (_)_) ");
        System.out.println("      (_)  ");
        System.out.println("===============================================");
    }

}
