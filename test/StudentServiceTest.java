import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class StudentServiceTest {


    @Mock
    Database studentDatabaseMock;
    @Test
    public void  testQuery(){
        assertNotNull(studentDatabaseMock);
        when(studentDatabaseMock.isAvailable()).thenReturn(true);
        Service studentService= new Service(studentDatabaseMock);
        studentService.addStudents(new Student(
                "yared","Solomon",21,"Software Engineering"
        ));

        assertEquals(1,studentService.getSize());
    }
}
