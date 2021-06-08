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
public class Carrier {


    private long id;
    private String name;
    private Timestamp created_on;
    private Timestamp updated_on;


}
