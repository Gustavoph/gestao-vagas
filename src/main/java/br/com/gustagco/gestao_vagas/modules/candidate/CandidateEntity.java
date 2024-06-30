package br.com.gustagco.gestao_vagas.modules.candidate;

import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "candidate")
public class CandidateEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Pattern(regexp = "^(?!\\s*$).+")
  private String name;

  private String username;

  @Email(message = "Invalid e-mail")
  private String email;

  @Length(min = 8, max = 100)
  private String password;

  private String description;

  private String curriculum;

  @Column(name = "created_at")
  @CreationTimestamp
  private LocalDateTime createdAt;
}
