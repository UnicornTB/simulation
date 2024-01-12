package menustaff.actions.turn;

import menustaff.SimulationMap;
import menustaff.actions.init.EntitiesGenerator;
import simulation.objects.Entity;
import simulation.objects.creatures.herbivores.Herbivore;
import simulation.objects.creatures.predators.Predator;
import simulation.objects.landscape.resources.Grass;

import java.util.HashMap;
import java.util.Map;


//TODO:Протестировать класс!!!!
public class ResourcesCreator {

    private static final EntitiesGenerator ENTITIES_GENERATOR = EntitiesGenerator.getInstance();

    private static final ResourcesCreator RESOURCES_CREATOR = new ResourcesCreator();

    private ResourcesCreator(){}

    public static ResourcesCreator getInstance(){return RESOURCES_CREATOR;}

    public void create(SimulationMap simulationMap, int mapSize){
        ENTITIES_GENERATOR.generate(simulationMap, mapSize, newElements(simulationMap));
    }

    private Map<String, Integer> newElements(SimulationMap simulationMap){
        Map<String, Integer> newElements = new HashMap<>(){{
            put("Herbivore", 0);
            put("Resource", 0);
        }};
        int differenceBetweenPredatorsAndHerbivores = getCountOfCertainEntities(Predator.class, simulationMap) - getCountOfCertainEntities(Herbivore.class,simulationMap);
        int differenceBetweenHerbivoresAndResources = getCountOfCertainEntities(Herbivore.class,simulationMap) -  getCountOfCertainEntities(Grass.class, simulationMap);
        if(differenceBetweenPredatorsAndHerbivores > -1){
            newElements.replace("Herbivore", differenceBetweenPredatorsAndHerbivores + 1);
        }
        if (differenceBetweenHerbivoresAndResources > -1){
            newElements.replace("Resource", differenceBetweenHerbivoresAndResources + 1);
        }
        return newElements;
    }

    private <T extends Entity> int getCountOfCertainEntities(Class<T> clazz, SimulationMap simulationMap){
        return simulationMap.getEntities().stream().filter(clazz::isInstance).toList().size();
    }


}
