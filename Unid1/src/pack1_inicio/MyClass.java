package pack1_inicio;

import java.io.Serializable;

/**
 * Classe usada nos váris exemplos.
 */
public class MyClass implements Serializable
{
	private static final long serialVersionUID = 2424749172434097388L;
	
	// Atributos
	int inteiro;
	double valor;
	String nome;
	
	// Construtor
	public MyClass(int inteiro, double valor, String nome) {
		this.inteiro = inteiro;
		this.valor = valor;
		this.nome = nome;
	}

	// Metodos
	public int getInteiro() {
		return inteiro;
	}

	public void setInteiro(int inteiro) {
		this.inteiro = inteiro;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "MyClass ["
				+ "inteiro=" + inteiro + ", "
				+ "valor=" + valor + ", " 
				+ (nome != null ? "nome=" + nome : "")
				+ "] ";
	}
	
}
