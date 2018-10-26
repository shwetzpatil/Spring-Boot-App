package pac.package_with_my_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    @RequestMapping("/")
    @ResponseBody
    String hello(){return "Hello, I'm Spring Boot and I'm running now :D ";}

}
 //To run `mvn spring-boot:run`