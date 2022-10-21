package com.g3ci.temiRobot.domain.purchase.repository;

import com.g3ci.temiRobot.domain.purchase.entity.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase,Long> {
}
