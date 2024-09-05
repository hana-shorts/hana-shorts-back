package com.kopo.hanashorts.trade.controller;

import com.kopo.hanashorts.trade.model.StockTickersDTO;
import com.kopo.hanashorts.trade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React 앱이 실행되는 도메인
public class TradeController {

  private final TradeService tradeService;

  @Autowired
  public TradeController(TradeService tradeService) {
      this.tradeService = tradeService;
  }

  @PostMapping("/getTickerCode")
  public StockTickersDTO getTickerCode(@RequestBody StockTickersDTO stockTickersDTO) {
    StockTickersDTO responseDto = tradeService.getTickerCodeByStockName(stockTickersDTO);
    System.out.println(responseDto.getTickerCode());
    return responseDto;
  }
}
