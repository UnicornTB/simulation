package menustaff.actions.init;

import menustaff.SimulationMap;
import simulation.objects.landscape.things.WhiteSpace;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WhiteSpaceGenerator {

    private static final WhiteSpaceGenerator WHITE_SPACE_GENERATOR = new WhiteSpaceGenerator();

    private WhiteSpaceGenerator(){};

    public static WhiteSpaceGenerator getInstance(){
        return WHITE_SPACE_GENERATOR;
    }

    public void generate(SimulationMap simulationMap, int mapSize){
       for (Integer integer : findWhiteSpacePositions(simulationMap.getPositions(), mapSize)){
           simulationMap.addEntity(integer, new WhiteSpace());
       }
    }

    private List<Integer> findWhiteSpacePositions(Set<Integer> occupiedKeys, int mapSize){
        int bound = mapSize * mapSize;
        return IntStream.range(0, bound).filter(number -> !occupiedKeys.contains(number)).boxed().collect(Collectors.toList());
    }
}
