package pl.com.bohdziewicz.trainingWebServices;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

        viewControllerRegistry.addViewController("/resultsForm").setViewName("results");
    }

    @GetMapping("/formOne")
    public String showForm(PersonForm personForm) {

        return "formOne";
    }

    @PostMapping("/formOne")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "formOne";
        }
        return "resultForm";
    }
}
