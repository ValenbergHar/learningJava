import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext.xml");
        CodeCreator codeCreator = context.getBean("javaCodeCreator", CodeCreator.class);
        System.out.println(codeCreator.getClassExample());
        context.close();
    }
}
