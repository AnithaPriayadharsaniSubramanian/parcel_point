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
@Table(name = "Parcel")
public class ParcelDAO {

  @Id
  //@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PARCEL_KEY")
 /*@SequenceGenerator(
          name="SEQ_PARCEL_KEY",
          sequenceName = "SEQ_PARCEL_KEY",
          schema = "parcelpoint_Schema",
          allocationSize = 1)
   @SequenceGenerator(name="SEQ_PARCEL_KEY", initialValue=1, allocationSize=100)*/

  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  @NotNull
  private long id;

  @NotNull
  @Column(name = "external_id", nullable = false)
  private String external_id;


  @NotNull
  @Column(name = "created_on", nullable = false)
  private String created_on;

  @NotNull
  @Column(name = "updated_on", nullable = false)
  private String updated_on;

  @NotNull
  @Column(name = "type", nullable = false)
  private String type;

  @NotNull
  @Column(name = "status", nullable = false)
  private String status;

  @OneToOne
  @JoinColumn(name = "agent_id")
  @NotNull
  private AgentDAO agentDAO;

  @OneToOne
  @JoinColumn(name = "user_id")
  @NotNull
  private UserDAO userDAO;

  @OneToOne
  @JoinColumn(name = "retailer_id")
  @NotNull
  private RetailerDAO retailerDAO;

  @OneToOne
  @JoinColumn(name = "carrier_id")
  @NotNull
  private CarrierDAO carrierDAO;

}
