package JunitUC4;

import java.util.regex.Pattern;

public class UserValidator {

	 private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	    private static final String EMAIL_PATTERN="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	    private static final String MOBILE_PATTERN="[9]{1}[1]{1}[\s][0-9]{10}";

	    public boolean validateFirstName(String fname) {
	        Pattern pattern= Pattern.compile(FIRST_NAME_PATTERN);
	        return pattern.matcher(fname).matches();
	    }


	    public boolean validateLastName(String lname) {
	        Pattern pattern= Pattern.compile(LAST_NAME_PATTERN);
	        return pattern.matcher(lname).matches();
	    }

	    public boolean validateEmail(String email) {
	        Pattern pattern= Pattern.compile(EMAIL_PATTERN);
	        return pattern.matcher(email).matches();
	    }

	    public boolean validateMobile(String mobile) {
	        Pattern pattern=Pattern.compile(MOBILE_PATTERN);
	        return pattern.matcher(mobile).matches();
}
}