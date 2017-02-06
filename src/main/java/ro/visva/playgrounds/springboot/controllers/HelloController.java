package ro.visva.playgrounds.springboot.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello Controller.
 */
@RestController
public class HelloController {

   @RequestMapping(value = "/hello/{name}")
   String hello(@PathVariable String name) {

      return String.format("Hello %s", name);

   }

}
