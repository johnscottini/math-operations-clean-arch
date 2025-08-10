package com.math.operations.demo.lib.operations.usecase;

import com.math.operations.demo.lib.facade.UseCase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UcObterExponenciacao extends UseCase<Double> {

    private Double a;
    private Double b;

    @Override
    protected Double execute()  {
        return Math.pow(a, b);
    }
}
