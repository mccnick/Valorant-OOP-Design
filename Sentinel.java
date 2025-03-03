// Sentinel class inherits from Agent
class Sentinel extends Agent {
    public Sentinel(String name) {
        super(name);
    }

    @Override
    void useAbility() {
        System.out.println(name + " deploys a turret for defense!");
    }
}