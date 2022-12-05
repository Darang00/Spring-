package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
	
	public static void main(String[] args) {
		/*
		//NewRecordView view = new NewRecordView(100, 50, 40);
		//view.print();
		
		NewRecordView view = new NewRecordView();
		//놀다가
		//NewRecord 객체가 필요하면
		NewRecord record = new NewRecord(100, 50, 50);
		view.setRecord(record); //의존객체의 주소 주입 (setter 함수)ㄴ
		
		view.input();		
		view.print();
		
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		//Spring 필요한 메모리공간을 생성하고 생성된 메모리에 DIConfig.xml read 해서 객체 생성하는 코드
		RecordView view = (RecordView)context.getBean("view");
		
		view.input();
		view.print();
		
		//에러 터짐_ Caused by: java.lang.ClassNotFound: org.apache.common.logging.logFactory
	}
}
