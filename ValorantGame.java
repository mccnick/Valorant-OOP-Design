public class ValorantGame {
    public static void main(String[] args) {
        System.out.println("------------------------------------------\n");
        System.out.println("Course: SE416, Spring 2025\n");
        System.out.println("Professor: Ahmed Tamrawi \n");
        System.out.println("Assignment: 1, Problem 4\n");
        System.out.println("------------------------------------------\n");
        System.out.println("Starting Valorant Test Simulation in...\n");
        System.out.println("3\n");
        System.out.println("2\n");
        System.out.println("1\n");
        System.out.println("Prepare to kill or be killed !!!! \n");
        System.out.println("------------------------------------------\n");

        // Create Agents (uses interface for gun)
        DuelistWithGun jett = new DuelistWithGun("Jett", new Gun("Vandal", 40));
        Sentinel killjoy = new Sentinel("Killjoy");
        Initiator breach = new Initiator("Breach");
        Controller brimstone = new Controller("Brimstone"); // update: fixed AgentType class name

        System.out.println("Test 1: Initial Health Check (Inheritance)");
        System.out.println(jett.getName() + " starts with " + jett.getHealth() + " HP");
        System.out.println(killjoy.getName() + " starts with " + killjoy.getHealth() + " HP");
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 2: Agents Using Abilities (Polymorphism)");
        jett.useAbility();
        killjoy.useAbility();
        breach.useAbility();
        brimstone.useAbility();
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 3: Shooting Mechanics (Interface Implementation)");
        jett.attack(killjoy); // Uses Shootable interface
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 4: Damage Calculation (Encapsulation)");
        System.out.println(killjoy.getName() + " new HP: " + killjoy.getHealth());
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 5: Healing an Agent (Data Coupling)");
        HealthBoost healthBoost = new HealthBoost();
        healthBoost.heal(killjoy, 30); // update: now uses Agent's heal() method
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 6: Upgrading a Gun (Stamp Coupling Fix)");
        WeaponUpgrade weaponUpgrade = new WeaponUpgrade();
        Gun operator = new Gun("Operator", 50);
        operator = weaponUpgrade.upgradeGun(operator); // update: assign upgraded gun
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 7: Shooting with Upgraded Gun");
        operator.shoot(); // Update: now uses upgraded damage (55)
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("All Tests Completed Successfully! Thank you for playing Valorant.");
        System.out.println("Thank you for playing... \n");
        System.out.println("\n" +
                "██      ██  █████  ██     ███████ ██████   █████  ███    ██ ████████ \n" +
                " ██    ██  ██   ██ ██     ██   ██ ██   ██ ██   ██ ████   ██    ██    \n" +
                "  ██  ██   ███████ ██     ██   ██ ██████  ███████ ██ ██  ██    ██    \n" +
                "   ████    ██   ██ ██     ██   ██ ██   ██ ██   ██ ██  ██ ██    ██    \n" +
                "    ██     ██   ██ ██████ ███████ ██   ██ ██   ██ ██   ████    ██    \n" +
                "  ");

        System.out.println("------------------------------------------\n");
    }
}
