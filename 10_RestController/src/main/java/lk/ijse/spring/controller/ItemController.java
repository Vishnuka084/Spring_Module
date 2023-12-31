package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    // Exact Mapping = ...item/it/test1
    // Exact Mapping = ...item/it/test1

    @GetMapping("it/test1")
    public String test(){
        return "Get Mapping Invoked (test)";
    }

    @GetMapping("test2/I0/tt1")
    public String test2(){
        return "Get Mapping Invoked (test2)";
    }
}
