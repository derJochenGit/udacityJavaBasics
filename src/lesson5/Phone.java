package lesson5;

public class Phone {
    private final String phoneType;
    private final String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {
        super();

        if (phoneType == null || phoneNumber == null) {
            throw new IllegalArgumentException("The type or number cannot be null. Eigenes Argument");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return phoneType + " " + phoneNumber;
    }

}
