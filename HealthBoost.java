public class HealthBoost {
    public void heal(Agent agent, int amount) {
        agent.health += amount;
        if (agent.health > 100) agent.health = 100; // Ensuring max health is 100
        System.out.println(agent.name + " healed by " + amount + " points. Current health: " + agent.health);
    }
}
