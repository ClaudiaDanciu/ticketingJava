import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SeatTest.
 *
 * @Claudia Danciu
 * @version 1.0
 */


public class SeatTest
{
    /** This test checks the basic functionality of the 
     * isAvailable(),
     * reserveSeat(), 
     * and releaseSeat() 
     * methods of the Seat class.
     */
    @Test
    public void testSeatAvailability() {
        Seat seat = new Seat(1, true, null, null);
        assertTrue(seat.isAvailable());
        seat.reserveSeat();
        assertFalse(seat.isAvailable());
        seat.releaseSeat();
        assertTrue(seat.isAvailable());
    }
}
