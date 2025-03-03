public class Gun {
    private String gunName;
    private int damage;

    public Gun(String gunName, int damage) {
        this.gunName = gunName;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getGunName() {
        return gunName;
    }

    public void shoot() {
        System.out.println("Firing " + gunName + " dealing " + damage + " damage!");
    }
}
