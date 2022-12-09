import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("111", "7374");
        CarInfo carInfo = new CarInfo("2022","Toyota", "50 000 $","grey");
        Car car1 = new Car("222", "2211");
        CarInfo carInfo1 = new CarInfo("2021","Bentli", "60 000 $","red");
        Car car2 = new Car("333", "2829");
        CarInfo carInfo2 = new CarInfo("2023","BMW", "70 000 $","black");

        HashMap<Car, CarInfo> map = new HashMap<>();
        map.put(car, carInfo);
        map.put(car1, carInfo1);
        map.put(car2,carInfo2);
        System.out.println(map.entrySet());

    }
}