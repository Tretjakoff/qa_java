import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalTest {
    Animal animal = new Animal();
    @Test
    public void testGetFamilyAnimal(){
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
