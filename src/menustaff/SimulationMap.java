package menustaff;

import simulation.objects.Entity;

import java.util.HashMap;
import java.util.Map;

public class SimulationMap {

    private Map<Integer, Entity> entitiesLocation = new HashMap<>();

    public Map<Integer, Entity> getEntitiesLocation(){
        return this.entitiesLocation;
    }

    public void setEntitiesLocation(Map<Integer, Entity> entitiesLocation){
        this.entitiesLocation = entitiesLocation;
    }

}
