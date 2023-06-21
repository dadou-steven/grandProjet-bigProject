package wcs.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;
import wcs.spring.model.Doctor;

public class DoctorControllerRoute {

    // méthodes

    /**
     * Spécification de la méthode doctor avec un paramètre
     * Specifying the doctor method with a parameter
     * Angabe der Methode doctor mit einem Parameter
     * 用一个参数指定医生方法
     * ドクター・メソッドをパラメータで指定する
     * @param number numéro d'identification de la page, page identification number, Identifikationsnummer der Seite, 页面标识号, ページ識別番号
     */
    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Doctor doctor(@PathVariable int number) {

        if (number == 13) {
            return new Doctor(13, "Jodie Whittaker");
        } else if (number >= 1 && number <= 12) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See other");
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de retrouver l'incarnation {number}");
        }
    }
}
