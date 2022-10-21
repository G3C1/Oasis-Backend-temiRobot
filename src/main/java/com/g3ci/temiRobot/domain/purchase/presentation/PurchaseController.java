package com.g3ci.temiRobot.domain.purchase.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("purchase")
public class PurchaseController {
    @GetMapping("/")
    public ResponseEntity<Void> getPurchaseList(){

        return ResponseEntity.ok().build();
    }
}
