import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


class DynamicTest {


    private  int[] numbers= {10,20,30,40,50,90,50};
//    priva
//    te  int key = 50;

    private List<Integer> createInputResult(){
        return Arrays.asList(10,20,30,40,50,90,50);
    }

    private List<Integer> createOutPutResult(){
        return Arrays.asList(0,1,2,3,4,5,4);
    }

    @TestFactory
    public Collection<org.junit.jupiter.api.DynamicTest> dynamicBinaryTest(){
        List<Integer> inputList = createInputResult();
        List<Integer> outPutList = createOutPutResult();

        Collection<org.junit.jupiter.api.DynamicTest> dynamicTestCollection = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++){
            int input = inputList.get(i);
            int outPut = outPutList.get(i);

            org.junit.jupiter.api.DynamicTest dynamicTest = dynamicTest("Dynamic test for linearSearch() : input - "+input,() ->{
                Assertions.assertEquals(outPut,LinearSearch.linearSearch(numbers,input));
            });

            dynamicTestCollection.add(dynamicTest);
        }
        return dynamicTestCollection;
    }
    @TestFactory
    public Stream<DynamicContainer> dynamicTestWithDynamicContainer(){
        return createInputResult().stream()
                .map(input ->
                        dynamicContainer("Container for " + input, Stream.of(
                                dynamicTest("not null",() ->assertNotNull(input)),
                                dynamicContainer("properties test",Stream.of(
                                        dynamicTest("input >0",() -> assertTrue(input>0))
                                ))
                        )));
    }

}
