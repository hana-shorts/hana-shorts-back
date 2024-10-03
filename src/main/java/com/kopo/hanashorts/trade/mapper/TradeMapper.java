package com.kopo.hanashorts.trade.mapper;


import com.kopo.hanashorts.trade.model.OrderHistoryDTO;
import com.kopo.hanashorts.trade.model.OrderRequestDTO;
import com.kopo.hanashorts.trade.model.StockTickersDTO;
import com.kopo.hanashorts.trade.model.TransactionHistoryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TradeMapper {
  StockTickersDTO getTickerCodeByStockName(StockTickersDTO stockTickersDTO);

  void insertOrderHistory(OrderRequestDTO orderRequestDTO);
  void insertTransactionHistory(OrderRequestDTO orderRequestDTO);

  List<TransactionHistoryDTO> getTransactionHistory();

  // 추가된 신용 주문 내역 조회 메서드
  List<OrderHistoryDTO> getCreditOrderHistory();
}
