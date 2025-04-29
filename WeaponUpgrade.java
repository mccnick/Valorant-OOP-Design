class WeaponUpgrade {
    public Gun upgradeGun(Gun gun) {
        Gun upgradedGun = new Gun(gun.getGunName() + " (Upgraded)", gun.getDamage() + 5);
        System.out.println("Upgrading " + gun.getGunName());
        System.out.println("New damage: " + upgradedGun.getDamage());
        return upgradedGun;
    }
}