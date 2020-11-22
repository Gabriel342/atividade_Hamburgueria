package hamburgueria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "sobremesas")
@TableGenerator(
		name = "gerador_idS",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "sobremesas", 
		initialValue = 1,
		allocationSize = 1
)
public class Sobremesa {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="gerador_idS")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "valor")
	private double valor;
	
	public Sobremesa() {
		
	}
	
	public Sobremesa(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Nome: " + nome + " Valor: " + valor;
	}
}
