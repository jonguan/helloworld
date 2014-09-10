package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam, RestController}

@RestController
@RequestMapping(Array("/"))
class HelloWorldController{

@RequestMapping
 def hello () = {
 	"Get Hello World"
 }
 
}

