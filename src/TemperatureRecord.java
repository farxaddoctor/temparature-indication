import java.time.LocalDateTime;

public class TemperatureRecord {
    public String city;
    public LocalDateTime time;
    public double temperature;

    public TemperatureRecord(String city, LocalDateTime time, double temperature) {
        this.city = city;
        this.time = time;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "TemperatureRecord{" +
                "city='" + city + '\'' +
                ", time=" + time +
                ", temperature=" + temperature +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
