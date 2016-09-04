package edu.softserveinc.healthbody.webclient.constants;

//for validation
public class ValidatorConstants {
	
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_FORMAT_MESSAGE = "Wrong date format! Please change format to \"yyyy-MM-dd\" ";
	public static final String NAME_FORMAT = "^[a-zA-Z0-9._%+-]+( [a-zA-Z0-9._%+-]+)*$";
	public static final String DESCRIPTION_FORMAT = "^[a-zA-Z0-9._%+-]+( [a-zA-Z0-9._%+-]+)*$";

	public static final String NAME_FIELD = "name";
	public static final String DESCRIPTION_FIELD = "description";
	public static final String DESCRIPTIONS_FIELD = "descriptions";
	public static final String STARTDATE_FIELD = "startDate";
	public static final String FINISHDATE_FIELD = "finishDate";
	public static final String GROUP_STATUS = "status";
	
	public static final String NAME_EMPTY_ERROR = "name.empty";
	public static final String NAME_TOOLONG_ERROR = "name.tooLong";
	public static final String NAME_EXIST_ERROR = "name.exist";
	public static final String NAME_FORMAT_ERROR = "name.format";
	public static final String DESCRIPTION_EMPTY_ERROR = "description.empty";
	public static final String DESCRIPTION_TOOLONG_ERROR = "description.tooLong";
	public static final String DESCRIPTION_FORMAT_ERROR = "description.format";
	public static final String STARTDATE_EMPTY_ERROR = "startDate.empty";
	public static final String STARTDATE_FORMAT_ERROR = "startDate.format";
	public static final String STARTDATE_INCORRECT_ERROR = "startDate.incorrect";
	public static final String FINISHDATE_EMPTY_ERROR = "finishDate.empty";
	public static final String FINISHDATE_FORMAT_ERROR = "finishDate.format";
	public static final String GROUP_STATUS_EMPTY_ERROR = "status.empty";
	
	public static final String NAME_EMPTY_MESSAGE = "Please enter a competition name";
	public static final String GROUP_NAME_EMPTY_MESSAGE = "Please enter a group name";
	public static final String NAME_TOOLONG_MESSAGE = "Please enter value between than or equal 2-20 characters";
	public static final String NAME_EXIST_MESSAGE = "Competition name already exist. Please choose another name";
	public static final String GROUP_NAME_EXIST_MESSAGE = "Group name already exist. Please choose another name";
	public static final String NAME_FORMAT_MESSAGE = "Name must consist only of letters, digits and \"._%+-\" characters";
	public static final String DESCRIPTION_EMPTY_MESSAGE = "Please enter a competition description";
	public static final String GROUP_DESCRIPTION_EMPTY_MESSAGE = "Please enter a group description";
	public static final String DESCRIPTION_TOOLONG_MESSAGE = "Please enter value between than or equal 4-100 characters";
	public static final String DESCRIPTION_FORMAT_MESSAGE = "Description must consist only of letters, digits and \"._%+-\" characters";
	public static final String STARTDATE_EMPTY_MESSAGE = "Please enter a competition startDate";
	public static final String STARTDATE_INCORRECT_MESSAGE = "Please enter correct start and finish dates";
	public static final String FINISHDATE_EMPTY_MESSAGE = "Please enter a competition finishDate";
	public static final String GROUP_STATUS_EMPTY_MESSAGE = "Please enter a group status";
	public static final String GROUP_STATUS_TOOLONG_MESSAGE = "Please enter \"active\" or \"disabled\"";
}
