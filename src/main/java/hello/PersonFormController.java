package hello;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * Created by Jenkins on 25/02/2016.
 */
@Controller
public class PersonFormController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/personformresults").setViewName("personformresults");
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String showForm(PersonForm personForm) {
        return "personform";
    }

    @RequestMapping(value="/", method= RequestMethod.POST)
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "personform";
        }

        return "redirect:/personformresults";
    }
}
