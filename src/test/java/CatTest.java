import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends Feline {


    @Mock
    Cat cat;


    @Test
    public void testMockGetFoodCat() throws Exception {
        cat.getFood("Хищник");
        cat.getFood("Хищник");
        Mockito.verify(cat, Mockito.times(2)).getFood("Хищник");
    }
}