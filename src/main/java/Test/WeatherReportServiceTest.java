package Test;

import org.example.WeatherAPI;
import org.example.WeatherReportService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WeatherReportServiceTest {

    @Mock
    private WeatherAPI weatherAPI;

    @InjectMocks
    public WeatherReportService weatherReportService;

    @Test
    public void testFetchWeatherReport() {

        Mockito.when(weatherAPI.getWeatherReport()).thenReturn("Mocked weather report");


        String report = weatherReportService.fetchWeatherReport();


        Assert.assertEquals("Mocked weather report", report);
    }
}
