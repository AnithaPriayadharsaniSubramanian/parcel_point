package pp.candidatetask.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pp.candidatetask.model.Parcel;
import pp.candidatetask.model.response.ParcelResponse;
import pp.candidatetask.model.response.RetailResponse;
import pp.candidatetask.model.Retailer;
import pp.candidatetask.service.ParcelService;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ParcelController {


  private ParcelService parcelService;

  @Autowired
  public ParcelController(ParcelService parcelService) {
    this.parcelService = parcelService;
  }

  @GetMapping(value = "/retailer/list")
  public RetailResponse getRetailerList() {
    final List<Retailer> retailerList = parcelService.getRetailerList();
    RetailResponse retailResponse =  RetailResponse.builder().retailerList(retailerList).build();
    return retailResponse;
  }

  @GetMapping(value = "/parcel/list")
  public ParcelResponse getParcelList(@NotBlank @NotNull @RequestParam(name = "limit") int numberOfParcels) {
    final List<Parcel> parcelList = parcelService.getParcelList(numberOfParcels);
    ParcelResponse parcelResponse =  ParcelResponse.builder().parcelList(parcelList).build();
    return parcelResponse;
  }

  @PostMapping(value = "/parcel")
  public String createParcel(@RequestBody final Parcel parcel) {
    final Parcel createdParcel = parcelService.createParcel(parcel);

    return "Parcel Created"+createdParcel.getExternal_id();

  }

}





