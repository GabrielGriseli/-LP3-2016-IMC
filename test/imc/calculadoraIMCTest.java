package imc;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class calculadoraIMCTest {
    
    calculadoraIMC calculadoraimc;
    
    @Before
    public void inicializaMetodoDeTestes(){
        calculadoraimc = new calculadoraIMC();
    }
    
    ///Quando o homem esta acima do peso ideal;
    @Test
    public void homemAcimaDoPeso(){
        String retorno = calculadoraimc.calcula('M', 1.50, 80);
        assertEquals("Acima do peso", retorno);
    }
   
    ///Quando o homem esta no peso ideal;
    @Test
    public void homemPesoIdeal(){
        String retorno = calculadoraimc.calcula('M', 1.70, 75);
        assertEquals("Peso ideal", retorno);
    }
    
    ///Quando o homem esta abaixo do peso ideal;
    @Test
    public void homemAbaixoDoPeso(){
        String retorno = calculadoraimc.calcula('M', 1.80, 50);
        assertEquals("Abaixo do peso", retorno);
    }
    
    ///Quando a mulher esta acima do peso ideal;
    @Test
    public void mulherAcimaDoPeso(){
        String retorno = calculadoraimc.calcula('F', 1.65, 85);
        assertEquals("Acima do peso", retorno);
    }
   
    ///Quando a mulher esta no peso ideal;
    @Test
    public void mulherPesoIdeal(){
        String retorno = calculadoraimc.calcula('F', 1.70, 70);
        assertEquals("Peso ideal", retorno);
    }
    
    ///Quando a mulher esta abaixo do peso ideal;
    @Test
    public void mulherAbaixoDoPeso(){
        String retorno = calculadoraimc.calcula('F', 1.80, 55);
        assertEquals("Abaixo do peso", retorno);
    }
}
