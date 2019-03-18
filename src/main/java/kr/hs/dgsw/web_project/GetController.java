package kr.hs.dgsw.web_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class GetController {

    @Autowired
    private CalculatorService cs;

    @GetMapping(value = {"/math/{value1}/{value2}/{operator}"})
    public String Cal(@PathVariable Optional<String> value1, @PathVariable Optional<String> value2, @PathVariable Optional<String> operator){
        return cs.cal(value1.get(),value2.get(),operator.get());
    }
}
