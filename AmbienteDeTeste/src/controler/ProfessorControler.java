package controler;

import model.Professor;

public class ProfessorControler {

	public void testeProfessor() {
		Professor p1 = new Professor();
		p1.setNome("Ana Claudia");	
		p1.setCpf("44783782822");	
		p1.setSalario(888.90);	
		p1.exibe();
		
	}

}
