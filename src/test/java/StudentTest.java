import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
     void nameIdTest(){

        //given
        Student me = new Student("Nils", 203);

        //when
        String actual = me.toString();

        //then
        Assertions.assertEquals(actual,"Name : Nils ID : 203");


    }

}
