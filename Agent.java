public abstract class Agent {
    private String name;
    private int health;

    public Agent(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100)
            health = 100;
    }

    abstract void useAbility();

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0)
            health = 0;
        System.out.println(name + " takes " + damage + " damage. Health left: " + health);
    }
}