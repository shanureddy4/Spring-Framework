package example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
@Component
public class triangle implements Shape, ApplicationContextAware {
    private Point pointer;
    @Autowired
    private MessageSource messageSource;


    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    private ApplicationEventPublisher publisher;
    public void show(){
        DrawEvent event = new DrawEvent(this);
        publisher.publishEvent(event);

    }

    @PostConstruct
    public void initialize(){
        System.out.println("bean initialized");
    }

    @PreDestroy
    public void destroyed(){
        System.out.println("bean destroyed");
    }

    @Resource(name = "point")
    public void setPoint(Point pointer) {
        this.pointer = pointer;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.publisher = applicationContext;
    }


}
