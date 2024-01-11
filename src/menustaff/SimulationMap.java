package menustaff;

import simulation.objects.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimulationMap {

    private Map<Integer, Entity> entitiesLocation = new HashMap<>();

    public void addEntity(Integer key, Entity entity){
        this.entitiesLocation.put(key, entity);
    }

    public void replaceEntity(Integer key, Entity entity){
        this.entitiesLocation.replace(key, entity);
    }

    public void removeEntity(Integer key, Entity entity){
        this.entitiesLocation.remove(key, entity);
    }

    public Set<Map.Entry<Integer, Entity>> getPairs(){
        return this.entitiesLocation.entrySet();
    }

    public Map<Integer, Entity> getEntitiesLocation(){
        return this.entitiesLocation;
    }

    public void setEntitiesLocation(Map<Integer, Entity> entitiesLocation){
        this.entitiesLocation = entitiesLocation;
    }

    public Entity getEntity(int key){
        return this.entitiesLocation.get(key);
    }

    public int getKey(Entity entity){
        Set<Map.Entry<Integer, Entity>> entries = this.entitiesLocation.entrySet();
        return entries.stream().filter(entry -> entry.getValue() == entity).findFirst().get().getKey();
    }

    public Set<Integer> getPositions(){
        return this.entitiesLocation.keySet();
    }
}
