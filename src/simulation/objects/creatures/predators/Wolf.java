package simulation.objects.creatures.predators;

public class Wolf extends Predator{
    @Override
    public String init() {
        this.view = "Wo";
        this.damage = 1;
        this.hp = 3;
        this.attackRange = 2;
        this.speed = 1;
        this.eatRange = 1;
        return super.init();
    }

    @Override
    public void makeMove() {

    }

    @Override
    public void findPath() {

    }

    @Override
    public void eat() {

    }

    @Override
    public boolean checkFood() {
        return false;
    }

    @Override
    public void dealDamage() {

    }
}
