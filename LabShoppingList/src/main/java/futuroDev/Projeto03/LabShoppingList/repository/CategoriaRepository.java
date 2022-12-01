package futuroDev.Projeto03.LabShoppingList.repository;

import futuroDev.Projeto03.LabShoppingList.models.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends CrudRepository<Categoria, Long> {

    //gerar querys especificas aqui.
}
