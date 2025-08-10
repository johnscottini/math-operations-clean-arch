package com.math.operations.demo.api;

import com.math.operations.demo.lib.facade.UseCaseFacade;
import com.math.operations.demo.lib.operations.usecase.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/operacoes")
public class MathOperationController {
    private final UseCaseFacade facade;

    @GetMapping("/obter-soma")
    public Double obterSoma(@RequestParam Double a, @RequestParam Double b) {
        var uc = new UcObterSoma();
        uc.setA(a);
        uc.setB(b);
        return facade.execute(uc);
    }

    @PostMapping("/calcular-soma")
    public Double calcularSoma(@RequestBody UcObterSoma uc) {
        return facade.execute(uc);
    }

    @GetMapping("/obter-subtracao")
    public Double obterSubtracao(@RequestParam Double a, @RequestParam Double b) {
        var uc = new UcObterSubtracao();
        uc.setA(a);
        uc.setB(b);
        return facade.execute(uc);
    }

    @PostMapping("/calcular-subtracao")
    public Double calcularSubtracao(@RequestBody UcObterSubtracao uc) {
        return facade.execute(uc);
    }

    @GetMapping("/obter-divisao")
    public Double obterDivisao(@RequestParam Double a, @RequestParam Double b) {
        var uc = new UcObterDivisao();
        uc.setA(a);
        uc.setB(b);
        return facade.execute(uc);
    }

    @PostMapping("/calcular-divisao")
    public Double calcularDivisao(@RequestBody UcObterDivisao uc) {
        return facade.execute(uc);
    }

    @GetMapping("/obter-multiplicacao")
    public Double obterMultiplicacao(@RequestParam Double a, @RequestParam Double b) {
        var uc = new UcObterMultiplicacao();
        uc.setA(a);
        uc.setB(b);
        return facade.execute(uc);
    }

    @PostMapping("/calcular-multiplicacao")
    public Double calcularMultiplicacao(@RequestBody UcObterMultiplicacao uc) {
        return facade.execute(uc);
    }

    @GetMapping("/obter-exponenciacao")
    public Double obterExponenciacao(@RequestParam Double a, @RequestParam Double b) {
        var uc = new UcObterExponenciacao();
        uc.setA(a);
        uc.setB(b);
        return facade.execute(uc);
    }

    @PostMapping("/calcular-exponenciacao")
    public Double calcularExponenciacao(@RequestBody UcObterExponenciacao uc) {
        return facade.execute(uc);
    }

}
