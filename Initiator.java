public class Initiator extends Agent {
    public Initiator(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(getName() + " flashes to blind enemies!");
    }
}