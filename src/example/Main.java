package example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
    public static void main(String[] args) {

//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        java.triangle tr = (java.triangle) beanFactory.getBean("java.triangle");
//        tr.show();

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //x x    applicationContext.registerShutdownHook();
        Shape shape = (Shape) applicationContext.getBean("triangle");
//        System.out.println(applicationContext.getMessage("greetings",null,"default one",null));
        shape.show();

    }
}