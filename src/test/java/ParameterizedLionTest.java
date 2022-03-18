import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {
    public final String sexLion;
    public final String comparisonResult;


    public ParameterizedLionTest(String sexLion, String comparisonResult) {
        this.sexLion = sexLion;
        this.comparisonResult = comparisonResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTextDat() {
        return new Object[][]{
                {"Самец", "true"},
                {"Самка", "false"},
                {"123", "Используйте допустимые значения пола животного - самей или самка"},
        };
    }

    @Test
    public void shouldBeEquals() throws Exception {
        if (sexLion == "Самец" || sexLion == "Самка") {
            Lion lion = new Lion(new Feline(), sexLion);
            String actual = String.valueOf(lion.doesHaveMane());
            assertEquals(comparisonResult, actual);
        } else {
            try {
                Lion lion = new Lion(new Feline(), sexLion);
                lion.doesHaveMane();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                assertEquals(comparisonResult, ex.getMessage());
            }
        }
    }
}
