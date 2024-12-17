package com.example.fundTransfer.Models;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;



@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FT")
public class FundTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transfer_id;
    private Long transactionId;
    private Long senderAccountId;
    private Long receiverAccountId;
    private String transaction_type;
    private Double amount;
    private String status;
    private Date scheduled;
    private Date initiatedAt;
    private Date completedAt;


}
