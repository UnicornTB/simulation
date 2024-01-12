package simulation.objects.landscape.things;

import simulation.objects.Entity;

public class Rock extends Entity {

    @Override
    public String init() {
        this.view = "Ro";
        return super.init();
    }
}
