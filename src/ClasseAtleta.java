
public class ClasseAtleta extends ClassePessoas {

	String modalidade;
	
	
	
	public  ClasseAtleta(String modalidade2, String nome2, int id2, int idade2) {
		
		this.modalidade = modalidade2;
		super(id2, nome2, idade2);

		
		}


	
	
	
	public String pegarModalidade(){
		return modalidade;
				
	}
	
	public void alterarModalidade(String modalidade2){
		this.modalidade = modalidade2;
	}
	
}
