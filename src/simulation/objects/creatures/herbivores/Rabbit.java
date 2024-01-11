package simulation.objects.creatures.herbivores;

public class Rabbit extends Herbivore{

    @Override
    public String init() {
        this.view = "Ra";
        this.hp = 1;
        this.speed = 2;
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
}
