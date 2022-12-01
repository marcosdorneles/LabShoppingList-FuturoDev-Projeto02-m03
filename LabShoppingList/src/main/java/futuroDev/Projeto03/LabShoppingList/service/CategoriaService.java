package futuroDev.Projeto03.LabShoppingList.service;

import futuroDev.Projeto03.LabShoppingList.models.Categoria;
import futuroDev.Projeto03.LabShoppingList.models.Produto;
import futuroDev.Projeto03.LabShoppingList.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public void salvar(Categoria categoria){
        repository.save(categoria);
    }

    public void excluir(Categoria categoria){repository.delete(categoria);}

    public List<Categoria> buscaTodos(){
        return (List<Categoria>) repository.findAll();
    }

    public Categoria buscaId(Long id){
        return repository.findById(id).get();
    }

}
