package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by uncle on 2019/10/9.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){ return "index"; }
}
