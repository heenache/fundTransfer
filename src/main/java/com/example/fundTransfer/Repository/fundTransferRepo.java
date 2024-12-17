package com.example.fundTransfer.Repository;

import com.example.fundTransfer.Models.FundTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fundTransferRepo extends JpaRepository< FundTransfer,Long > {
}
