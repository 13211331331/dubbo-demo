import com.hhl.service.DemoServer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by ivoss on 2015/4/7.
 */
public class Client {
    @Test
    public void testSayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
        context.start();
        DemoServer demoServer = (DemoServer) context.getBean("demoService");
        System.out.println("client:"+demoServer.sayHello("Morning"+"1:"+new Date())+"3:"+new Date());
    }
}
