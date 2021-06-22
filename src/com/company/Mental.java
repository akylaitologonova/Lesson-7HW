package com.company;

public class Mental extends Heroes implements Abilityable{
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
        System.out.println("Mental, урон увеличивается на 1,9 раза больше");



    }
}