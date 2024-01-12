import menustaff.SimulationMap;
import menustaff.actions.Actions;
import simulation.objects.Entity;

import java.util.Map;
import java.util.Scanner;

public class Simulation {

    private SimulationMap simulationMap = new SimulationMap();

    private final Scanner scanner = new Scanner(System.in);

    private Actions actions = Actions.getInstance();

    private static final String HELLO_MESSAGE = "Welcome to the simulation!!!" +
                                                '\n'+
                                                "Enter map size!!!(Min size 16)";
    private int mapSize;

    public void startSimulation(){
        System.out.println(HELLO_MESSAGE);
        mapSize = getMapSizeFromUser();
        actions.entitiesGenerator.generate(simulationMap, mapSize);
        actions.whiteSpaceGenerator.generate(simulationMap, mapSize);
        actions.mapRenderer.render(simulationMap, mapSize);

    }

    public void nextTurn(){

    }

    public void pauseSimulation(){

    }

    private int getMapSizeFromUser(){
        int mapSize;
        try{
            mapSize = Integer.parseInt(scanner.nextLine());
        } catch (Exception ex){
            System.out.println("Enter a number!");
            mapSize = getMapSizeFromUser();
        }
        if (mapSize < 16){
            System.out.println("Min map size 16!");
            mapSize = getMapSizeFromUser();
        }
        return mapSize;
    }

    private void testView(){
        for (Map.Entry<Integer, Entity> entry: simulationMap.getPairs()){
            System.out.println(entry.getKey() + " " + entry.getValue().getView());
        }
    }

}
