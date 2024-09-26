package com.kopo.hanashorts.market.service;

import com.kopo.hanashorts.market.dao.MarketDao;
import com.kopo.hanashorts.market.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MarketService {

  private final MarketDao marketDao;

  @Autowired
  public MarketService(MarketDao marketDao) {
    this.marketDao = marketDao;
  }

  public List<CurrencyPriceDTO> getAllCurrencyPrice() {
    return marketDao.getAllCurrencyPrice();
  }

  public List<CurrencyPerformanceDTO> getAllCurrencyPerformance() {
    return marketDao.getAllCurrencyPerformance();
  }

  public List<CommodityPriceDTO> getAllCommodityPrice() {
    return marketDao.getAllCommodityPrice();
  }

  public List<CommodityPerformanceDTO> getAllCommodityPerformance() {
    return marketDao.getAllCommodityPerformance();
  }

  public List<IndexPriceDTO> getAllIndexPrice() {
    return marketDao.getAllIndexPrice();
  }

  public List<IndexPerformanceDTO> getAllIndexPerformance() {
    return marketDao.getAllIndexPerformance();
  }

  public List<StockPriceDTO> getAllStockKospiPrice() {
    return marketDao.getAllStockKospiPrice();
  }

  public List<StockPerformanceDTO> getAllStockKospiPerformance() {
    return marketDao.getAllStockKospiPerformance();
  }

  public List<StockPriceDTO> getAllStockKosdaqPrice() {
    return marketDao.getAllStockKosdaqPrice();
  }

  public List<StockPerformanceDTO> getAllStockKosdaqPerformance() {
    return marketDao.getAllStockKosdaqPerformance();
  }

}