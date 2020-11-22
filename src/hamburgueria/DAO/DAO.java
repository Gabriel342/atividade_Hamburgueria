package hamburgueria.DAO;

import java.util.List;

public interface DAO<T> {
	
	T salvar(T entidade);
	List <T> listar();
	T buscarPorId(Integer id);
	T atualizar(T entidade);
	void apagar(Integer id);
}

