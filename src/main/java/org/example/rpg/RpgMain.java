package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster troll=new Troll("Shrek",1000,100);
        System.out.println("Name: " + troll.getName());
        System.out.println("Hit Points: " + troll.getHitPoints());
        System.out.println("Damage: " + troll.getDamage());

        // Saldırı hasarını hesaplıyoruz
        System.out.println("Attack Damage: " + troll.attack());
    }
}
