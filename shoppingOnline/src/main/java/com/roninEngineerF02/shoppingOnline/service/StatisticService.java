package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.statistic.DateRangeRequestDto;

public interface StatisticService {

    Object getRevenueStatistics(DateRangeRequestDto request);

}
