package pp.candidatetask.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pp.candidatetask.model.Parcel;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ParcelResponse {

    private List<Parcel> parcelList;

   }
