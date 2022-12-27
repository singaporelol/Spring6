import com.spring6.Component;
import com.spring6.Teacher;
import com.spring6.proxy.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void TestAnnotation() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.spring6.User");
        if (aClass.isAnnotationPresent(Component.class)) {
            Component annotation = aClass.getAnnotation(Component.class);
            System.out.println(annotation.value());
        }
    }
    @Test
    public void TestAnnotation2(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-Annotation.xml");
        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
    @Test
    public void TestAnnotation3(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-Annotation.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.save();
        System.out.println(orderService);
    }
}
