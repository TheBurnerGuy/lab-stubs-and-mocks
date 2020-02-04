import org.junit.Test;
import util.StringProcessor;

import static junit.framework.TestCase.assertEquals;

public class TestCapitalizeName {

    @Test
    public void testCapitalizeName() {
        // Setup
        StringProcessor processor = new StringProcessor();

        // Run
        String name1 = "john doe";
        String name2 = "JANE DoE";

        String name1Result = processor.capitalizeName(name1);
        String name2Result = processor.capitalizeName(name2);

        // Verify
        assertEquals(name1Result, "John Doe");
        assertEquals(name2Result, "Jane Doe");
    }
}