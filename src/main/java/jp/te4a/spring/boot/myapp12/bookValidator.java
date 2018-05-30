package jp.te4a.spring.boot.myapp12;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class bookValidator implements ConstraintValidator<bookValid,String>{
	String param;
	@Override
	public void initialize(bookValid nv) {param = nv.param();}
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt) {
		if(in == null) {
			return false;
		}
		System.out.println(in.equals(param));
		return !in.equals(param);//pramのイコールをチェック
	}
}