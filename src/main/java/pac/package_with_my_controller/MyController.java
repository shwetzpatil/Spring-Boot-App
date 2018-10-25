package pac.package_with_my_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(){
        return "Hello, I'm SPRING BOOT and I am running";
    }
}
