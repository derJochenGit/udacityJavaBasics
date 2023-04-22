package lesson2;

public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName,
               String dogColor, int dogAge)
    {
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "test";
    }

    public static void main(String[] args) {
        Dog moki = new Dog("Pudel", "Moki", "braun", 1);
        System.out.println(moki.getDogName());
        System.out.println(moki);
    }

}
