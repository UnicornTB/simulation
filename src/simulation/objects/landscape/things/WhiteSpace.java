package simulation.objects.landscape.things;

import simulation.objects.Entity;

public class WhiteSpace extends Entity {

    @Override
    public String init(){
        this.view = "  ";
        return super.init();
    }
}
