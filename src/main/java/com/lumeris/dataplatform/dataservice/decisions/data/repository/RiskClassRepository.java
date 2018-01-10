package com.lumeris.dataplatform.dataservice.decisions.data.repository;

import java.util.List;

import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskClass;

public interface RiskClassRepository {

	public List<RiskClass> findByMedicareHealthInsCardNumber(String patient_id);
}
