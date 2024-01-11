import menustaff.SimulationMap;

import java.util.Scanner;

public class Simulation {

    private SimulationMap simulationMap = new SimulationMap();

    private final Scanner scanner = new Scanner(System.in);

    private static final String HELLO_MESSAGE = "Welcome to the simulation!!!" +
                                                '\n'+
                                                "Enter map size!!!";


    public void startSimulation(){
        System.out.println(HELLO_MESSAGE);
        System.out.println(getMapSizeFromUser());
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
        return mapSize;
    }

}
