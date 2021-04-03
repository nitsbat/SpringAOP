package org.bisht;

import org.bisht.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService service = context.getBean("shapeService", ShapeService.class);
        service.getCircle().setName("Dummy name");
    }
}
