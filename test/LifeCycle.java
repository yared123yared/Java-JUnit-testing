import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LifeCycle {


    private  int[] numbers= {10,20,30,40,50,90,50};
    private  int key = 50;

    @BeforeAll
    public void beforeAll(){
        System.out.println("Before All executed");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Each Excuted");
    }

    @Test
    public void testLinearSearch1(){

        System.out.println("Test one ");
        Assertions.assertEquals(5,LinearSearch.linearSearch(numbers,key));
    }
    @Test
    public  void  testLinearSearch2(){
        System.out.println("Test two ");
        Assertions.assertEquals(4,LinearSearch.linearSearch(numbers,key));
    }
    @Test
    public void testLinearSearch3(){
        System.out.println("Test three ");
        Assertions.assertEquals(6,LinearSearch.linearSearch(numbers,key));
    }
    @AfterEach
    public void afterEach(){
        System.out.println("After Each Excuted");
    }

    @AfterAll
    public void afterAll(){
        System.out.println("After All Executed");
    }

}
