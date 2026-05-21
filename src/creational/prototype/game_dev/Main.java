package creational.prototype.game_dev;

public class Main {
    public static void main(String[] args) {
        // Idea is to create multiple enemies (ORC, ZOMBIE, DRAGON) with diffrent positions.
        // which means type and position should be deep copie (to not affect the prototype).
        // String behaves like a primitive in shallow copy because it is immutable -> NO PROBLEM.
        Enemy MainEnemy = new Enemy(Weapon.FIRE,100,"DRAGON", new Position(0,0));
        // Clone 1 - Enemy 1
        Enemy e1 = MainEnemy.clone();
        e1.setPosition(new Position(100,100));
        e1.setType("ZOMBIE");

        // Clone 2 - Enemy 2
        Enemy e2 = MainEnemy.clone();
        e2.setPosition(new Position(200,200));
        e2.setType("ORC");

        System.out.println(MainEnemy.getPosition().toString());
        System.out.println(e1.getPosition().toString());
        System.out.println(e2.getPosition().toString());
    }
}
