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
@Table(name = "Agent")
public class AgentDAO {


  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  @NotNull
  private long id;

  @NotNull
  @Column(name = "name", nullable = false)
  private String name;

  @NotNull
  @Column(name = "address", nullable = false)
  private String address;

  @NotNull
  @Column(name = "created_on", nullable = false)
  private String created_on;

  @NotNull
  @Column(name = "updated_on", nullable = false)
  private String updated_on;

}
