package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportService {

    private final WeatherAPI weatherAPI;

    @Autowired
    public WeatherReportService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public String fetchWeatherReport() {
        return weatherAPI.getWeatherReport();
    }
}
