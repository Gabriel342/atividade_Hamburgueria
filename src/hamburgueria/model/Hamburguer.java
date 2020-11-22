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
@Table(name = "hamburgueres")
@TableGenerator(
		name = "gerador_idH",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "hamburgueres", 
		initialValue = 1,
		allocationSize = 1
)
public class Hamburguer {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="gerador_idH")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "valor")
	private double valor;
	
	@Column(name = "ingredientesComponentes")
	private String ingredientesComponentes;
	
	@OneToMany(mappedBy="hamburgueres")
	private List<Combo> combos;

	public Hamburguer() {
		
	}
	
	public Hamburguer(int id, String nome, double valor, String ingredientesComponentes, List<Combo> combos) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.ingredientesComponentes = ingredientesComponentes;
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

	public String getIngredientesComponentes() {
		return ingredientesComponentes;
	}

	public void setIngredientesComponentes(String ingredientesComponentes) {
		this.ingredientesComponentes = ingredientesComponentes;
	}

	public List<Combo> getCombos() {
		return combos;
	}

	public void setCombos(List<Combo> combos) {
		this.combos = combos;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Nome: " + nome + " Valor: " + valor + " ingredientes:" + ingredientesComponentes;
	}
}
