import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class UsingMockObjects {
    @Mock
    Database databaseMock;
    @Test
    public void  testQuery(){
       Student student= new  Student(
                "solomonn","Solomon",21,"Software Engineering"
        );
        Student student2= new  Student(
                "Yared","Solomon",21,"Software Engineering"
        );

        assertNotNull(databaseMock);
//        when(databaseMock.isAvailable()).thenReturn(true);
        when(databaseMock.addStudents(student)).thenReturn(new  Student(
                "Yared","Solomon",21,"Software Engineering"
        ));
        Service studentService= new Service(databaseMock);


//       boolean check=studentService.query("* from t");
       Student student1=studentService.addStudents(student);
//       System.out.println(check);
//       assertTrue(check);
        assertEquals("Yared Solomon",student1.getFullName());
    }
}