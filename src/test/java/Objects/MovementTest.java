package Objects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovementTest {

    @BeforeEach
    void setUp() {
        System.out.println("Testing");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Success!");
    }
    @Test
    void moveCharacter() {
        String move = "a";
        assertEquals("a", "a");
    }
}