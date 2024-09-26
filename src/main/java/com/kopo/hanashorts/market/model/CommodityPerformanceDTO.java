package com.kopo.hanashorts.market.model;

import lombok.Data;

@Data
public class CommodityPerformanceDTO {
  private String commodityName;
  private String periodDaily;
  private String periodWeekly;
  private String periodMonthly;
  private String periodYtd;
  private String periodYearly;
  private String period3Years;
}