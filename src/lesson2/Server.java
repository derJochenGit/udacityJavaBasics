package lesson2;

import java.util.ArrayList;

public class Server {

    private final static Server reference = new Server();
    private ArrayList hotelRooms;

    private Server(){
        this.hotelRooms = new ArrayList();
    }

    public static Server getInstance(){
        return reference;
    }
}
