
public class ClassePessoas {

	int id;
	int idade;
	String nome;
	
	
	
	public  ClassePessoas() {
		
	}
	
public  ClassePessoas(int id2, int idade2, String nome2) {
		
	this.id = id2;
	this.idade = idade2;
	this.nome = nome2;
	
	}



public String pegarNome(){
	return nome;
}

public int pegarid(){
	return id;
}

public int pegaridade(){
	return idade;
}
	
	
public void alterarId(int id2) {
	this.id = id2;
}

public void alterarIdade(int idade2) {
	this.idade = idade2;
}

public void alterarNome(String nome2) {
	this.nome = nome2;
}


}


