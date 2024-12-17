package com.example.fundTransfer.Service.Interface;

import com.example.fundTransfer.Models.FundTransfer;

import java.util.Date;
import java.util.Optional;

public interface FundTransferService {
    public String getFundTransferMS();
    public Optional<FundTransfer> getTransactionID(Long transactionId);
    public FundTransfer transferFund(Long senderAccountId, Long receiverAccountId, double amount);
    public FundTransfer setTransferSchedule(Date scheduleDate);


}
