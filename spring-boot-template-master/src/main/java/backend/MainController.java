package backend;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRegionForNumber(@RequestParam String name) {
        return "Hello, " + name;
    }*/

    @RestController
    public class MainController extends HttpServlet {
        @RequestMapping("/great")
        public Person index(HttpServletRequest request, HttpServletResponse
                response) {
           /* if (request.getParameter("lastname") != null ||
                    request.getParameter("firstname") != null) {
                if (!request.getParameter("lastname").equals("")
                        && !request.getParameter("firstname").equals("")) {
                    String lastname = request.getParameter("lastname");
                    String firstname = request.getParameter("firstname");
                    firstname = firstname.substring(0, 1);//Первая буква
                    return lastname + " " + firstname + ".";
                } else
                    return "No POST data lastname or firstname";
            }
            return "Not POST data ";}*/
            int id = ((int)(Math.random()*100+1));
            String name = request.getParameter("firstname");
            String password = request.getParameter("password");
            Person person = new Person(id, name, password );
            //Gson gson = new GsonBuilderUtils()
           return person;
        }
}
