import menustaff.SimulationMap;
import menustaff.actions.init.EntitiesGenerator;
import menustaff.actions.init.WhiteSpaceGenerator;
import simulation.objects.Entity;

import java.util.Map;
import java.util.Scanner;

public class Simulation {

    private SimulationMap simulationMap = new SimulationMap();

    private final Scanner scanner = new Scanner(System.in);

    private static final String HELLO_MESSAGE = "Welcome to the simulation!!!" +
                                                '\n'+
                                                "Enter map size!!!(Min size 8)";
    private int mapSize;

    public void startSimulation(){
        System.out.println(HELLO_MESSAGE);
        mapSize = getMapSizeFromUser();
        EntitiesGenerator entitiesGenerator = EntitiesGenerator.getInstance();
        entitiesGenerator.generate(simulationMap, mapSize);
        WhiteSpaceGenerator whiteSpaceGenerator = WhiteSpaceGenerator.getInstance();
        whiteSpaceGenerator.generate(simulationMap, mapSize);
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
        if (mapSize < 8){
            System.out.println("Min map size 8!");
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
