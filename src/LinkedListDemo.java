import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<TemperatureRecord> temperatureRecords = new LinkedList<>();

        TemperatureRecord t1 = new TemperatureRecord("New York", LocalDateTime.now(), 5.0);
        TemperatureRecord t2 = new TemperatureRecord("Tokyo", LocalDateTime.now(), 5.0);
        TemperatureRecord t3 = new TemperatureRecord("London", LocalDateTime.now(), 5.0);

        temperatureRecords.add(t1);
        temperatureRecords.add(t2);
        temperatureRecords.add(t3);

        System.out.println(temperatureRecords);
        temperatureRecords.remove(0);
        temperatureRecords.remove(t2);
        System.out.println(temperatureRecords);

    }
}
