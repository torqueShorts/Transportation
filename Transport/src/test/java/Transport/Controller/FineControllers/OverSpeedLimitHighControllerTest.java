package Transport.Controller.FineControllers;

import Transport.Domain.Fines.Fine;
import Transport.Domain.Fines.MajorOffenses.OverSpeedLimitHigh;
import Transport.Factory.FineFactories.FineFactory;
import Transport.Factory.FineFactories.MajorOffenses.OverSpeedLimitHighFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class OverSpeedLimitHighControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/overSpeedLimitHigh";

    @Test
    public void create()
    {
        Fine fin = FineFactory.getFine("AR34895", "BC37584", "0817586", "MinorOffence", false);

        OverSpeedLimitHigh overSpeedLimitHigh = OverSpeedLimitHighFactory.getOverSpeedLimit(60,100,"07/03/1990",fin);

        ResponseEntity<OverSpeedLimitHigh> postResponse = restTemplate.postForEntity(baseURL + "/create", overSpeedLimitHigh, OverSpeedLimitHigh.class);
        Assert.assertNotNull(postResponse);
        Assert.assertNotNull(postResponse.getBody());
    }

    @Test
    public void update()
    {
        String id = "AD5467";

        OverSpeedLimitHigh overSpeedLimitHigh = restTemplate.getForObject(baseURL + "/overSpeedLimitHigh/" + id, OverSpeedLimitHigh.class);

        restTemplate.put(baseURL + "/overSpeedLimitHigh/" + id, overSpeedLimitHigh);
        OverSpeedLimitHigh updatedOverSpeedLimitHigh = restTemplate.getForObject(baseURL + "/OverSpeedLimitHigh/" + id, OverSpeedLimitHigh.class);
        Assert.assertNotNull(updatedOverSpeedLimitHigh);
    }

    @Test
    public void delete()
    {
        String id = "AC3456";

        OverSpeedLimitHigh overSpeedLimitHigh = restTemplate.getForObject(baseURL + "/overSpeedLimitHigh/" + id, OverSpeedLimitHigh.class);
        Assert.assertNotNull(overSpeedLimitHigh);
        restTemplate.delete(baseURL + "/overSpeedLimitHigh/" + id);

        try
        {
            overSpeedLimitHigh = restTemplate.getForObject(baseURL + "/overSpeedLimitHigh/" + id, OverSpeedLimitHigh.class);
        }

        catch(final HttpClientErrorException e)
        {
            Assert.assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void read()
    {
        OverSpeedLimitHigh overSpeedLimitHigh = restTemplate.getForObject(baseURL + "/overSpeedLimitHigh/1", OverSpeedLimitHigh.class);
        System.out.println(overSpeedLimitHigh.getFine().getFineNum());
        Assert.assertNotNull(overSpeedLimitHigh);
    }

    @Test
    public void getAll()
    {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);

        Assert.assertNotNull(response.getBody());
    }
}