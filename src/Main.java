import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //N-колтчество входных данных
        //O(1)

        TemperatureRecord[] records = new TemperatureRecord[3];
        records[0] = new TemperatureRecord("New York", LocalDateTime.now(), 5.0);
        records[1] = new TemperatureRecord("Tokyo", LocalDateTime.now(), 5.0);
        records[2] = new TemperatureRecord("London", LocalDateTime.now(), 5.0);

        for (TemperatureRecord record : records) {
            System.out.println(record);
        }
    }
}