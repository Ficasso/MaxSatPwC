package com.sp.maxsat.satisfaction.satlogic;

import com.sp.maxsat.satisfaction.formulas.Formula;

public class LogicalGreater implements Logical {
    @Override
    public boolean compare(Formula formula) {
        return formula.getFirst() > formula.getSecond() && formula.getSecond() > formula.getThird();
    }
}
