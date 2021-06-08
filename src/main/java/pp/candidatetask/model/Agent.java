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
public class Agent {


    private long id;
    private String name;
    private String external_id;
    private String address;
    private Timestamp created_on;
    private Timestamp updated_on;



}
