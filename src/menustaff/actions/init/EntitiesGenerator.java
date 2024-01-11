package menustaff.actions.init;

import menustaff.SimulationMap;
import simulation.objects.Entity;
import simulation.objects.creatures.herbivores.Rabbit;
import simulation.objects.creatures.predators.Wolf;
import simulation.objects.landscape.resources.Grass;
import simulation.objects.landscape.things.Rock;
import simulation.objects.landscape.things.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class EntitiesGenerator {

    private static final EntitiesGenerator GENERATE_ENTITIES = new EntitiesGenerator();

    private static final Random RANDOM = new Random();

    public static EntitiesGenerator getInstance(){
        return GENERATE_ENTITIES;
    }

    private EntitiesGenerator(){};

    public void generate(SimulationMap simulationMap, int mapSize){
        for (Map.Entry<String, Integer> entry : getEntitiesCounts(mapSize).entrySet()){
            putEntityToMap(simulationMap, mapSize, entry);
        }
    }

    private Map<String, Integer> getEntitiesCounts(int mapSize){
        if (mapSize >= 8 && mapSize < 16){
            return new HashMap<>(Map.of("Herbivore", 2, "Predator", 1, "Thing", 2, "Resources", 3));
        }

        if(mapSize >= 16 && mapSize < 32){
            return new HashMap<>(Map.of("Herbivore", 4, "Predator", 2, "Thing", 4, "Resources", 6));
        }

        return new HashMap<>(Map.of("Herbivore", 8, "Predator", 3, "Thing", 8, "Resources", 12));

    }

    private int generatePosition(SimulationMap simulationMap, int mapSize){
        Set<Integer> occupiedPositions = simulationMap.getPositions();
        int possiblePosition = RANDOM.nextInt(mapSize * mapSize);

        if (occupiedPositions.contains(possiblePosition)){
            generatePosition(simulationMap, mapSize);
        }

        int step = mapSize - 1;
        boolean condition = occupiedPositions.contains(possiblePosition - 1) ||
                            occupiedPositions.contains(possiblePosition + 1) ||
                            occupiedPositions.contains(possiblePosition + step) ||
                            occupiedPositions.contains(possiblePosition - step) ||
                            occupiedPositions.contains(possiblePosition + step + 1) ||
                            occupiedPositions.contains(possiblePosition + step - 1) ||
                            occupiedPositions.contains(possiblePosition - step + 1) ||
                            occupiedPositions.contains(possiblePosition - step - 1);
        if(condition){
            generatePosition(simulationMap, mapSize);
        }

        return possiblePosition;
    }

    private Entity createEntity(String entity){
        switch (entity) {
            case "Herbivore" -> {
                return new Rabbit();
            }
            case "Predator" -> {
                return new Wolf();
            }
            case "Thing" -> {
                if (RANDOM.nextInt(2) == 0) {
                    return new Rock();
                }
                return new Tree();
            }
            default -> {
                return new Grass();
            }
        }
    }

    private void putEntityToMap(SimulationMap simulationMap, int mapSize, Map.Entry<String, Integer> entry){
        for (int i = 0; i < entry.getValue(); i++){
            simulationMap.addEntity(generatePosition(simulationMap, mapSize), createEntity(entry.getKey()));
        }
    }

}
