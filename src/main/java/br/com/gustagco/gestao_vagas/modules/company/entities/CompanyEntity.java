package br.com.gustagco.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity(name = "company")
@Data
public class CompanyEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  private String username;
  
  @Email(message = "Invalid e-mail")
  private String email;
  
  @Length(min = 8, max = 100)
  private String password;
  
  private String website;
  
  @Pattern(regexp = "^(?!\\s*$).+")
  private String name;
  
  private String description;

  @Column(name = "created_at")
  @CreationTimestamp
  private LocalDateTime createdAt;
}
