// Controller class inherits from Agent
class Controller extends Agent {
    public Controller(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(name + " dashes forward using their ability!");
    }
}
