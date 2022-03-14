package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss();
        boss.setHealth(25);
        boss.setDamage(200);
        boss.setType("kinetic");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getType());
        for (int i = 0; i < greatyHeroes().length; i++) {
            System.out.println(greatyHeroes()[i].getHealth() + " " + greatyHeroes()[i].getDamage() + " " + greatyHeroes()[i].getSuperpower());

        }
    }

    public static Hero[] greatyHeroes() {
        Hero hero = new Hero(30, 150, "magic");
        Hero hero1 = new Hero(27, 180, "kinetic");
        Hero hero2 = new Hero(23, 210, "physical");


        Hero heroes[] = {hero, hero1, hero2};
        return heroes;
    }


}
