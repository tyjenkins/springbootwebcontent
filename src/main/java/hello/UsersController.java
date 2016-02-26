package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jenkins on 26/02/2016.
 */
@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(value = "/users-result", method = RequestMethod.GET)
    public String showAllUsers(Model model) {
        //model.addAttribute("users", usersRepository.findAll());
        //model.addAttribute("users", usersRepository.findByUsername("Pamda"));
        model.addAttribute("users", usersRepository.findByUsernameAndPassword("Pamda", "Warrior"));
        return "users-result";
    }
}
