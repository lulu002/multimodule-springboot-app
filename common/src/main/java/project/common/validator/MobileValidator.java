package project.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import project.common.util.StringUtil;


public class MobileValidator implements ConstraintValidator<Mobile, String> {

	@Override
	public void initialize(Mobile arg0) {
		
	}

	@Override
	public boolean isValid(String mobile, ConstraintValidatorContext arg1) {
		boolean ret = true;
		if(mobile != null){
			ret = StringUtil.isMobile(mobile);
		}
		return ret;
	}
}
