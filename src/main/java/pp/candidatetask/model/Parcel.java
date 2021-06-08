package pp.candidatetask.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Parcel {


    private long id;
    private String external_id;
    private Timestamp created_on;
    private Timestamp updated_on;
    private String type;
    private String status;
    private User user;
    private Agent agent;
    private Carrier carrier;
    private Retailer retailer;


}
