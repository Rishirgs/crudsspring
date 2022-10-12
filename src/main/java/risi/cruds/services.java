package risi.cruds;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class services {
	@Autowired
	repositories rep;
public biodata crea(biodata rrr) {
	return rep.save(rrr);
}
public List<biodata> lis(){
	return (List<biodata>) rep.findAll();
}
public Optional<biodata> rea(int learn){
	return rep.findById(learn);
}
public String erased(int del) {
	String oo=rep.findById(del).orElse(new biodata()).getName()+"it is deleted";
	rep.deleteById(del);
	return oo;
}
}
