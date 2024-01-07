package uk.co.danielbryant.djshopping.stockmanager;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class healthcheck {
    @GetMapping("/healthcheckSM")
    public String healthcheck() {
        return "Hello User this response is from ShopFront!! " + new Date();
    }
}