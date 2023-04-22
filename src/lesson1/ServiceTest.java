package lesson1;

public class ServiceTest {
    private String serviceId;

    // in diesem Fall würde auch private gehen
    public String getServiceId() {
        return generateServiceId();
    }
    private String generateServiceId() {
        if (serviceId == null) {
            serviceId = "1111";
        }
        return serviceId;
    }

    public static void main(String[] args) {
        ServiceTest serviceTest = new ServiceTest();
        System.out.println(serviceTest.getServiceId());
        int[] numbers = {1,2,3};
        int[] numbers2 = new int[]{1,2,3};
    }
}
