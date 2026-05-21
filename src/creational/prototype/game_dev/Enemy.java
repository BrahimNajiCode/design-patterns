package creational.prototype.game_dev;

public class Enemy implements Cloneable{
    private Weapon weapon;
    private int HP; // Hit Points
    private String type;
    private Position position;

    public Enemy(Weapon weapon, int HP, String type, Position position) {
        this.weapon = weapon;
        this.HP = HP;
        this.type = type;
        this.position = position;
    }
    @Override
    public Enemy clone(){
        try{
            Enemy cloned = (Enemy) super.clone();

            // DEEP COPY of mutable objects
            cloned.position = new Position(this.position.getX(), this.position.getY());
            System.out.println("Cloned: "+this.type);
            return cloned;
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
