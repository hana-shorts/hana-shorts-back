package com.kopo.hanashorts.trade.service;

import com.kopo.hanashorts.trade.dao.TradeDao;
import com.kopo.hanashorts.trade.model.StockTickersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TradeService {

  private final TradeDao tradeDao;

  @Autowired
  public TradeService(TradeDao tradeDao) {
    this.tradeDao = tradeDao;
  }


  public StockTickersDTO getTickerCodeByStockName(StockTickersDTO stockTickersDTO) {
    return tradeDao.getTickerCodeByStockName(stockTickersDTO);
  }
}