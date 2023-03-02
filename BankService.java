package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class BankService {
@Autowired
private BankRepo ban;
public List<Bank>getAllDetails(){
	int pageNo=0;
	int pageSize=3;
	Pageable pageable=PageRequest.of(pageNo, pageSize);
	Page<Bank>page=ban.findAll(pageable);
	List<Bank>details=page.getContent();
	return details;
}

public Optional<Bank>getDetailsById(int Acc_no){
	return ban.findById(Acc_no);
}

public Bank addDetails(Bank b) {
	return ban.save(b);
}

public Bank changeDetails(Bank b) {
ban.save(b);
return b;
}
//public Bank changeDetails(int Acc_no,Bank b)
//{
//Bank bb=ban.findById(Acc_no).orElse(null);
//
//bb.setName(b.getName());
//bb.setAcc_type(b.getAcc_type());
//bb.setBalance(b.getBalance());
//return ban.save(bb);
//}


public boolean deleteDetails(int Acc_no) {
	try {
		
		ban.deleteById(Acc_no);
	}
	catch(Exception e) {
		e.printStackTrace();
		return false;
	}
	return true;
}

}
