package risi.cruds;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {
	@Autowired
services se;
	@PostMapping("/cr")
	public String c(@RequestBody biodata ttt) {
		return se.crea(ttt).getName()+" it created";
	}
	@PutMapping("/up")
	public String u(@RequestBody biodata uuu) {
		return se.crea(uuu).getName()+" its updated";
	}
	@GetMapping("/re")
	public Optional<biodata> r(@PathVariable int lll){
		return se.rea(lll);
	}
	@GetMapping("/li")
	public List<biodata> l(){
		return se.lis();
	}
	@DeleteMapping("/de")
	public String d(int de){
		return se.erased(de);
	}
}
