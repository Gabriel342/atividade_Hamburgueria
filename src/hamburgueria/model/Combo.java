package hamburgueria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "combos")
@TableGenerator(
		name = "gerador_idC",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "combos", 
		initialValue = 1,
		allocationSize = 1
)
public class Combo {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="gerador_idC")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "valor")
	private double valor;
	
	@ManyToOne
	@JoinColumn(name = "idHamburguer")
	private Hamburguer hamburgueres;

	@ManyToOne
	@JoinColumn(name = "idBebida")
	private Bebida bebidas;
	
	@ManyToOne
	@JoinColumn(name = "idAcompanhamento")
	private Acompanhamento acompanhamentos;

	public Combo() {
		
	}

	public Combo(int id, String nome, double valor, Hamburguer hamburgueres, Bebida bebidas, Acompanhamento acompanhamentos) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.hamburgueres = hamburgueres;
		this.bebidas = bebidas;
		this.acompanhamentos = acompanhamentos;
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

	public Hamburguer getHamburgueres() {
		return hamburgueres;
	}

	public void setHamburgueres(Hamburguer hamburgueres) {
		this.hamburgueres = hamburgueres;
	}

	public Bebida getBebidas() {
		return bebidas;
	}
	
	public void setBebidas(Bebida bebidas) {
		this.bebidas = bebidas;
	}

	public Acompanhamento getAcompanhamentos() {
		return acompanhamentos;
	}

	public void setAcompanhamentos(Acompanhamento acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " Nome: " + nome + " Valor: " + valor;
	}
}
