package com.lumeris.dataplatform.dataservice.decisions.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientRosterSummary;

public interface PatientRosterRepository extends JpaRepository<PatientRosterSummary, String> {

	public List<PatientRosterSummary> findAll();

}