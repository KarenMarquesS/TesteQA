import org.example.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

//    @Test
//    void somarDoisNumeros(){
//        Calculadora calc = new Calculadora();
//        assertEquals(10, calc.soma(5,5));
//    }
//
//    @Test
//    void subtrairDoisNumeros(){
//        Calculadora calc = new Calculadora();
//        assertEquals(20, calc.subtrair(30,10));
//    }
//
//    @Test
//    void multiplicacaoDoisNumeros(){
//        Calculadora calc = new Calculadora();
//        assertEquals(300, calc.multiplicacao(30,10));
//    }
//
//    @Test
//    void divisaoDoisNumeros(){
//        Calculadora calc = new Calculadora();
//        assertEquals(3, calc.divisao(30,10));
//    }

private Calculadora calc;

    @BeforeEach
    void calculadora() {
        calc = new Calculadora();
    }

    @Test
    void soma(){
        assertEquals(10, calc.soma(5,5));

    }

    @Test
    void subtrairDoisNumeros(){
        assertEquals(20, calc.subtrair(30,10));
    }

    @Test
    void multiplicacaoDoisNumeros(){
        assertEquals(300, calc.multiplicacao(30,10));
    }

    @Test
    void divisaoDoisNumeros(){
        assertEquals(3, calc.divisao(30,10));
    }

}
