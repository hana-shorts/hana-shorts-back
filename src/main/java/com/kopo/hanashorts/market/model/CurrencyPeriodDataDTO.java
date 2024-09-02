package com.kopo.hanashorts.market.model;

import lombok.Data;

@Data
public class CurrencyPeriodDataDTO {
  private String currencyName;
  private String periodDaily;
  private String periodWeekly;
  private String periodMonthly;
  private String periodYtd;
  private String periodYearly;
  private String period3years;
}