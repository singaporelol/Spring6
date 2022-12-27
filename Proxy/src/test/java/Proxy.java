import com.spring6.proxy.service.OrderService;
import com.spring6.proxy.service.OrderServiceImpl;
import com.spring6.proxy.service.OrderServiceProxy;
import com.spring6.proxy.service.TimerInvocationHandler;
import org.junit.Test;

public class Proxy {

    @Test
    public void TestStaticProxy(){
        //创建目标对象
        OrderService target= new OrderServiceImpl();
        //创建代理对象
        OrderService proxy = new OrderServiceProxy(target);
        //调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();

    }
    @Test
    public void TestDynamicProxy(){
        //创建目标对象：
        OrderService target = new OrderServiceImpl();
        //创建代理对象
        OrderService o = (OrderService)java.lang.reflect.Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimerInvocationHandler(target)
        );
        o.generate();
        o.modify();
        o.detail();

    }
}
