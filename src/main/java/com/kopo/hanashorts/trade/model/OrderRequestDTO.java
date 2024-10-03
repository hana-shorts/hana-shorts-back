package com.kopo.hanashorts.trade.model;

import lombok.Data;

@Data
public class OrderRequestDTO {
  private String order_type;
  private String stock_code;
  private int quantity;
  private double price;
  private String trade_type;
}
