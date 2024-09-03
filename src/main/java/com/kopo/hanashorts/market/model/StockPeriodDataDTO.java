package com.kopo.hanashorts.market.model;

import lombok.Data;

@Data
public class StockPeriodDataDTO {
  private String stockName;
  private String periodDaily;
  private String periodWeekly;
  private String periodMonthly;
  private String periodYtd;
  private String periodYearly;
  private String period3Years;
}