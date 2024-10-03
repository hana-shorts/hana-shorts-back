package com.kopo.hanashorts.trade.service;

import com.kopo.hanashorts.trade.dao.TradeDao;
import com.kopo.hanashorts.trade.model.OrderHistoryDTO;
import com.kopo.hanashorts.trade.model.OrderRequestDTO;
import com.kopo.hanashorts.trade.model.StockTickersDTO;
import com.kopo.hanashorts.trade.model.TransactionHistoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

  public void placeSellOrderCredit(OrderRequestDTO orderRequestDTO) {
    tradeDao.saveOrderAndTransaction(orderRequestDTO);
  }

  public List<TransactionHistoryDTO> getTransactionHistory() {
    return tradeDao.getTransactionHistory();
  }

  // 추가된 신용 주문 내역 조회 메서드
  public List<OrderHistoryDTO> getCreditOrderHistory() {
    return tradeDao.getCreditOrderHistory();
  }
}
