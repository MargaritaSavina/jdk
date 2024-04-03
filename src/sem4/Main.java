package sem4;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory();
        dir.addEmploee(new Emploee("Vasya", 123,3));
        dir.addEmploee(new Emploee("Alex", 12225,1));
        dir.addEmploee(new Emploee("Sveta", 12644,4));
        dir.addEmploee(new Emploee("Luda", 23463,35));
        dir.addEmploee(new Emploee("Anton", 54322,14));


        System.out.println(dir.toString());

        dir.findPersonalNumber(102);
    }
}
