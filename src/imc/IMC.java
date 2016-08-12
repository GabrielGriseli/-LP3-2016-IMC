package imc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IMC {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String sexo;
        double altura, peso;
        
        System.out.println("Digite o sexo da pessoa: ");
        sexo = in.readLine();
        System.out.println("Digite a altura da pessoa (use vírgula para números fracionados): ");
        altura = Double.parseDouble(in.readLine());
        System.out.println("Digite a idade da pessoa (use vírgula para números fracionados): ");
        peso = Double.parseDouble(in.readLine());
        
        //CalculaIMC(sexo, altura, peso);
        
    }
    
}
