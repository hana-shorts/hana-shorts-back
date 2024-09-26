package com.kopo.hanashorts.market.mapper;

import com.kopo.hanashorts.market.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MarketMapper {
  List<CurrencyPriceDTO> getAllCurrencyPrice();
  List<CurrencyPerformanceDTO> getAllCurrencyPerformance();
  List<CommodityPriceDTO> getAllCommodityPrice();
  List<CommodityPerformanceDTO> getAllCommodityPerformance();
  List<IndexPriceDTO> getAllIndexPrice();
  List<IndexPerformanceDTO> getAllIndexPerformance();
  List<StockPriceDTO> getAllStockKospiPrice();
  List<StockPerformanceDTO> getAllStockKospiPerformance();
  List<StockPriceDTO> getAllStockKosdaqPrice();
  List<StockPerformanceDTO> getAllStockKosdaqPerformance();
}
