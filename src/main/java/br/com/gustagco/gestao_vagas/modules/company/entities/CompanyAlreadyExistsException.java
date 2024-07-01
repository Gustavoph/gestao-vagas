package br.com.gustagco.gestao_vagas.modules.company.entities;

public class CompanyAlreadyExistsException extends RuntimeException {
  public CompanyAlreadyExistsException() {
    super("Company already exists.");
  }
}
