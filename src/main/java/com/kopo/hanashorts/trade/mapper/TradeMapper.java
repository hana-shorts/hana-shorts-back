package com.kopo.hanashorts.trade.mapper;


import com.kopo.hanashorts.trade.model.StockTickersDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TradeMapper {
  StockTickersDTO getTickerCodeByStockName(StockTickersDTO stockTickersDTO);
}