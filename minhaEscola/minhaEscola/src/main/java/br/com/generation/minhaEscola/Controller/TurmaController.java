package br.com.generation.minhaEscola.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.generation.minhaEscola.Model.Turma;
import br.com.generation.minhaEscola.Service.TurmaService;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController {
	
	@Autowired
	private TurmaService turmaService;
	
	@Autowired
	public TurmaController(TurmaService turmaService) {
		this.turmaService = turmaService;
	}
	
	@GetMapping
	public ResponseEntity<List <Turma>> GetAll(){
		return ResponseEntity.ok(turmaService.GetAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Turma> GetById(@PathVariable long id){
		return ResponseEntity.ok(turmaService.GetTurma(id));
				
	}
	
	@PostMapping
	public ResponseEntity<Turma> Post(@RequestBody Turma turma){
		return ResponseEntity.ok(turmaService.CreateOrUpdate(turma));
	}
	
	@PutMapping
	public ResponseEntity<Turma> Put(@RequestBody Turma turma){
		return ResponseEntity.ok(turmaService.CreateOrUpdate(turma));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> Delete(@PathVariable long id) {
		turmaService.Delete(id);
		return ResponseEntity.ok("Turma Deletada");
	}
}






