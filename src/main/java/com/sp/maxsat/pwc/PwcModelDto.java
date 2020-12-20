package com.sp.maxsat.pwc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PwcModelDto {

    private List<String> elements;

    private List<List<Integer>> values;

}
