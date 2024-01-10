package Test;

import org.example.WeatherReportController;
import org.example.WeatherReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@Service
@RunWith(SpringRunner.class)
@WebMvcTest(WeatherReportController.class)
public class WeatherReportControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WeatherReportService weatherReportService;

    @Test
    public void testGetWeatherReport() throws Exception {

        Mockito.when(weatherReportService.fetchWeatherReport()).thenReturn("Mocked weather report");


        mockMvc.perform(MockMvcRequestBuilders.get("/weather/report"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Mocked weather report"));
    }
}