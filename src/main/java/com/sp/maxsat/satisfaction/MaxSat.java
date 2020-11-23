package com.sp.maxsat.satisfaction;

import com.sp.maxsat.satisfaction.formulas.SimpleFormula;
import com.sp.maxsat.satisfaction.formulas.WeightedFormula;
import com.sp.maxsat.satisfaction.satlogic.Logical;

import java.util.List;

public class MaxSat {

    private boolean maxSat(List<SimpleFormula> formulas, Logical logicalComparator) {
        return formulas.stream()
                .allMatch(logicalComparator::compare);
    }

    private boolean filteredWeightedMaxSat(List<WeightedFormula> formulas, Logical logicalComparator, int minWeight) {
        return formulas.stream()
                .filter(formula -> formula.getWeight() > minWeight)
                .allMatch(logicalComparator::compare);
    }

    private double weightedMaxSat(List<WeightedFormula> formulas, Logical logicalComparator){
        var totalWeights = formulas.stream()
                .mapToInt(WeightedFormula::getWeight)
                .sum();
        var satValue = formulas.stream()
                .filter(logicalComparator::compare)
                .mapToInt(WeightedFormula::getWeight)
                .sum();
        return (double)satValue/totalWeights;
    }
}