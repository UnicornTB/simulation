package simulation.objects;

public abstract class Entity {

    public Entity(){
        init();
    }

    protected String view;

    public String init(){return getView();}

    public String getView(){
        return this.view;
    }

    public void setView(String view){
        this.view = view;
    }
}
