package creational.prototype.shaleep;

public class ShallowC {
    public static void main(String[] args) {
        // A shallow copy creates a new object, BUT the internal objects remain shared.
        // shallow copy → level 1 copy
        Birthday b = new Birthday();
        b.day = 9;
        b.month = 12;
        b.year = 2005;
        Person p1 = new Person();
        p1.birthday = b;
        p1.name = "Brahim Naji";


        // Shallow copy
        Person p2 = new Person();
        p2.name = p1.name; // Note: String behaves like a primitive in shallow copy because it is immutable.
        p2.birthday = p1.birthday; // share same reference of b.

        // p1 & p2 are different objects but they pointe to the same birthday object [b].
        // Changing values of birthday of p2 will affect p1, but name NO.
        p2.birthday.day = 8;
        p2.birthday.month = 11;
        p2.birthday.year = 2004;
        p2.name = "Ahmed Alaoui";
        System.out.println(p1 == p2);
        System.out.println("P1 name: "+p1.name+" vs P2 name: "+p2.name); // Shouldn't be the same.
        System.out.println("P1 birthday: "+
                p1.birthday.day+"-"
                +p1.birthday.month+"-"
                +p1.birthday.year+
                " vs P2 birthday: "+
                p2.birthday.day+ "-"+
                p2.birthday.month+ "-"+
                p2.birthday.year); // Shows same birthday, which means pointe to same reference.
    }
}
