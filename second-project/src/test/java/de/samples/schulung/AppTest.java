package de.samples.schulung;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    @Tag("gelbe-katze")
    public void shouldAnswerWithTrueGelbeKatze() {
        assertTrue(true);
    }

    @Test
    @Tag("gruener-fuchs")
    public void shouldAnswerWithTrueGruenerFuchs() {
        assertTrue(true);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }



}
