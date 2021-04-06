package com.writemeabook.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/hierarchicalModelFallBack")
    public String hierarchicalModelFallBackMethod() {
        return "Hierarchical server is taking longer than expected." +
                " Please try again later";
    }

    @GetMapping("/textServiceFallBack")
    public String textServiceFallBackMethod() {
        return "Text Service server is taking longer than expected." +
                " Please try again later";
    }
}
