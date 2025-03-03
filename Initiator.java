// Initiator class inherits from Agent
class Initiator extends Agent {
    public Initiator(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(name + " flashes to blind enemies!");
    }
}