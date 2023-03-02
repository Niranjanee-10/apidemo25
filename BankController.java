package com.example.demo;
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

public class BankController {
@Autowired
private BankService banse;

@GetMapping("/getBank")
public List<Bank>getDetails(){
	return banse.getAllDetails();
	
}
@GetMapping("/getBank/{Acc_no}")
public Optional<Bank>getDetails(@PathVariable("Acc_no") int Acc_no){
	return banse.getDetailsById(Acc_no);
}
@PostMapping("/addBank")
public Bank postDetails(@RequestBody Bank b) {
	return banse.addDetails(b);
}



@PutMapping("/putBank/{Acc_no}")
public Bank putDetails(@RequestBody Bank b ) {
return banse.changeDetails(b);
}
//@PutMapping("/putBank/{Acc_no}")
//public Bank putDetails (@PathVariable("Acc_no") int Acc_no,@RequestBody Bank b)
//{
//return banse.changeDetails(Acc_no,b);
//}


@DeleteMapping("/delBank/{Acc_no}")
public String  deleteDetails(@PathVariable("Acc_no") int Acc_no) {
if(banse.deleteDetails(Acc_no))
	return "Deleted";
else
    return "Acc_no not found";
}


}
