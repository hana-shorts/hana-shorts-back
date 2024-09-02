package com.kopo.hanashorts.market.controller;

import com.kopo.hanashorts.market.model.*;
import com.kopo.hanashorts.market.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React 앱이 실행되는 도메인
public class MarketController {

  private final MarketService marketService;

  @Autowired
  public MarketController(MarketService marketService) {
    this.marketService = marketService;
  }

  @GetMapping("/currencies")
  public List<CurrencyDataDTO> getAllCurrencies() {
    return marketService.getAllCurrencies();
  }

  @GetMapping("/currencyPeriods")
  public List<CurrencyPeriodDataDTO> getAllCurrencyPeriods() {
    return marketService.getAllCurrencyPeriods();
  }

  @GetMapping("/commodities")
  public List<CommodityDataDTO> getAllCommodities() {
    return marketService.getAllCommodities();
  }

  @GetMapping("/commodityPeriods")
  public List<CommodityPeriodDataDTO> getAllCommodityPeriods() {
    return marketService.getAllCommodityPeriods();
  }

  @GetMapping("/indices")
  public List<IndexDataDTO> getAllIndices() {
    return marketService.getAllIndices();
  }

  @GetMapping("/indexPeriods")
  public List<IndexPeriodDataDTO> getAllIndexPeriods() {
    return marketService.getAllIndexPeriods();
  }
}
