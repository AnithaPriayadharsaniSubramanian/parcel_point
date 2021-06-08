package pp.candidatetask.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class UserDAO {


  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  @NotNull
  private long id;

  @NotNull
  @Column(name = "email", nullable = false)
  private String email;

  @NotNull
  @Column(name = "first_name", nullable = false)
  private String firstName;

  @NotNull
  @Column(name = "last_name", nullable = false)
  private String lastName;

  @NotNull
  @Column(name = "created_on", nullable = false)
  private String created_on;

  @NotNull
  @Column(name = "updated_on", nullable = false)
  private String updated_on;

}
