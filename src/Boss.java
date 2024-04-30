public class Boss extends GameEntity {
   Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "\u001B[36m"+"Boss healht:" + getHealht() + " Boss damage:" + getDamage()
                + "\u001B[32m"+" Type of weapon:" + weapon.getType()+
                " Boss weapon:" + weapon.getName()+"\u001B[0m";
    }
}
