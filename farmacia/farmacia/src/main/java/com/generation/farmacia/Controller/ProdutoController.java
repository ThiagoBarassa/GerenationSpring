package com.generation.farmacia.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia.Model.Produto;
import com.generation.farmacia.Repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@PostMapping
	public ResponseEntity<Produto> Post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> Put(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(produto));
	}
	@GetMapping
	public ResponseEntity <List<Produto>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.badRequest()
				.build());
	}
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
