package pp.candidatetask.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import pp.candidatetask.model.Retailer;

import java.util.List;

@Data
@Builder
@AllArgsConstructor

public class RetailResponse {

    private List<Retailer> retailerList;

   }
