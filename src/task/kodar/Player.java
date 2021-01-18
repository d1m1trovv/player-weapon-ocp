package task.kodar;

public class Player {
    private Weapon weapon;
    private String name;

    public Player(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public Weapon getWeapon(){return this.weapon;}

    public void action(){
        getWeapon().perform();
    }
}
