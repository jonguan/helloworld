package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
@RequestMapping(Array("/"))
class HelloWorldController{

 @RequestMapping(method = Array(RequestMethod.GET))
 @ResponseBody
 def hello () = {
 	"Get Hello World"
 }
 
  @RequestMapping(method = Array(RequestMethod.POST))
  @ResponseBody
 def post_hello () = {
   "POST Hello World"
 }
}

