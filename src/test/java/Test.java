import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test {
    Application application = new Application();
    /*@BeforeAll
    public void init(){
        application=new Application();

    }*/
    @org.junit.Test
    public void test1 (){


        Assertions.assertTrue(application.add(9));

    }
    @org.junit.Test
    public void test2(){

        Assertions.assertFalse(application.add(6));

    }

}
