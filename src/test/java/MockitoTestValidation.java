import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple test to validate Mockito 5.7.0 works with Java 21
 * and can handle abstract interfaces properly.
 */
public class MockitoTestValidation {

    interface TestInterface {
        String abstractMethod();
        default String defaultMethod() {
            return "default";
        }
    }

    @Test
    public void testMockitoWorksWithJava21() {
        // This should work with Mockito 5.7.0 and Java 21
        TestInterface mock = Mockito.mock(TestInterface.class);
        
        // Configure mock behavior 
        Mockito.when(mock.abstractMethod()).thenReturn("mocked");
        
        // Test mock works
        assertEquals("mocked", mock.abstractMethod());
        assertEquals(null, mock.defaultMethod()); // default behavior for mocked interface
        
        // Verify interaction
        Mockito.verify(mock).abstractMethod();
    }
}