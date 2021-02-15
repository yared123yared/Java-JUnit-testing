import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

class Assumption {


    //   linear Search
    private  int[] numbers= {10,20,30,40,50,90,50};
    private  int key = 50;

    @Test
    void main() {
    }


    @Test
    public void assumeTrueWithNoMessage(){
//        System.setProperty("ENV","DEV");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));
        System.out.println(System.getProperty("ENV"));
        assumeTrue("DEV".equals(System.getProperty("ENV")));
        System.out.println("Assumption Passed!!!");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));
    }

    @Test
    public void assumeFalseWithNoMessage(){
//        System.setProperty("ENV","DEV");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));
        assumeFalse("ENV".equals(System.getProperty("ENV")));
        System.out.println("Assumption Passed!!!");

        assertEquals(4,LinearSearch.linearSearch(numbers,50));
    }
    @Test
    public void assumingThatWithBooleanCondition(){
//        System.setProperty("ENV","DEV");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));
        assumingThat("DEV".equals(System.getProperty("ENV")),() ->{
            System.out.println("Assumption passed!!");

            assertEquals(4,LinearSearch.linearSearch(numbers,50));

        });

        System.out.println("Excutable in All Environment!!!");
        assertEquals(4,LinearSearch.linearSearch(numbers,50));

    }
}
