import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {


    public static void main(String[] args) {
        new main().test();
    }

    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/application-*.xml");

    }
}

