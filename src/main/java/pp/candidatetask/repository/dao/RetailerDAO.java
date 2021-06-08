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
@Table(name = "Retailer")
public class RetailerDAO {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  @NotNull
  private long id;

  @NotNull
  @Column(name = "name", nullable = false)
  private String name;


  @NotNull
  @Column(name = "created_on", nullable = false)
  private String created_on;

  @NotNull
  @Column(name = "updated_on", nullable = false)
  private String updated_on;

}
