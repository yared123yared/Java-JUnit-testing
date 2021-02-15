import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedTestCase{


    private  int[] numbers= {10,20,30,40,50,90,50};
    private  int key = 50;

    @org.junit.jupiter.api.RepeatedTest(5)
    public void repeatedTest(){
        assertEquals(4,LinearSearch.linearSearch(numbers,key));
    }

    @org.junit.jupiter.api.RepeatedTest(value = 5,name = "{displayName} - {currentRepetition} / {totalRepetitions}")
    @DisplayName("Simple Repeated Test")
    public void repeatedTestWithName(){
        assertEquals(4,LinearSearch.linearSearch(numbers,key));
    }
}
