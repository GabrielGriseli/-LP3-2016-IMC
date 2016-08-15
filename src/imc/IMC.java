package imc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IMC {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        char sexo;
        double altura, peso;
        calculadoraIMC calculadoraimc = new calculadoraIMC();
        
        while (true){
            
            System.out.println("Caso queira calcular o IMC de uma pessoa digite <Y>, caso contrário digite <N>:");
            if (in.read() == 'N')
                break;
            in.readLine();
            
            System.out.println("Digite o sexo da pessoa <M>(Masculino) ou <F>(Feminino):");
            sexo = (char) in.read();
            in.readLine();
            System.out.println("Digite a altura da pessoa (use ponto para números fracionados):");
            altura = Double.parseDouble(in.readLine());
            System.out.println("Digite o peso da pessoa (use ponto para números fracionados):");
            peso = Double.parseDouble(in.readLine());

            System.out.println(calculadoraimc.calcula(sexo, altura, peso));
        }
    } 
}
