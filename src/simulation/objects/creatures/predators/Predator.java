package simulation.objects.creatures.predators;

import simulation.objects.creatures.Creature;

public abstract class Predator extends Creature {

    protected int damage;

    protected int damageRange;

    public abstract void dealDamage();

    public int getDamage(){
        return this.damage;
    }

    public int getDamageRange(){
        return this.damageRange;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setDamageRange(int damageRange){
        this.damageRange = damageRange;
    }

}
