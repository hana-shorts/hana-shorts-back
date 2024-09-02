package com.kopo.hanashorts.market.dao;

import com.kopo.hanashorts.market.mapper.MarketMapper;
import com.kopo.hanashorts.market.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MarketDao {

  private final MarketMapper marketMapper;

  @Autowired
  public MarketDao(MarketMapper marketMapper) {
    this.marketMapper = marketMapper;
  }

  public List<CurrencyDataDTO> getAllCurrencies() {
    return marketMapper.getAllCurrencies();
  }

  public List<CurrencyPeriodDataDTO> getAllCurrencyPeriods() {
    return marketMapper.getAllCurrencyPeriods();
  }

  public List<CommodityDataDTO> getAllCommodities() {
    return marketMapper.getAllCommodities();
  }

  public List<CommodityPeriodDataDTO> getAllCommodityPeriods() {
    return marketMapper.getAllCommodityPeriods();
  }

  public List<IndexDataDTO> getAllIndices() {
    return marketMapper.getAllIndices();
  }

  public List<IndexPeriodDataDTO> getAllIndexPeriods() {
    return marketMapper.getAllIndexPeriods();
  }
}
