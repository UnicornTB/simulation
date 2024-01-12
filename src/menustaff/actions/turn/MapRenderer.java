package menustaff.actions.turn;

import menustaff.SimulationMap;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class MapRenderer {

    private static final MapRenderer MAP_RENDERER = new MapRenderer();

    private MapRenderer(){}

    public static MapRenderer getInstance(){
        return MAP_RENDERER;
    }

    public void render(SimulationMap simulationMap, int mapSize){
        for (String string : makePartitions(simulationMap, mapSize)){
            System.out.println(string);
        }
    }

    private List<String> makePartitions(SimulationMap simulationMap, int mapSize){
        List<String> partitions = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mapSize; i++){
            int bound = mapSize * i;
            stringBuilder.setLength(0);
            for (int j = bound; j < bound + mapSize; j++){
                stringBuilder.append(simulationMap.getEntity(j).getView());
            }
            partitions.add(stringBuilder.toString());
        }
        return partitions;
    }
}
