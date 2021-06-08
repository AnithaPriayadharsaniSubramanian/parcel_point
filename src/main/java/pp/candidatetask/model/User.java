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
public class User {

    private long id;
    private String email;
    private String first_name;
    private String last_name;
    private String address;
    private Timestamp created_on;
    private Timestamp updated_on;


}
