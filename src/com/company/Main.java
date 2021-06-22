package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magical magical = new Magical();
        Mental mental = new Mental();


        warrior.setHealth(380);
        magical.setHealth(270);
        mental.setHealth(150);


        magical.setDamage(65);
        warrior.setDamage(70);
        mental.setDamage(55);


        System.out.println("Warrior: " + warrior.getHealth() + " " + warrior.getDamage());
        System.out.println("Magical: " + magical.getHealth() + " " + mental.getDamage());
        System.out.println("Mental: " + mental.getHealth() + " " + mental.getDamage());


        magical.Ability();
        warrior.Ability();
        mental.Ability();
    }
}

