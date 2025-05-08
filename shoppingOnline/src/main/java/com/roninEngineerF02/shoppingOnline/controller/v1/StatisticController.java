package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.statistic.DateRangeRequestDto;
import com.roninEngineerF02.shoppingOnline.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
public class StatisticController {

    @Autowired
    private StatisticService statisticService;

    @GetMapping(UrlConstant.GET_STATS_REVENUE)
    public Object getRevenueStats(@RequestBody(required = false) DateRangeRequestDto request) {
        checkAdminAccess();
        return statisticService.getRevenueStatistics(request);
    }

    // Helper method to check admin access (placeholder)
    private void checkAdminAccess() {
        // Placeholder implementation
        // Will be replaced with proper admin role check when Spring Security is added
        // Could throw AccessDeniedException if not admin
    }

}
