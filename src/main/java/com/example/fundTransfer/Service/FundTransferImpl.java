package com.example.fundTransfer.Service;

import com.example.fundTransfer.Models.FundTransfer;
import com.example.fundTransfer.Repository.fundTransferRepo;
import com.example.fundTransfer.Service.Interface.FundTransferService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class FundTransferImpl implements FundTransferService {

    private final fundTransferRepo FTRepo;

    public FundTransferImpl(fundTransferRepo ftRepo) {
      this.FTRepo = ftRepo;
    }

    @Override
    public String getFundTransferMS() {
        return "This is Fund Transfer MicroService";
    }

    @Override
    public Optional<FundTransfer> getTransactionID(Long transactionId) {
        return FTRepo.findById(transactionId);
    }

    @Override
    public FundTransfer transferFund(Long senderAccountId, Long receiverAccountId, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount should be greater than 0");
        }
        FundTransfer fundTransfer = new FundTransfer();
        fundTransfer.setSenderAccountId(senderAccountId);
        fundTransfer.setReceiverAccountId(receiverAccountId);
        fundTransfer.setAmount(amount);
        fundTransfer.setStatus("Success");


        return FTRepo.save(fundTransfer);
    }

    @Override
    public FundTransfer setTransferSchedule(Date scheduleDate) {
        FundTransfer fundTransfer = new FundTransfer();
        fundTransfer.setScheduled((java.sql.Date) scheduleDate);
        return FTRepo.save(fundTransfer);
    }

}
