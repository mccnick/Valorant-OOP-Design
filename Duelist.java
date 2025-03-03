// Duelist class inherits from Agent
class Duelist extends Agent {
    public Duelist(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(name + " dashes forward using their ability!");
    }
}
