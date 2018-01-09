package com.lumeris.dataplatform.dataservice.decisions.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientDetails;

public interface PatientDetailsRepository extends JpaRepository<PatientDetails, String>  {

}
