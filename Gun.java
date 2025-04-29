public class Gun implements Shootable {
    private String gunName;
    private int damage;

    public Gun(String gunName, int damage) {
        this.gunName = gunName;
        this.damage = damage;
    }

    public String getGunName() {
        return gunName;
    }

    @Override
    public void shoot() {
        System.out.println("Firing " + gunName + " dealing " + damage + " damage!");
    }

    @Override
    public int getDamage() {
        return damage;
    }
}