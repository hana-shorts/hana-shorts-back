package com.kopo.hanastockfit.market.model;

import lombok.Data;

@Data
public class IndexDataDTO {
  private String indexName;
  private String closingPrice;
  private String highPrice;
  private String lowPrice;
  private String changeValue;
  private String changePercent;
  private String rateTime;
}