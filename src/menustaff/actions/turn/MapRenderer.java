package menustaff.actions.turn;

import menustaff.SimulationMap;

import java.util.List;

public class MapRenderer {

    private static final MapRenderer MAP_RENDERER = new MapRenderer();

    private MapRenderer(){};

    public MapRenderer getInstance(){
        return MAP_RENDERER;
    }

    public void render(SimulationMap simulationMap, int mapSize){

    }

    private List<String> makePartitions(SimulationMap simulationMap, int mapSize){
        for (int i = 0; i < mapSize; i++){

        }
        return null;
    }
}
