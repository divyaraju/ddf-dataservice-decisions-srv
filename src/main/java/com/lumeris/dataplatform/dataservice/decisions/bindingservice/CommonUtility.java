package com.lumeris.dataplatform.dataservice.decisions.bindingservice;

import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientRosterItem.GenderEnum;
import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientRosterItem.ReadmitRiskValueEnum;

public class CommonUtility {

	public static GenderEnum getGender(String gender) {
		if (gender.equalsIgnoreCase("F")) {
			return GenderEnum.F;
		} else if (gender.equalsIgnoreCase("M")) {
			return GenderEnum.M;
		}
		return GenderEnum.O;
	}

	public static ReadmitRiskValueEnum getReadmitRiskValueEnum(String readmitRiskValueEnum) {
		if (readmitRiskValueEnum.equalsIgnoreCase("LOW")) {
			return ReadmitRiskValueEnum.LOW;
		} else if (readmitRiskValueEnum.equalsIgnoreCase("MODERATE")) {
			return ReadmitRiskValueEnum.MODERATE;
		} else if (readmitRiskValueEnum.equalsIgnoreCase("HIGH")) {
			return ReadmitRiskValueEnum.HIGH;
		}
		return ReadmitRiskValueEnum.NONE;

	}
}
