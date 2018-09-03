package com.XtremeFitess.login;

import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Component;
import org.springframework.validation.*;

@Component
public class RegisterValidator implements Validator {
	public boolean supports(Class clazz){
		return User.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors) {
		User user=(User)obj;
		if(user.getName()==null||user.getName().length()==0){
			errors.rejectValue("name","error.sname.required",new Object[]{},"Name is reqired");
		}
		
	
		if(user.getEmail()==null||user.getEmail().length()==0){
			errors.rejectValue("email","error.email.required",new Object[]{},"email is reqired");
		}
		else if(!((user.getEmail().contains("@"))&&(user.getEmail().endsWith(".com")||user.getEmail().endsWith(".co.in")||
				user.getEmail().endsWith(".in")))){
			errors.rejectValue("email","error.email.required",new Object[]{},"invalid email");
		}
	

		if(user.getPassword()==null||user.getPassword().length()==0)
		 {
			errors.rejectValue("password","error.password.required",new Object[]{},"passsword is reqired");
		  }
		

		if(user.getConfirm_password()==null||user.getConfirm_password().length()==0)
		 {
			errors.rejectValue("confirm_password","error.confirm_password.required",new Object[]{},"confirm_passsword is reqired");
		  }
		else if(user.getPassword()==user.getConfirm_password()){
			errors.rejectValue("confirm_password","error.confirm_password.required",new Object[]{},"confirm_passsword is reqired");

		}
		
			
	}

}




	