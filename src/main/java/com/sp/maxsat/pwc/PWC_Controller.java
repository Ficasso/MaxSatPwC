package com.sp.maxsat.pwc;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pwc")
public class PWC_Controller {


    @PostMapping
    public String createPwc(@RequestBody PwcModelDto model) {
        System.out.println(model);
        if(isValid(model)){
            System.out.println("VALID");
        }
        return "hello";
    }


    private boolean isValid(PwcModelDto modelDto){
        int numProperties = modelDto.getElements().size();

        if (modelDto.getValues().size() != numProperties - 1){
            System.out.println("wrong values size");
            return false;
        }

        for (int i = 0; i < modelDto.getValues().size(); i++) {
            if(modelDto.getValues().get(i).size() != numProperties - 1 - i){
                System.out.println("Wrong values size in a row");
                return false;
            }
        }

        return true;
    }


}
