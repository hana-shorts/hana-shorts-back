package com.kopo.hanashorts.trade.dao;

import com.kopo.hanashorts.trade.mapper.TradeMapper;
import com.kopo.hanashorts.trade.model.StockTickersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TradeDao {

  private final TradeMapper tradeMapper;

  @Autowired
  public TradeDao(TradeMapper tradeMapper) {
    this.tradeMapper = tradeMapper;
  }

  public StockTickersDTO getTickerCodeByStockName(StockTickersDTO stockTickersDTO) {
    System.out.println(stockTickersDTO.getStockName());
    return tradeMapper.getTickerCodeByStockName(stockTickersDTO);
  }
}
