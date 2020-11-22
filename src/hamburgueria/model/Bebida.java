package hamburgueria.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "bebidas")
@TableGenerator(
		name = "gerador_idB",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "bebidas", 
		initialValue = 1,
		allocationSize = 1
)
public class Bebida {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="gerador_idB")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "valor")
	private double valor;
	
	@OneToMany(mappedBy="bebidas")
	private List<Combo> combos;

	public Bebida() {
		
	}
	
	public Bebida(int id, String nome, double valor, List<Combo> combos) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.combos = combos;
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

	public List<Combo> getCombos() {
		return combos;
	}

	public void setCombos(List<Combo> combos) {
		this.combos = combos;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " Nome: " + nome + " Valor: " + valor;
	}
}
