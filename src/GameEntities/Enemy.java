/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEntities;


import java.util.Random;

/**
 *
 * @author Brian
 */
public class Enemy {
    private String name;    // Name.
    private int health;         // How much health it has (hit points).
    private int damage;     // How much damage the enemy will do.
    private int hitChance;  // How much of a chance it'll cause damge.
    private int points;
    Random random = new Random();
    
    
    public Enemy(String name, int hP, int damage, int hitChance, int points){
        this.name = name;
        this.health = hP;
        this.damage = damage;
        this.hitChance = hitChance;
        this.points = points;
    }

    public String getName(){
        return name;
    }
    
    public void adjustHealth(int value){
        health += value;
    }
    
    public int getHitChance(){
        return hitChance;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getDamage(){
        int roll = random.nextInt(100);
        int modifiedDamage = damage;
        if (roll > 90) {
             modifiedDamage += 1;
        } else if (roll <= 90 && roll > 70) {
            modifiedDamage -= 1;
        } else if (roll >= 0 && roll < 5) {
            modifiedDamage += 2;
        }
        return modifiedDamage;
    }
    public boolean doesAttack(){
        int roll = random.nextInt(99)+1;
        if (roll < hitChance){
            return true;
        } else {
            return false;
        }
    }
    
    public int getPoints(){
        return points;
    }
    
}
