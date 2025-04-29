// Controller class inherits from Agent
public class Controller extends Agent {
    public Controller(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(getName() + " smokes the area!");
    }
}