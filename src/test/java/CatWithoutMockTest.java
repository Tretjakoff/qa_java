import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatWithoutMockTest {
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void testGetSoundCat() {
        System.out.println(cat.getSound());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFoodCat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood("Хищник"));
    }
}
