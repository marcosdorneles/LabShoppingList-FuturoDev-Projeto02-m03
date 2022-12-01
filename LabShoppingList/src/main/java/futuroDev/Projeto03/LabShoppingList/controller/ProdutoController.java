package futuroDev.Projeto03.LabShoppingList.controller;

import futuroDev.Projeto03.LabShoppingList.models.Produto;
import futuroDev.Projeto03.LabShoppingList.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    ProdutoService service;

    // cadastra novos produtos
    @PostMapping
    public void cadastrar(@RequestBody Produto produto){
        service.salvar(produto);
    }

    //altera no banco de dados
    @PutMapping
    public void atualizar(@RequestBody Produto produto){
        service.salvar(produto);
    }

    //deleta itens
    @DeleteMapping
    public void excluir(@RequestBody Produto produto){
        service.excluir(produto);
    }

    //pesquisa todos os itens no banco de dados
    @GetMapping("/list")
    public List<Produto>listaTodos(){
        return service.buscaTodos();
    }


    //Query específico de itens por Id
    @GetMapping("/{id}")
    public Produto getById(@PathVariable Long id){
       return service.buscaId(id);
    }
}
