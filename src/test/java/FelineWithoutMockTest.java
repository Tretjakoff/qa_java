import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineWithoutMockTest {
    Feline feline = new Feline();
    @Test
    public void testGetFamilyFeline(){
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensFeline(){
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testEatMeatFeline() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
