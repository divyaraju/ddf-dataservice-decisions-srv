package com.lumeris.dataplatform.dataservice.decisions.api.api;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientDetails;
import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientRosterItem;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

@Controller
public class V1ApiController implements V1Api {

    public ResponseEntity<PatientDetails> getPatientDetailsByIdUsingGET( @NotNull@ApiParam(value = "Full Name of the patient where patient-name starts with provided value.", required = true) @RequestParam(value = "patientid", required = true) String patientid) {
        // do some magic!
        return new ResponseEntity<PatientDetails>(HttpStatus.OK);
    }

    public ResponseEntity<List<PatientRosterItem>> getPatientRosterSummaryUsingGET() {
        // do some magic!
        return new ResponseEntity<List<PatientRosterItem>>(HttpStatus.OK);
    }

}
