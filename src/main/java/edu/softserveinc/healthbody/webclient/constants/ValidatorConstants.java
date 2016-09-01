package edu.softserveinc.healthbody.webclient.constants;

//for validation
public class ValidatorConstants {

	public static final String NAME_FIELD = "name";
	public static final String DESCRIPTION_FIELD = "description";
	public static final String STARTDATE_FIELD = "startDate";
	public static final String FINISHDATE_FIELD = "finishDate";
	
	public static final String NAME_EMPTY_ERROR = "name.empty";
	public static final String NAME_TOOLONG_ERROR = "name.tooLong";
	public static final String NAME_INCORRECT_ERROR = "name.incorrect";
	public static final String DESCRIPTION_EMPTY_ERROR = "description.empty";
	public static final String DESCRIPTION_TOOLONG_ERROR = "description.tooLong";
	public static final String STARTDATE_EMPTY_ERROR = "startDate.empty";
	public static final String STARTDATE_INCORRECT_ERROR = "startDate.incorrect";
	public static final String FINISHDATE_EMPTY_ERROR = "finishDate.empty";
	
	public static final String NAME_EMPTY_MESSAGE = "Please enter a competition name";
	public static final String NAME_TOOLONG_MESSAGE = "Please enter value betwen than or equal 2-20 characters";
	public static final String NAME_INCORRECT_MESSAGE = "Competition name already exist. Please choose another name";
	public static final String DESCRIPTION_EMPTY_MESSAGE = "Please enter a competition description";
	public static final String DESCRIPTION_TOOLONG_MESSAGE = "Please enter value betwen than or equal 4-100 characters";
	public static final String STARTDATE_EMPTY_MESSAGE = "Please enter a competition startDate";
	public static final String STARTDATE_INCORRECT_MESSAGE = "Please enter correct start and finish dates";
	public static final String FINISHDATE_EMPTY_MESSAGE = "Please enter a competition finishDate";
	
}
