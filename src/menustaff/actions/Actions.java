package menustaff.actions;

import menustaff.actions.init.EntitiesGenerator;
import menustaff.actions.init.WhiteSpaceGenerator;
import menustaff.actions.turn.MapRenderer;
import menustaff.actions.turn.ResourcesCreator;

public class Actions {

    private static final Actions ACTIONS = new Actions();

    private Actions(){}

    public static Actions getInstance(){return ACTIONS;}

    public EntitiesGenerator entitiesGenerator = EntitiesGenerator.getInstance();

    public WhiteSpaceGenerator whiteSpaceGenerator = WhiteSpaceGenerator.getInstance();

    public MapRenderer mapRenderer = MapRenderer.getInstance();

    public ResourcesCreator resourcesCreator = ResourcesCreator.getInstance();
}
