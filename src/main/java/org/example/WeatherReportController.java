package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherReportController {

    private final WeatherReportService weatherReportService;

    @Autowired
    public WeatherReportController(WeatherReportService weatherReportService) {
        this.weatherReportService = weatherReportService;
    }

    @GetMapping("/report")
    public ResponseEntity<String> getWeatherReport() {
        String report = weatherReportService.fetchWeatherReport();
        return ResponseEntity.ok(report);
    }
}