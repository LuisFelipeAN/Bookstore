package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classes.Car;


@SpringBootApplication
@RestController
public class DemoApplication {
	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Car obj =(Car) context.getBean(Car.class);
		System.out.println(obj.drive());
		
		/*Vehicle obj =(Vehicle) context.getBean("car");
		System.out.println(obj.drive());*/
		
		
		
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue="World") String name) {
		return String.format("Hello %s!", name);
	}
	
	/*@GetMapping("/greeting")
	public String greeting(@RequestParam(value="name",required=false, defaultValue="World") String name,Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}*/

}
