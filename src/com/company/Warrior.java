package com.company;

public class Warrior extends Heroes implements Abilityable{
    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void Ability() {
        System.out.println("Warrior, урон увеличивается на 2 раза больше");

    }
}