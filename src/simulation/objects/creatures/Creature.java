package simulation.objects.creatures;

import simulation.objects.Entity;

public abstract class Creature extends Entity {

    protected int speed;

    protected int hp;

    protected int eatRange;

    public void makeMove(){};

    public abstract void findPath();

    public abstract void eat();

    public abstract boolean checkFood();

    public int getSpeed(){
        return this.speed;
    }

    public int getHp(){
        return this.hp;
    }

    public int getEatRange(){
        return this.eatRange;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setEatRange(int eatRange){
        this.eatRange = eatRange;
    }
}
