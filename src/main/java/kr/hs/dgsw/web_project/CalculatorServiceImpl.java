package kr.hs.dgsw.web_project;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String cal(String value1, String value2, String operator) {
        int par1 = Integer.parseInt(value1);
        int par2 = Integer.parseInt(value2);

        switch(operator){
            case "+" :
                return Integer.toString(par1+par2);
            case "-" :
                return Integer.toString(par1-par2);
            case "*" :
                return Integer.toString(par1*par2);
            case "div" :
                return Integer.toString(par1/par2);
            default:
                return "Error";
        }
    }
}
