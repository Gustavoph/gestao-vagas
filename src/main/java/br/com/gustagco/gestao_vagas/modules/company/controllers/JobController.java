package br.com.gustagco.gestao_vagas.modules.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustagco.gestao_vagas.modules.company.entities.JobEntity;
import br.com.gustagco.gestao_vagas.modules.company.useCases.CreateJobUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/jobs")
public class JobController {
  
  @Autowired
  private CreateJobUseCase createJobUseCase;

  @PostMapping("")
  public JobEntity create(@Valid @RequestBody JobEntity job) {
    return this.createJobUseCase.execute(job);
  }
}
