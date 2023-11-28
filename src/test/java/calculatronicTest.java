import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatronicTest {

    @Test
    Integer sumar(Integer num1, Integer num2) {
        num1 = 3;
        num2 = 2;
        Integer esperado = 5;
        Integer r = sumar(num1,num2);
        assertEquals(esperado,r);
        return esperado;
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
    }

    @Test
    void dividir() {
    }
}