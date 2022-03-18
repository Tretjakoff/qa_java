import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedAnimalTest {

    public final String testAnimalKind;
    public final String testGetFood;

    public ParameterizedAnimalTest(String testAnimalKind, String testGetFood) {
        this.testAnimalKind = testAnimalKind;
        this.testGetFood = testGetFood;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {"Травоядное", "[Трава, Различные растения]"},
                {"Хищник", "[Животные, Птицы, Рыба]"},
                {"hjk", "Неизвестный вид животного, используйте значение Травоядное или Хищник"},
        };
    }

    @Test
    public void shouldBeEquals() {
        Animal animal = new Animal();
        try {
            String actual = String.valueOf(animal.getFood(testAnimalKind));
            assertEquals(testGetFood, actual);
        } catch (Exception exception) {
            assertEquals(testGetFood, exception.getMessage());
        }
    }

}