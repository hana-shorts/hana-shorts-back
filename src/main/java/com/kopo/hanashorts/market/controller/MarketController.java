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

  @GetMapping("/currencyPrice")
  public List<CurrencyPriceDTO> getAllCurrencyPrice() {
    return marketService.getAllCurrencyPrice();
  }

  @GetMapping("/currencyPerformance")
  public List<CurrencyPerformanceDTO> getAllCurrencyPerformance() {
    return marketService.getAllCurrencyPerformance();
  }

  @GetMapping("/commodityPrice")
  public List<CommodityPriceDTO> getAllCommodityPrice() {
    return marketService.getAllCommodityPrice();
  }

  @GetMapping("/commodityPerformance")
  public List<CommodityPerformanceDTO> getAllCommodityPerformance() {
    return marketService.getAllCommodityPerformance();
  }

  @GetMapping("/indexPrice")
  public List<IndexPriceDTO> getAllIndexPrice() {
    return marketService.getAllIndexPrice();
  }

  @GetMapping("/indexPerformance")
  public List<IndexPerformanceDTO> getAllIndexPerformance() {
    return marketService.getAllIndexPerformance();
  }

  @GetMapping("/stockKospiPrice")
  public List<StockPriceDTO> getAllStockKospiPrice() {
    return marketService.getAllStockKospiPrice();
  }

  @GetMapping("/stockKospiPerformance")
  public List<StockPerformanceDTO> getAllStockKospiPerformance() {
    return marketService.getAllStockKospiPerformance();
  }

  @GetMapping("/stockKosdaqPrice")
  public List<StockPriceDTO> getAllStockKosdaqPrice() {
    return marketService.getAllStockKosdaqPrice();
  }

  @GetMapping("/stockKosdaqPerformance")
  public List<StockPerformanceDTO> getAllStockKosdaqPerformance() {
    return marketService.getAllStockKosdaqPerformance();
  }
}
