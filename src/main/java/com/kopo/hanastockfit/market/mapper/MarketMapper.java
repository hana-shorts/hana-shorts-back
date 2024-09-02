package com.kopo.hanastockfit.market.mapper;

import com.kopo.hanastockfit.market.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MarketMapper {
  List<CurrencyDataDTO> getAllCurrencies();
  List<CurrencyPeriodDataDTO> getAllCurrencyPeriods();
  List<CommodityDataDTO> getAllCommodities();
  List<CommodityPeriodDataDTO> getAllCommodityPeriods();
  List<IndexDataDTO> getAllIndices();
  List<IndexPeriodDataDTO> getAllIndexPeriods();
}
