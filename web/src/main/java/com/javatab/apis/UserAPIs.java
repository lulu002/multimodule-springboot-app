package com.javatab.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nasir on 12/1/16.
 */
@RestController
public class UserAPIs {

    @RequestMapping(value = "/create-user", method = RequestMethod.GET)
    protected String createUsers() {
        return "Success";
    }
}
