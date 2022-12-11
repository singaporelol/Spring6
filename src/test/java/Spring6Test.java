import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6Test {
    @Test
    public void TestSpring(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring.xml");

    }
}
