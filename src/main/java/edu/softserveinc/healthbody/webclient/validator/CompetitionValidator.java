package edu.softserveinc.healthbody.webclient.validator;

import java.sql.Date;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import edu.softserveinc.healthbody.webclient.constants.ValidatorConstants;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyService;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyServiceImplService;

@Component
public class CompetitionValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return CompetitionDTO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		CompetitionDTO competitionDTO = (CompetitionDTO) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, ValidatorConstants.NAME_FIELD,
				ValidatorConstants.NAME_EMPTY_ERROR, ValidatorConstants.NAME_EMPTY_MESSAGE);

		String competitionName = competitionDTO.getName();
		int competitionLength = competitionName.length();
		if ((competitionLength < 2) || (competitionLength > 20)) {
			errors.rejectValue(ValidatorConstants.NAME_FIELD, ValidatorConstants.NAME_TOOLONG_ERROR,
					ValidatorConstants.NAME_TOOLONG_MESSAGE);
		}

		HealthBodyServiceImplService healthBody = new HealthBodyServiceImplService();
		HealthBodyService service = healthBody.getHealthBodyServiceImplPort();
		if (service.getCompetitionViewByName(competitionName) != null) {
			errors.rejectValue(ValidatorConstants.NAME_FIELD, ValidatorConstants.NAME_INCORRECT_ERROR,
					ValidatorConstants.NAME_INCORRECT_MESSAGE);
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, ValidatorConstants.DESCRIPTION_FIELD,
				ValidatorConstants.DESCRIPTION_EMPTY_ERROR, ValidatorConstants.DESCRIPTION_EMPTY_MESSAGE);

		String descriptionName = competitionDTO.getDescription();
		int descriptionLength = descriptionName.length();
		if ((descriptionLength < 4) || (descriptionLength > 100)) {
			errors.rejectValue(ValidatorConstants.DESCRIPTION_FIELD, ValidatorConstants.DESCRIPTION_TOOLONG_ERROR,
					ValidatorConstants.DESCRIPTION_TOOLONG_MESSAGE);
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, ValidatorConstants.STARTDATE_FIELD,
				ValidatorConstants.STARTDATE_EMPTY_ERROR, ValidatorConstants.STARTDATE_EMPTY_MESSAGE);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, ValidatorConstants.FINISHDATE_FIELD,
				ValidatorConstants.FINISHDATE_EMPTY_ERROR, ValidatorConstants.FINISHDATE_EMPTY_MESSAGE);

		if (competitionDTO.getStartDate() != "" && competitionDTO.getFinishDate() != "") {
			Date startDate = Date.valueOf(competitionDTO.getStartDate());
			Date finishDate = Date.valueOf(competitionDTO.getFinishDate());
			if (startDate.after(finishDate)) {
				errors.rejectValue(ValidatorConstants.STARTDATE_FIELD, ValidatorConstants.STARTDATE_INCORRECT_ERROR,
						ValidatorConstants.STARTDATE_INCORRECT_MESSAGE);
			}
		}

	}
}