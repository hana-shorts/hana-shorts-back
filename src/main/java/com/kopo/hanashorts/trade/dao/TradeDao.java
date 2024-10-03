package com.kopo.hanashorts.trade.dao;

import com.kopo.hanashorts.trade.mapper.TradeMapper;
import com.kopo.hanashorts.trade.model.OrderHistoryDTO;
import com.kopo.hanashorts.trade.model.OrderRequestDTO;
import com.kopo.hanashorts.trade.model.StockTickersDTO;
import com.kopo.hanashorts.trade.model.TransactionHistoryDTO;
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

  public void saveOrderAndTransaction(OrderRequestDTO orderRequestDTO) {
    tradeMapper.insertOrderHistory(orderRequestDTO);
    tradeMapper.insertTransactionHistory(orderRequestDTO);
  }

  public List<TransactionHistoryDTO> getTransactionHistory() {
    return tradeMapper.getTransactionHistory();
  }

  // 추가된 신용 주문 내역 조회 메서드
  public List<OrderHistoryDTO> getCreditOrderHistory() {
    return tradeMapper.getCreditOrderHistory();
  }
}

