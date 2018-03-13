 import javax.swing.JFrame;

public class StartWeather extends JFrame {

    public StartWeather()
    {
        add(new WeatherBoard());
        setTitle("Board");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new StartWeather();
    }
}