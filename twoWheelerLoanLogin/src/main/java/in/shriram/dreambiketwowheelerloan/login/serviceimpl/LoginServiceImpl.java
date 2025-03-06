package in.shriram.dreambiketwowheelerloan.login.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shriram.dreambiketwowheelerloan.login.repository.LoginRepository;
import in.shriram.dreambiketwowheelerloan.login.servicei.LoginServicei;

@Service
public class LoginServiceImpl implements LoginServicei{

	@Autowired
	LoginRepository lr;
	
	}
