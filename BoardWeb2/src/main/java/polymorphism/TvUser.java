package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
//------------<1> 그냥 클래스의 객체 생성해서 메소드 호출
		//		SamsungTV stv = new SamsungTV();
//		stv.powerOn();
//
//		LgTV ltv = new LgTV();
//		ltv.turnOn();
//------------<2> 인터페이스 구현한 클래스객체 생성해서 메소드 호출
//		TV tv = new SamsungTV();
//		tv.powerOn();
//------------<3> 디자인 패턴 이용해서 객체 생성하고 메소드 호출
		/* 먼저 BeanFactory 를 만들고 거기서 samsung lg 를 분류해서 객체를 생성*/
//		BeanFactory bf = new BeanFactory();
//		TV tv = (TV) bf.getBean(args[0]);
//		tv.powerOn();
//------------<4> loC로 메소드 호출
		/* Spring Bean Configuration FIle >>applicationContext.xml 만들고
			사용하기 위해서는 클래스 하나당 하나의 <bean> 설정이 필요*/
		// 1 >> spring container 구동
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// 2 >> request instance from spring container
//		TV tv = (TV)factory.getBean("tv");
//		tv.powerOn();
		// 3 >> out of container
//		factory.close();
	
	
	}

}
