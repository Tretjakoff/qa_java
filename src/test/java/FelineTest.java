import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void testGetFoodFeline() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник");
        feline.getKittens(1);
        Mockito.verify(feline).getKittens(1);
    }



}
