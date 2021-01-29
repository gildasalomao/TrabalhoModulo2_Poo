package mz.co.ciuem.aula6.Trabalho;

public class EstudanteAluguer {
	private String nome;
	private int celular;
	private int nrQuarto;
	

	
	
	public EstudanteAluguer(String nome, int celular, int nrQuarto) {
		super();
		this.nome = nome;
		this.celular = celular;
		this.nrQuarto = nrQuarto;
	}

	public EstudanteAluguer() {
		
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getNrQuarto() {
		
		return nrQuarto;
	}
	

	

	public void setNrQuarto(int nrQuarto) {
		if (nrQuarto>9) {
			System.out.println(" Quarto invalido");
			this.nrQuarto = nrQuarto;
		}else
		this.nrQuarto = nrQuarto;
		
		
	}

	@Override
	public String toString() {

		return "Estudante: " + nome + "\nCelular: " + celular + "\nQuarto Alugado: " + nrQuarto;
	}
	
	public String ListarQuartoEmOrdemCrescente() {
		return "Quarto " + nrQuarto + " - " + nome + ", " + celular + ".";
	}

}
