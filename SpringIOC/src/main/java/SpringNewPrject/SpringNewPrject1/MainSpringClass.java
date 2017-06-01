package SpringNewPrject.SpringNewPrject1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringClass {
	
	public static void main(String args[]){
		
/*ApplicationContext context = new ClassPathXmlApplicationContext("Cfg.xml");
		
		Custom cus=(Custom)context.getBean("cust");*/
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationCfg.xml");
		
		Custom cus=(Custom)context.getBean("cust");*/
		
		//BeanFactory context = new XmlBeanFactory(new ClassPathResource(""));
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaBasedCfg.class);
		Custom cus=context.getBean(Custom.class);
		
		System.out.println(cus.toString());

		
		
		 
	}

}
