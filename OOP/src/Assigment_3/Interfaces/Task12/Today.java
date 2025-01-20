package Assigment_3.Interfaces.Task12;

public class Today implements WeatherType, Weather {
    private String type;

    Today(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("Today it will be %s", this.getWeatherType());
    }

    @Override
    public String getWeatherType() {
        return type;
    }
}

