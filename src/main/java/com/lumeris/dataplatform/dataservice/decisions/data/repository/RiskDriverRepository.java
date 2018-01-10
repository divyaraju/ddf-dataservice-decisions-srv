package com.lumeris.dataplatform.dataservice.decisions.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskDrivers;
import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskModel;

public interface RiskDriverRepository extends JpaRepository<RiskModel, String> {

	public List<RiskDrivers> findByMedicareHealthInsCardNumber(String patient_id);
}
