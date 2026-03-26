package net.charaf.presentation;

import net.charaf.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author $ {USER}
 **/
public class PresentationV3 {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = context.getBean(IMetier.class);

        System.out.println("Result = "+metier.calcul());
    }
}
