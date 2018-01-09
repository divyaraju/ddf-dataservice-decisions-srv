package com.lumeris.dataplatform.dataservice.decisions.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskModel;

public interface RiskModelRepository extends JpaRepository<RiskModel, String> {

	public List<RiskModel> findBypatientid(String patient_id);
}
