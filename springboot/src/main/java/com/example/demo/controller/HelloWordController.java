
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//再次修改

//后台控制

@Controller
public class HelloWordController {
    @RequestMapping("/hello")
	public String hello() {
	return "hw111";
	//我又提交了修改
	

}
}