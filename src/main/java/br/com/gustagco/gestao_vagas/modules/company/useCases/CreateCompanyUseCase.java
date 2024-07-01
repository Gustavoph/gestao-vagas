package br.com.gustagco.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustagco.gestao_vagas.modules.company.entities.CompanyAlreadyExistsException;
import br.com.gustagco.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.gustagco.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {

  @Autowired
  private CompanyRepository companyRepository;

  public CompanyEntity execute(CompanyEntity company) {
    this.companyRepository
      .findByUsernameOrEmail(company.getUsername(), company.getEmail())
      .ifPresent((entity) -> { throw new CompanyAlreadyExistsException(); });
    
    return this.companyRepository.save(company);
  }
}
