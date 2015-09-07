package basicspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldDecoupled {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		           ("classpath:/spring/app-context.xml");

		        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);        
        mr.render();	
	}

}
