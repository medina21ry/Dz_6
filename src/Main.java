public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealht(500);
        boss.setDamage(260);
        boss.setWeapon(new Weapon(WeaponType.INCENDIARY,"Grenade"));
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton("Austen",300,140,new Weapon(WeaponType.COLD,"Kastet"),0);
        skeleton1.setNAME("Austen");
        skeleton1.setHealht(300);
        skeleton1.setDamage(140);
        skeleton1.setWeapon(new Weapon(WeaponType.COLD,"Kastet"));
        skeleton1.setNumberOfArrows(0);

        Skeleton skeleton2 = new Skeleton("Hugh",600,310,new Weapon(WeaponType.FIREARMS,"GUN"),15);
        skeleton2.setNAME("Hugh");
        skeleton2.setHealht(600);
        skeleton2.setDamage(310);
        skeleton2.setWeapon(new Weapon(WeaponType.FIREARMS,"GUN"));
        skeleton2.setNumberOfArrows(15);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}