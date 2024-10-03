package com.kopo.hanashorts.trade.controller;

import com.kopo.hanashorts.trade.model.OrderHistoryDTO;
import com.kopo.hanashorts.trade.model.OrderRequestDTO;
import com.kopo.hanashorts.trade.model.StockTickersDTO;
import com.kopo.hanashorts.trade.model.TransactionHistoryDTO;
import com.kopo.hanashorts.trade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

  // 신용 매도 주문 처리 엔드포인트 추가
  @PostMapping("/place_sell_order_credit")
  public ResponseEntity<Map<String, Object>> placeSellOrderCredit(@RequestBody OrderRequestDTO orderRequestDTO) {
    Map<String, Object> response = new HashMap<>();
    try {
      tradeService.placeSellOrderCredit(orderRequestDTO);
      response.put("message", "주문이 성공적으로 처리되었습니다.");
      // 필요한 경우 추가 데이터(예: 주문 ID)를 여기에 포함시킬 수 있습니다.
      return ResponseEntity.ok(response);
    } catch (Exception e) {
      e.printStackTrace(); // 예외 로그 출력
      response.put("error", "주문 처리 중 오류가 발생했습니다.");
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
  }

  // 신용 거래 내역 조회 엔드포인트 추가
  @GetMapping("/transaction_history")
  public List<TransactionHistoryDTO> getTransactionHistory() {
    return tradeService.getTransactionHistory();
  }

  // 추가된 신용 주문 내역 조회 엔드포인트
  @GetMapping("/order_history_credit")
  public List<OrderHistoryDTO> getCreditOrderHistory() {
    return tradeService.getCreditOrderHistory();
  }
}


