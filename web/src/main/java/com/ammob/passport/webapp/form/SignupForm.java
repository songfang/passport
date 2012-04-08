package com.ammob.passport.webapp.form;

import com.ammob.passport.model.User;

/**
 * Spring Register Form Object
 * 
 * @author Mob
 */
public class SignupForm extends User  {
	private static final long serialVersionUID = 1L;
	private String service;
	private String captcha;
	
	/**
	 * Default constructor - creates a new instance with no values set.
	 */
	public SignupForm() {
		
	}
	
	/**
	 * constructor - creates a new instance with set enabled.
	 * @param enabled
	 */
	public SignupForm(boolean enabled){
		setEnabled(enabled);
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getCaptcha() {
		return captcha;
	}
}