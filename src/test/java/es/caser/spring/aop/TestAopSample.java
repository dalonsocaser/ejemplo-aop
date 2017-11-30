package es.caser.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.caser.spring.aop.eventos.IEvento;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopSampleConfig.class)
public class TestAopSample {
	@Autowired
	@Qualifier("concierto")
	private IEvento concierto;
	@Autowired
	@Qualifier("teatro")
	private IEvento teatro;

	@Test
	public void shouldWork_whenCallingAllEvents_withoutData() {

		concierto.eventoConOcupacion(200l);		
		teatro.eventoConOcupacion(300l);

	}

}
