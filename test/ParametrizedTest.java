import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParametrizedTest {

    private  int[] numbers= {0,1,2,3,4,5,6};

    @ParameterizedTest
   @MethodSource("testCollections")

    public void testUsingParametrizedTest(int num,int num2){
        assertEquals(num2,LinearSearch.linearSearch(numbers,num));

    }
    public static Collection testCollections(){
            return Arrays.asList(new Object[][]{
            {0,0},{1,1},{2,2},{3,3},

        });
    }


}

