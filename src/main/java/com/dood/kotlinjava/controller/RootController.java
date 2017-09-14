package com.dood.kotlinjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Simple controller to redirect root url requests to the swagger API
 */
@Controller
//Note if this is @RestController redirect will not work since RestController returns a javaobject not a html template reference
@ApiIgnore //No need to have swagger document this
public class RootController {

    public static final String REDIRECT_SWAGGER_UI_HTML = "redirect:/swagger-ui.html";

    @RequestMapping("/")
    public String redirectToSwagger() {
        return REDIRECT_SWAGGER_UI_HTML;
    }
}
