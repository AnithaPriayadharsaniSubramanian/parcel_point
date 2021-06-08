package pp.candidatetask.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pp.candidatetask.model.*;
import pp.candidatetask.repository.*;
import pp.candidatetask.repository.dao.ParcelDAO;
import pp.candidatetask.repository.dao.RetailerDAO;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ParcelService {

  private RetailerRepository retailerRepository ;
  private ParcelRepository parcelRepository ;

  @Autowired
  public ParcelService(
      final RetailerRepository retailerRepository,final ParcelRepository parcelRepository) {
    this.retailerRepository = retailerRepository;
    this.parcelRepository = parcelRepository;
  }


  public List<Retailer> getRetailerList() {
    log.info("List all retailers");
     List<Retailer> retailers = new ArrayList<>();
     List<RetailerDAO> retailersDAO = new ArrayList<>();
    retailersDAO= (List<RetailerDAO>) retailerRepository.findAll();
    retailers= retailersDAO.stream().map(a -> {
      Retailer retailer = new Retailer();
      BeanUtils.copyProperties(a,retailer);
     // retailers.add(retailer);
      return retailer;
    }).collect(Collectors.toList());
    return retailers;


  }

  public List<Parcel> getParcelList(int numberOfParcels) {

    log.info("List all parcels");
    List<Parcel> parcelList = new ArrayList<>();

    List<ParcelDAO> parcelListDAO = new ArrayList<>();
    try {
      parcelListDAO = (List<ParcelDAO>) parcelRepository.findAll(Sort.by(Sort.Direction.DESC));
    }catch (Exception e){
      log.error("Error in retrieving parcel list");
    }
    parcelList= parcelListDAO.stream().map(a -> {
      Parcel parcel = new Parcel();
      BeanUtils.copyProperties(a,parcel);
      return parcel;
    }).limit(numberOfParcels).collect(Collectors.toList());

    return parcelList;
  }

  public Parcel createParcel(final Parcel parcel) {
    log.info("create  parcels");
    ParcelDAO parcelDAO = new ParcelDAO();
    Parcel savedParcel = new Parcel();
    BeanUtils.copyProperties(parcel,parcelDAO);
    ParcelDAO savedparcelDAO =parcelRepository.save(parcelDAO);
    log.info("Created a parcel with id '{}'", savedparcelDAO.getId());

    BeanUtils.copyProperties(savedparcelDAO,savedParcel);
    return savedParcel;
  }


}
