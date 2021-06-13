package cjly.questionnaire.controller;

import cjly.questionnaire.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    @Autowired
    HttpServletRequest req;

    @Autowired
    QuestionnaireService questionnaireService;
}
