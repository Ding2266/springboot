package cn.mldn.microboot.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("cn.mldn.microboot")
public class StartSpringBootMain {
	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootMain.class, args) ; 
	}
}
