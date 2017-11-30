package es.caser.spring.aop.eventos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("teatro")
public class EventoTeatro implements IEvento {

	public void evento(){
		
		System.out.println("Un tren llamado deseo");
	}

}
