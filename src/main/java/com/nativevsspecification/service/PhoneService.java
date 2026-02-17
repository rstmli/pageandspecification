package com.nativevsspecification.service;

import com.nativevsspecification.dao.entity.PhoneEntity;
import com.nativevsspecification.dao.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import static com.nativevsspecification.specification.PhoneSpecification.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {
  private final PhoneRepository phoneRepository;

  public Page<PhoneEntity> getByPhone(String brand,
                                      String model,
                                      Double price,
                                      int pageN,
                                      int pageS){

    Pageable p1 = PageRequest.of(pageN,pageS);
    Specification<PhoneEntity> spec = Specification.allOf(
            hasBrand(brand),
            hasModel(model),
            hasPrice(price));




    return phoneRepository.findAll(spec,p1);
  }


}
