package futuroDev.Projeto03.LabShoppingList.repository;

import futuroDev.Projeto03.LabShoppingList.models.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository <Produto, Long>{

//    @Query(value = "SELECT * from produtos p WHERE p.descricao = :descricao")
//    public Produto findDescricao(String descricao);
//
//    public List<Produto> findByNome(String nome);
}
