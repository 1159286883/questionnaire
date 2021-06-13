package cjly.questionnaire.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import cjly.questionnaire.controller.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cjly
 * @since 2021-06-11
 */
@Controller
public class QuestionnaireController{

    @GetMapping("/questionnaire/{id:\\d*}")
    public String detail(@PathVariable(name = "id") Long id) {
        return "questionnaire/detail";
    }
}