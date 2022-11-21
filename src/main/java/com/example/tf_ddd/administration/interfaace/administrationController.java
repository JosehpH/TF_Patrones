package com.example.tf_ddd.administration.interfaace;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administracion")
public class administrationController {
    @GetMapping(path = { "products" })
    String getAllProducts() {
        return "Products";
    }
}
