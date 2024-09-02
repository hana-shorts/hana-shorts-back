package com.kopo.hanashorts.market.model;

import lombok.Data;

@Data
public class CurrencyDataDTO {
  private String currencyName; // VARCHAR2 -> String
  private String buyPrice;
  private String sellPrice;
  private String highPrice;
  private String lowPrice;
  private String changeValue;
  private String changePercent;
  private String rateTime;
}