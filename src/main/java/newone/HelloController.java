package newone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aleksei on 03.08.17.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/test.form",method = RequestMethod.GET)
    public String test(@RequestParam("name") String param, Model model){
        model.addAttribute("name",param);
        return "hello";
    }
}

