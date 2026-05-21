package creational.prototype.shaleep;

public class DeepC {
    public static void main(String[] args) {
        // A deep copy also copies internal objects.
        Birthday b1 = new Birthday();
        b1.day = 9;
        b1.month = 12;
        b1.year = 2005;
        Person p1 = new Person();
        p1.birthday = b1;
        p1.name = "Brahim Naji";


        // Deep copy
        Person p2 = new Person();
        Birthday b2 = new Birthday();
        b2.day = p1.birthday.day;
        b2.month = p1.birthday.month;
        b2.year = p1.birthday.year;
        p2.birthday = b2;
        b2.year = 1999;
        System.out.println("P1 birthday: "+
                p1.birthday.day+"-"
                +p1.birthday.month+"-"
                +p1.birthday.year+
                " vs P2 birthday: "+
                p2.birthday.day+ "-"+
                p2.birthday.month+ "-"+
                p2.birthday.year); // Shows different birthday, which means pointe to different reference.
    }
}
