package simulation.objects.landscape.things;

import simulation.objects.Entity;

public class Tree extends Entity {
    @Override
    public String init() {
        this.view = "Tr";
        return super.init();
    }
}
