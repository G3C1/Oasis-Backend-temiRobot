package com.g3ci.temiRobot.domain.seat.repository;

import com.g3ci.temiRobot.domain.seat.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Long> {
}
