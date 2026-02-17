package com.nativevsspecification.rest;

import com.nativevsspecification.dao.entity.PhoneEntity;
import com.nativevsspecification.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/phone")
public class PhoneController {

  private final PhoneService phoneService;
  @GetMapping("/get")
  public Page<PhoneEntity> getPhone(@RequestParam(required = false) String brand,
                                    @RequestParam(required = false) String model,
                                    @RequestParam(required = false) Double price,
                                    @RequestParam(required = false,defaultValue = "0") int pageN,
                                    @RequestParam(required = false,defaultValue = "2") int pageS
                                    ){

    return phoneService.getByPhone(brand, model, price,pageN,pageS);


  }

}
