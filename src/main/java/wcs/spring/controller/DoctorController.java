package wcs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    // méthodes

    /**
     * Spécification sans paramètre de la méthode de William
     * Parameter-free specification of William's method
     * Parameterlose Angabe von Williams Methode
     * 威廉方法的无参数说明
     * ウィリアム法のパラメーターフリー仕様
     * @return le lien vers la page d'accueil, link to home page, den Link zur Startseite, 通往主页的链接, ホームページへのリンク
     */
    @GetMapping("/doctor/1")
    @ResponseBody
    public String william() {
        return "Docteur <a href='http://localhost:8080/'>William Hartnell</a>";
    }

    /**
     * Spécification sans paramètre de la méthode david
     * Parameter-free specification of the david method
     * Parameterlose Angabe der Methode david
     * 大卫方法的无参数规范
     * ダビッド法のパラメーターフリー仕様
     * @return le lien vers la page d'accueil, link to home page, den Link zur Startseite, 通往主页的链接, ホームページへのリンク
     */
    @GetMapping("/doctor/10")
    @ResponseBody
    public String david() {
        return "Docteur <a href='http://localhost:8080/'>David Tennant</a>";
    }

    /**
     * Spécification sans paramètre de la méthode jodie
     * Parameter-free specification of the jodie method
     * Parameterlose Spezifikation der jodie-Methode
     * 乔迪方法的无参数说明
     * ジョディ法のパラメーターフリー仕様
     * @return le lien vers la page d'accueil, link to home page, den Link zur Startseite, 通往主页的链接, ホームページへのリンク
     */
    @GetMapping("/doctor/13")
    @ResponseBody
    public String jodie() {
        return "Docteur <a href='http://localhost:8080/'>Jodie Whittaker</a>";
    }
}
