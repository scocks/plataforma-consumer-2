package org.king.plataformaConsumer2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testGreetPlataforma() {
        Library library = new Library();
        String result = library.greetPlataforma("plataforma-consumer-2");
        assertEquals("greet from plataforma-consumer-2 via plataforma greet greet from plataforma, plataforma-consumer-2", result);
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("plataforma-consumer-2");
        assertEquals("greet from plataforma-consumer-2 plataforma-consumer-2", result);
    }
    @Test
    void testGreet1() {
        Library library = new Library();        
        String result = library.greet1("plataforma-consumer-2");
        assertEquals("greet1 from plataforma-consumer-2 via plataforma greet1 greet1 from plataforma greet from libdep1, plataforma-consumer-2", result);
    }
    @Test
    void testGreet2() {
        Library library = new Library();
        String result = library.greet2("plataforma-consumer-2");
        assertEquals("greet2 from plataforma-consumer-2 via plataforma greet2 greet2 from plataforma greet from libdep2, plataforma-consumer-2", result);    }
    @Test
    void testGreet3() {
        Library library = new Library();
        String result = library.greet3("plataforma-consumer-2");
        assertEquals("greet3 from plataforma-consumer-2 via plataforma greet3 greet3 from plataforma greet from libdep3, plataforma-consumer-2", result);    }
    @Test
    void testGreet4() {
        Library library = new Library();
        String result = library.greet4("plataforma-consumer-2");
        assertEquals("greet4 from plataforma-consumer-2 via plataforma greet4 greet4 from plataforma greet from libdep4, plataforma-consumer-2", result);    }
    @Test
    void testGreet5() {
        Library library = new Library();
        String result = library.greet5("plataforma-consumer-2");
        assertEquals("greet5 from plataforma-consumer-2 via plataforma greet5 greet5 from plataforma greet from libdep5, plataforma-consumer-2", result);
    }
    @Test
    void testGreet6() {
        Library library = new Library();
        String result = library.greet6("plataforma-consumer-2");
        assertEquals("greet6 from plataforma-consumer-2 greet1 from libdep5, plataforma-consumer-2", result);
    }
}
