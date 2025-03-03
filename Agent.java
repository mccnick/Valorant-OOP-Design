public abstract class Agent {
    protected String name;
    protected int health;

    public Agent(String name) {
        this.name = name;
        this.health = 100;
    }

    abstract void useAbility();

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
        System.out.println(name + " takes " + damage + " damage. Health left: " + health);
    }
}
