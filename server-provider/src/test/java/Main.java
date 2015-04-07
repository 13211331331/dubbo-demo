import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by ivoss on 2015/4/7.
 */
    public class Main {
        public static void main(String[] args) throws IOException {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });
            context.start();
            System.out.println("按任意键退出");
            System.in.read();
        }
    }
