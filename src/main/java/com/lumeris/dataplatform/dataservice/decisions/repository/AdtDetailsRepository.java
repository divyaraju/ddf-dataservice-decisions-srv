package com.lumeris.dataplatform.dataservice.decisions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumeris.dataplatform.dataservice.decisions.models.AdtDetails;

public interface AdtDetailsRepository extends JpaRepository<AdtDetails, String> {

	public List<AdtDetails> findByFirstName(String patient_id);

}
