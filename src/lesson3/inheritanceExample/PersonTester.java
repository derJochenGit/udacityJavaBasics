package lesson3.inheritanceExample;

public class PersonTester {
    public static void main(String[] args) {
        Person sally = new Person("Sally", "Philipps");
        System.out.println(sally);
        Student mike = new Student("Mike", "Thompson", "12345");
        System.out.println(mike);
        StudentEmployee jeff = new StudentEmployee("Jeff", "Sam", "4567", 20.5, "'12345");
        System.out.println(jeff);
    }
}
