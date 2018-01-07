package com.lumeris.dataplatform.dataservice.decisions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

public interface PatientRosterRepository extends JpaRepository<PatientRosterSummary, String> {

	public List<PatientRosterSummary> findByFirstName(@Param("firstname") String firstname);

}
