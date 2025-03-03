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

        // Create Agents
        DuelistWithGun jett = new DuelistWithGun("Jett", new Gun("Vandal", 40));
        Sentinel killjoy = new Sentinel("Killjoy");
        Initiator breach = new Initiator("Breach");
        Controller brimstone = new Controller("Brimstone");

        System.out.println("Test 1: Initial Health Check (Inheritance)");
        System.out.println(jett.name + " starts with " + jett.health + " HP");
        System.out.println(killjoy.name + " starts with " + killjoy.health + " HP");
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 2: Agents Using Abilities (Polymorphism - Method Overriding)");
        jett.useAbility();
        killjoy.useAbility();
        breach.useAbility();
        brimstone.useAbility();
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 3: Shooting Mechanics (Interface Implementation)");
        jett.attack(killjoy);
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 4: Damage Calculation & Health Update (Encapsulation)");
        System.out.println(killjoy.name + " new HP: " + killjoy.health);
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 5: Healing an Agent (Data Coupling)");
        HealthBoost healthBoost = new HealthBoost();
        healthBoost.heal(killjoy, 30);
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 6: Upgrading a Gun (Stamp Coupling)");
        WeaponUpgrade weaponUpgrade = new WeaponUpgrade();
        Gun operator = new Gun("Operator", 50);
        weaponUpgrade.upgradeGun(operator);
        System.out.println();

        System.out.println("------------------------------------------\n");

        System.out.println("Test 7: Shooting with Upgraded Gun");
        operator.shoot();
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
