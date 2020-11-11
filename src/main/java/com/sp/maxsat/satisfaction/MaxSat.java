package com.sp.maxsat.satisfaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MaxSat {

    private boolean maxSat(Map<Integer, Formula> clauses, List<Integer> clausesToCheck, LogicalEnum logicalEnum) {
        var checked = new ArrayList<Boolean>();
        for (int i = 0; i < clausesToCheck.size(); i++) {
            var clause = clauses.get(i);
            if (logicalEnum == LogicalEnum.LESS) {
                checked.add(clause.getFirst() < clause.getSecond() && clause.getSecond() < clause.getThird());
            } else if (logicalEnum == LogicalEnum.EQUAL) {
                checked.add(clause.getFirst() == clause.getSecond() && clause.getSecond() == clause.getThird());
            } else if(logicalEnum == LogicalEnum.GREATER) {
                checked.add(clause.getFirst() > clause.getSecond() && clause.getSecond() > clause.getThird());
            }
        }
        return checked.stream().allMatch(bool -> bool);
    }
}
