package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FortuneTellerTest {
    @Test
    public void testQuoteNotNull() {
        assertNotNull(FortuneTeller.getRandomQuote());
    }
}
