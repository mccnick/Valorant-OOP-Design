public class Sentinel extends Agent {
    public Sentinel(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(getName() + " deploys a turret for defense!");
    }
}