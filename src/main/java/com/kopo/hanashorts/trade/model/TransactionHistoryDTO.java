package com.kopo.hanashorts.trade.model;

import lombok.Data;
import java.util.Date;

@Data
public class TransactionHistoryDTO {
  private String transaction_id;
  private String account_number;
  private String stock_code;
  private Date transaction_date;
  private Date transaction_time;
  private String trade_type;
  private int quantity;
  private double price;
  private Date loan_date;
  private Date maturity_date;
}
