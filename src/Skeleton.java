public class Skeleton  extends Boss{
  private int numberOfArrows;

    public Skeleton(String NAME,int healht,int damage,Weapon weapon,int numberOfArrows) {
        super();
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public String printInfo(){
        return "Skeleton:"+"\u001B[36m"+getNAME()+"\u001B[0m" +" Healht:" + getHealht() + " Damage:" + getDamage()+"\u001B[32m"+
                " Type of weapon:" + weapon.getType()+"\u001B[34m"+" Weapon:" + weapon.getName()+"\u001B[0m"+
                " Number of arrows" + getNumberOfArrows() ;
    }
}
