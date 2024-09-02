package com.kopo.hanastockfit.market.model;

import lombok.Data;

@Data
public class CommodityDataDTO {
  private String commodityName;
  private String contractMonth;
  private String closingPrice;
  private String highPrice;
  private String lowPrice;
  private String changeValue;
  private String changePercent;
  private String rateTime;
}