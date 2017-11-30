package es.caser.spring.aop.eventos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("concierto")
public class EventoConcierto implements IEvento {

	public void evento()throws Exception {
		System.out.println("Concierto de u2");		
		throw new Exception ("Se cancela");
	}

}
