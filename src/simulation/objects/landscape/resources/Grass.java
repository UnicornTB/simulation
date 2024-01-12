package simulation.objects.landscape.resources;

import simulation.objects.Entity;

public class Grass extends Entity {
    @Override
    public String init() {
        this.view = "Gr";
        return super.init();
    }
}
