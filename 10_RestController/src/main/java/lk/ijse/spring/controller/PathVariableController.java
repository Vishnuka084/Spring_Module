package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {

    //http://localhost:8000/restcontroller/variable/I001
    //(variable) path segment
    //(I001) path segment

    //in spring, we can retrieve value of path segment
    // to do that we have to creat path variables -> {I001}


    @GetMapping(path = "{id}")
    public String test(@PathVariable String  id){
        return id;
    }

    @GetMapping(path = "{customerID}/{name}")
    public String test2(@PathVariable String  id,@PathVariable String  name){
        return id +" "+name;
    }
}
