
public class ClasseTreinador extends ClassePessoas{

	
	String especialidade;
	
	
	public  ClasseTreinador(String especialidade2) {
		this.especialidade = especialidade2;
		}

	public String pegarEspecialidade(){
		return especialidade;
				
	}
	
	public void alterarespecialidade(String especialidade2){
		this.especialidade = especialidade2;
	}
		
	
}
