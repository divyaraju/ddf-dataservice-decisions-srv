package com.lumeris.dataplatform.dataservice.decisions.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumeris.dataplatform.dataservice.decisions.data.models.AdtDetails;

public interface AdtDetailsRepository extends JpaRepository<AdtDetails, String> {

	public List<AdtDetails> findByMedicareHealthInsCardNumber(String patient_id);

}
