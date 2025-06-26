
import org.example.Counter;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;


public class CounterTest {

    private Counter counter;

    @Before
    public void setUp() {
        // Arrange: create a new Counter before each test
        counter = new Counter();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // Cleanup/reset if necessary
        counter = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testIncrement() {
        // Arrange
        // (counter initialized in setUp)

        // Act
        counter.increment();

        // Assert
        assertEquals(1, counter.getCount());
    }

    @Test
    public void testDecrement() {
        // Arrange
        counter.increment();  // count = 1

        // Act
        counter.decrement();

        // Assert
        assertEquals(0, counter.getCount());
    }

    @Test
    public void testReset() {
        // Arrange
        counter.increment();
        counter.increment();

        // Act
        counter.reset();

        // Assert
        assertEquals(0, counter.getCount());
    }
}
