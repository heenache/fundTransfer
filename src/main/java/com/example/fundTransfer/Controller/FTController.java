package com.example.fundTransfer.Controller;


import com.example.fundTransfer.Models.FundTransfer;
import com.example.fundTransfer.Service.FundTransferImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/FT")
public class FTController {
    private final FundTransferImpl fTService;


    public FTController(FundTransferImpl fTService) {
        this.fTService = fTService;
    }



    @GetMapping("/fundtransferMS")
    public String getFundTransferMS(){
        return fTService.getFundTransferMS();
    }
    @PostMapping("/fund")
    public ResponseEntity<FundTransfer> transferFund(@RequestParam Long senderAccountId,
                                                     @RequestParam Long receiverAccountId,
                                                     @RequestParam Double amount)
    {
        FundTransfer fundTransfer = fTService.transferFund(senderAccountId, receiverAccountId, amount);
        return ResponseEntity.ok(fundTransfer);
    }

    @GetMapping("/transactionID")
    public Optional<FundTransfer> getTransactionID(Long transactionId){
        return fTService.getTransactionID(transactionId);

    }



}

