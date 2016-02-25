package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jenkins on 25/02/2016.
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/customerresult", method = RequestMethod.GET)
    public String showAllPosts(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customerresult";
    }
}
