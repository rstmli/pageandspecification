package com.nativevsspecification.specification;

import com.nativevsspecification.dao.entity.PhoneEntity;
import org.springframework.data.jpa.domain.Specification;

public class PhoneSpecification {
  public static Specification<PhoneEntity> hasBrand(String brand){
    return (r,cq,cb) -> brand == null ? cb.conjunction()
            : cb.equal(r.get("brand"),brand);

  }


  public static Specification<PhoneEntity> hasModel(String brand){
    return (r,c,q) -> brand == null ? q.conjunction()
            : q.equal(r.get("model"),brand);
  }
  public static Specification<PhoneEntity> hasColor(String brand){
    return (r,c,q) -> brand == null ? q.conjunction()
            : q.equal(r.get("color"),brand);
  }
  public static Specification<PhoneEntity> hasPrice(Double brand){
    return (r,c,q) -> brand == null ? q.conjunction()
            : q.equal(r.get("price"),brand);
  }

}

// select * from phone where brand = 'SAMSUNG'