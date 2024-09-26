package com.kopo.hanashorts.market.model;

import lombok.Data;

@Data
public class StockPriceDTO {
  private String stockName;
  private String closingPrice;
  private String highPrice;
  private String lowPrice;
  private String changeValue;
  private String changePercent;
  private String volume;
  private String rateTime;
}