import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatronicTest {

    @Test
    void sumar() {
        Integer num1 = 3;
        Integer num2 = 2;
        Integer esperado = 5;
        Integer r = sumar(num1,num2);
        assertEquals(esperado,r);
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