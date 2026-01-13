package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class EvenTest {

    Even even = new Even();
    //parameterized test with multiple values
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {

        //expected result based on logic
        boolean expected = (number % 2 == 0);

        //verify whether number is even
        assertEquals(expected, even.isEven(number));
    }
}
