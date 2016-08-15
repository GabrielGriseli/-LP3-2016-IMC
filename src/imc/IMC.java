package imc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IMC {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        char sexo;
        double altura, peso;
        
        while (true){
            System.out.println("Digite o sexo da pessoa: ");
            sexo = (char) in.read();
            in.readLine();
            System.out.println("Digite a altura da(); pessoa (use ponto para números fracionados): ");
            altura = Double.parseDouble(in.readLine());
            System.out.println("Digite o peso da pessoa (use ponto para números fracionados): ");
            peso = Double.parseDouble(in.readLine());

            calculadoraIMC calculadoraimc = new calculadoraIMC();
            System.out.println(calculadoraimc.calcula(sexo, altura, peso));
        }
    }
    
}
