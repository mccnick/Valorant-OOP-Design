public class WeaponUpgrade {
    public void upgradeGun(Gun gun) {
        System.out.println("Upgrading " + gun.getGunName()); 
        gun = new Gun(gun.getGunName() + " (Upgraded)", gun.getDamage() + 5);

        System.out.println("New damage: " + gun.getDamage());
    }
}
