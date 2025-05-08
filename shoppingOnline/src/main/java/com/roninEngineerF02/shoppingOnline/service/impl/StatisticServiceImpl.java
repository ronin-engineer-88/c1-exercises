package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.statistic.DateRangeRequestDto;
import com.roninEngineerF02.shoppingOnline.service.StatisticService;
import org.springframework.stereotype.Service;

@Service
public class StatisticServiceImpl implements StatisticService {
    @Override
    public Object getRevenueStatistics(DateRangeRequestDto request) {

        // Logic here

        return new DateRangeRequestDto();
    }

}
