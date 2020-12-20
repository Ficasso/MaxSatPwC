package com.sp.maxsat.pwc;


import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("pwc")
public class PWC_Controller {

    private List<PwcModelDto> examples;

    @PostMapping
    public String createPwc(@RequestBody PwcModelDto model) {
        System.out.println(model);
        if(isValid(model)){
            System.out.println("VALID");
        }
        return "hello";
    }

    @GetMapping
    public void insertExamples(){
        var pwcModel = new PwcModelDto();
        pwcModel.setElements(Arrays.asList("transport", "sklepy", "parki"));
        pwcModel.setValues(Collections.singletonList(Arrays.asList(23,10,4)));
        examples.add(pwcModel);
        pwcModel.setValues(Collections.singletonList(Arrays.asList(3,2,1)));
        examples.add(pwcModel);
        pwcModel.setValues(Collections.singletonList(Arrays.asList(10,3,1)));
        examples.add(pwcModel);
        var random = new Random();
        for(int i = 0; i < 100; i++){
            pwcModel.setValues(Collections.singletonList(Arrays.asList(random.nextInt(100), random.nextInt(100), random.nextInt(100))));
            examples.add(pwcModel);
        }
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
