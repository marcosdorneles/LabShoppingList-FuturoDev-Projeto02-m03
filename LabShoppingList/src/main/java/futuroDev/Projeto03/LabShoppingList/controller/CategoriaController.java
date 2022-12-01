package futuroDev.Projeto03.LabShoppingList.controller;


import futuroDev.Projeto03.LabShoppingList.models.Categoria;
import futuroDev.Projeto03.LabShoppingList.models.Produto;
import futuroDev.Projeto03.LabShoppingList.repository.CategoriaRepository;
import futuroDev.Projeto03.LabShoppingList.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
     CategoriaService service;

    // cadastra novos produtos
    @PostMapping
    public void cadastrar(@RequestBody Categoria categoria){
        service.salvar(categoria);
    }

    //altera no banco de dados
    @PutMapping
    public void atualizar(@RequestBody Categoria categoria){
        service.salvar(categoria);
    }

    //deleta itens
    @DeleteMapping
    public void excluir(@RequestBody Categoria categoria){
        service.excluir(categoria);
    }

    //pesquisa todos os itens no banco de dados
    @GetMapping("/listAll")
    public List<Categoria> listaTodos(){
        return service.buscaTodos();
    }


    //Query específico de itens por Id
    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Long id){
        return service.buscaId(id);
    }

}
