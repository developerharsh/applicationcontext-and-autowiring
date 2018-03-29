package mypack;

import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;;


public class DemoClient 
{
	public static void main(String args[])
	{
		String cfg[]={"Democfg.xml","Democfg2.xml"};
		
		ApplicationContext ac = new FileSystemXmlApplicationContext(cfg);
		
		DemoBean d=(DemoBean) ac.getBean("db");
		d.showData();
	}
}
