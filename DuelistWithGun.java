class DuelistWithGun extends Duelist {
    private Gun gun;

    public DuelistWithGun(String name, Gun gun) {
        super(name);
        this.gun = gun;
    }

    public void attack(Agent target) {
        gun.shoot();
        target.takeDamage(gun.getDamage());
    }
}
