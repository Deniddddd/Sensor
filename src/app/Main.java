package app;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        SensorDisplay display = new SensorDisplay();
        sensor.addObserver(display);

        // Симулюємо зміни стану сенсора
        sensor.setState(0); // Початковий стан

        // Підвищуємо температуру
        for (int i = 1; i <= 5; i++) {
            int temperature = i;
            sensor.setState(temperature);
        }
    }
}
