import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMethodOrder {


    private  int[] numbers= {10,20,30,40,50,90,50};
    private  int key = 50;


    @Test
    @Order(3)
    public void testInputsNull(){
        System.out.println("test1");
        assertNotNull(numbers);
        assertNotNull(key);
    }
    @Test
    @Order(2)
    public  void testNumbersLength(){
        System.out.println("test2");
        assertFalse(numbers.length < 0);
    }
    @Test
    @Order(1)
    public void testGetIndex(){
        System.out.println("test3");
        assertEquals(4,LinearSearch.linearSearch(numbers,key));
    }
}
