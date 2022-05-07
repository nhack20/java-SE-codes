import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    public void testBox() {
        Box<String, Integer, Integer> box1 = new Box<>("Str", 4, 2);
        Box<String, Integer, Integer> box2 = new Box<>("Str", 5, 6);
        int result = box1.getValue() + box1.getValue2() + box2.getValue() + box2.getValue2();
        assertEquals(17, result, 0.001);
    }
}