package com.kopo.hanashorts.trade.model;

import lombok.Data;
import java.util.Date;

@Data
public class OrderHistoryDTO {
  private String order_id;
  private String account_number;
  private String stock_code;
  private String stock_name; // 추가된 필드
  private Date order_date;
  private Date order_time;
  private String trade_type;
  private int quantity;
  private double price;
  private Date loan_date;
  private Date maturity_date;
}
