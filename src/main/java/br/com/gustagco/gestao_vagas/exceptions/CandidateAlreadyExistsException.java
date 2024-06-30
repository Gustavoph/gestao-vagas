package br.com.gustagco.gestao_vagas.exceptions;

public class CandidateAlreadyExistsException extends RuntimeException {
  public CandidateAlreadyExistsException() {
    super("Candidate already exists.");
  }
}
