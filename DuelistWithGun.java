class DuelistWithGun extends Duelist {
    private Shootable gun;

    public DuelistWithGun(String name, Shootable gun) {
        super(name);
        this.gun = gun;
    }

    public void attack(Agent target) {
        gun.shoot();
        target.takeDamage(gun.getDamage());
    }
}