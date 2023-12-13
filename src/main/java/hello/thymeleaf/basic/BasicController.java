package hello.thymeleaf.basic;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {


  @GetMapping("text-basic")
  public String baisc(Model model) {

    model.addAttribute("data", "hello <b>Spring</b>");

    return "basic/text-basic";
  }

  @GetMapping("text-unescaped")
  public String textUnescaped(Model model) {

    model.addAttribute("data", "hello <b>Spring</b>");

    return "basic/text-unescaped";
  }



}
