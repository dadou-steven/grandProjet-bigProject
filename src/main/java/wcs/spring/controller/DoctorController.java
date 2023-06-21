package wcs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    // méthodes

    /**
     * Spécification sans paramètre de la méthode de William
     * @return le lien vers la page d'accueil
     */
    @GetMapping("/doctor/1")
    @ResponseBody
    public String william() {
        return "Docteur <a href='http://localhost:8080/'>William Hartnell</a>";
    }

    /**
     * Spécification sans paramètre de la méthode david
     * @return le lien vers la page d'accueil
     */
    @GetMapping("/doctor/10")
    @ResponseBody
    public String david() {
        return "Docteur <a href='http://localhost:8080/'>David Tennant</a>";
    }

    /**
     * Spécification sans paramètre de la méthode jodie
     * @return le lien vers la page d'accueil
     */
    @GetMapping("/doctor/13")
    @ResponseBody
    public String jodie() {
        return "Docteur <a href='http://localhost:8080/'>Jodie Whittaker</a>";
    }
}
