package cjly.questionnaire.controller;

import cjly.questionnaire.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    @Autowired
    HttpServletRequest req;

    @Autowired
    QuestionnaireService questionnaireService;

    @Autowired
    OptionService optionService;

    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerService answerService;

    @Autowired
    UserService userService;
}
