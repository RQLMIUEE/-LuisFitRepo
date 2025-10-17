
public class ClasseTreinador extends ClassePessoas{

	
	String especialidade;
	
	
	public  ClasseTreinador(String especialidade2, int id2, int idade2, String nome2) {
		this.especialidade = especialidade2;
		
		super(id2, nome2, idade2);
		}

	public String pegarEspecialidade(){
		return especialidade;
				
	}
	
	public void alterarespecialidade(String especialidade2){
		this.especialidade = especialidade2;
	}
		
	
	
	
	
	
	
}
