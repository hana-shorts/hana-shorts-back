package com.kopo.hanastockfit.market.service;

import com.kopo.hanastockfit.market.dao.MarketDao;
import com.kopo.hanastockfit.market.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {

  private final MarketDao marketDao;

  @Autowired
  public MarketService(MarketDao marketDao) {
    this.marketDao = marketDao;
  }

  public List<CurrencyDataDTO> getAllCurrencies() {
    return marketDao.getAllCurrencies();
  }

  public List<CurrencyPeriodDataDTO> getAllCurrencyPeriods() {
    return marketDao.getAllCurrencyPeriods();
  }

  public List<CommodityDataDTO> getAllCommodities() {
    return marketDao.getAllCommodities();
  }

  public List<CommodityPeriodDataDTO> getAllCommodityPeriods() {
    return marketDao.getAllCommodityPeriods();
  }

  public List<IndexDataDTO> getAllIndices() {
    return marketDao.getAllIndices();
  }

  public List<IndexPeriodDataDTO> getAllIndexPeriods() {
    return marketDao.getAllIndexPeriods();
  }
}
