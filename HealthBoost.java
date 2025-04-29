class HealthBoost {
    public void heal(Agent agent, int amount) {
        agent.heal(amount);
        System.out.println(agent.getName() + " healed by " + amount + " points. Current health: " + agent.getHealth());
    }
}