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

  public List<CurrencyPriceDTO> getAllCurrencyPrice() {
    return marketMapper.getAllCurrencyPrice();
  }

  public List<CurrencyPerformanceDTO> getAllCurrencyPerformance() {
    return marketMapper.getAllCurrencyPerformance();
  }

  public List<CommodityPriceDTO> getAllCommodityPrice() {
    return marketMapper.getAllCommodityPrice();
  }

  public List<CommodityPerformanceDTO> getAllCommodityPerformance() {
    return marketMapper.getAllCommodityPerformance();
  }

  public List<IndexPriceDTO> getAllIndexPrice() {
    return marketMapper.getAllIndexPrice();
  }

  public List<IndexPerformanceDTO> getAllIndexPerformance() {
    return marketMapper.getAllIndexPerformance();
  }

  public List<StockPriceDTO> getAllStockKospiPrice() {
    return marketMapper.getAllStockKospiPrice();
  }

  public List<StockPerformanceDTO> getAllStockKospiPerformance() {
    return marketMapper.getAllStockKospiPerformance();
  }

  public List<StockPriceDTO> getAllStockKosdaqPrice() {
    return marketMapper.getAllStockKosdaqPrice();
  }

  public List<StockPerformanceDTO> getAllStockKosdaqPerformance() {
    return marketMapper.getAllStockKosdaqPerformance();
  }

}