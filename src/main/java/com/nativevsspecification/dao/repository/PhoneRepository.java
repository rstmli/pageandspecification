package com.nativevsspecification.dao.repository;

import com.nativevsspecification.dao.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity,Long>, JpaSpecificationExecutor<PhoneEntity> {

  @Query(value = "select * from phone_jet_store where brand = :brand and model = :model and price > :price ",nativeQuery = true)
  List<PhoneEntity> findAsdsadsada(String brand,String model,Double price);


}
