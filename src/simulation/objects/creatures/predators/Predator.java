package simulation.objects.creatures.predators;

import simulation.objects.creatures.Creature;

public abstract class Predator extends Creature {

    protected int damage;

    protected int attackRange;

    public abstract void dealDamage();

    public int getDamage(){
        return this.damage;
    }

    public int getDamageRange(){
        return this.attackRange;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setDamageRange(int damageRange){
        this.attackRange = damageRange;
    }

}
