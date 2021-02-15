import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {



    private  int[] numbers= {10,20,30,40,50,90,50};
    private  int key = 50;

    @Test
    @EnabledOnOs(value = {OS.MAC,OS.WINDOWS})
    public void enableOnWindowsAndMac(){
        System.out.println("Executed on Windows and Mac");
        Assertions.assertEquals(4,LinearSearch.linearSearch(numbers,key));

    }

    @Test
    @DisabledOnOs(value = {OS.MAC})
    public void disableOnWindow(){
        System.out.println("Executed not on WINDOWS only on MAC");
        Assertions.assertEquals(4,LinearSearch.linearSearch(numbers,key));

    }
    @Test
    @EnabledOnJre(value = {JRE.JAVA_8,JRE.JAVA_10,JRE.JAVA_13})
    public void enableOnJavaVersions(){
        System.out.println("Executed on Java 8 and Java 10");
        Assertions.assertEquals(4,LinearSearch.linearSearch(numbers,key));
    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_8})
    public void disableOnJavaEight(){
        System.out.println("Disabled on Java 8");
        Assertions.assertEquals(4,LinearSearch.linearSearch(numbers,key));

    }
}
