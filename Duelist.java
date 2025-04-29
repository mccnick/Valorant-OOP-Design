public class Duelist extends Agent {
    public Duelist(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(getName() + " dashes forward using their ability!");
    }
}