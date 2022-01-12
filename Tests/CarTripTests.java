import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CarTripTests {
    @Test
    @Order(1)
    public void carTripConstructor() {
        CarTrip trip = new CarTrip(345, 987, 3.45, 22.5);
        assertEquals(345, trip.getMyStartOdometer());
        assertEquals(987, trip.getMyEndOdometer());
        assertEquals(3.45, trip.getMyTime());
        assertEquals(22.5, trip.getMyGallonsUsed());
    }

    @Test
    @Order(2)
    public void carTripDefaultConstructor() {
        CarTrip trip = new CarTrip();
        assertEquals(0, trip.getMyStartOdometer());
        assertEquals(0, trip.getMyEndOdometer());
        assertEquals(0.0, trip.getMyTime());
        assertEquals(0.0, trip.getMyGallonsUsed());
    }

    @Test
    @Order(3)
    public void carTripMutators() {
        CarTrip trip = new CarTrip();
        trip.setMyStartOdometer(300);
        trip.setMyEndOdometer(900);
        trip.setMyTime(12.98);
        trip.setMyGallonsUsed(43.5);
        assertEquals(300, trip.getMyStartOdometer());
        assertEquals(900, trip.getMyEndOdometer());
        assertEquals(12.98, trip.getMyTime());
        assertEquals(43.5, trip.getMyGallonsUsed());
    }

    @Test
    @Order(4)
    public void carTripDistance() {
        CarTrip trip = new CarTrip(865, 8965, 3.45, 22.5);
        assertEquals(8100, trip.getTripDistance());
    }

    @Test
    @Order(5)
    public void carTripAverageSpeed() {
        CarTrip trip = new CarTrip(425, 749, 5.45, 22.5);
        assertEquals(59.449541284403665, trip.getAverageSpeed());
    }

    @Test
    @Order(6)
    public void carTripGasMilage() {
        CarTrip trip = new CarTrip(425, 612, 5.45, 4.25);
        assertEquals(44.0, trip.getGasMileage());
    }

    @Test
    @Order(7)
    public void carTripTotalGasPrice() {
        CarTrip trip = new CarTrip(425, 612, 5.45, 4.25);
        assertEquals(12.71, trip.getTotalGasPrice(2.99));
    }

    @Test
    @Order(8)
    public void carTripToString() {
        CarTrip trip = new CarTrip(425, 612, 5.45, 4.25);
        String expected = "Distance traveled: 187 miles";
        assertEquals(expected, trip.toString());
    }
}
