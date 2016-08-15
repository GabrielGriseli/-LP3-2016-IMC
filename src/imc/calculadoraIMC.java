package imc;

public class calculadoraIMC {
    
    public String calcula(char sexo, double altura, double peso){
        double imc = peso / Math.pow(altura, 2);
        
        if (sexo == 'M'){
            if (imc < 20.7)
                return "Abaixo do peso";
            else if (imc <= 26.4)
                return "Peso ideal";
            else
                return "Acima do peso";
        }
        else if (sexo == 'F'){
            if (imc < 19.1)
                return "Abaixo do peso";
            else if (imc <= 25.8)
                return "Peso ideal";
            else
                return "Acima do peso";
        }
        else
            return "Um ou mais dados estão incorretos!";
    }
}
