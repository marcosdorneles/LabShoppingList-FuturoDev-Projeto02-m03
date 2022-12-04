package futuroDev.Projeto03.LabShoppingList.service;

import futuroDev.Projeto03.LabShoppingList.models.Produto;
import futuroDev.Projeto03.LabShoppingList.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;


    public void salvar(Produto produto){
        repository.save(produto);
    }

    public void excluir(Produto produto){repository.delete(produto);}


    //testando delecão por id
    public void deleteById(Long idUsuario){
        repository.deleteById(idUsuario);
    }

    public List<Produto>buscaTodos(){
        return (List<Produto>) repository.findAll();
    }

    public Produto buscaId(Long id){
        return repository.findById(id).get();
    }
}
