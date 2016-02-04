package com.kanchoi.webapp.stocks.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanchoi.webapp.stocks.model.DevicePortfolioDetail;

public interface DevicePortfolioDetailDao extends JpaRepository<DevicePortfolioDetail, Long> {
	List<DevicePortfolioDetail> findByDeviceIdAndPortfolioId(String deviceId, Long portfolioId);
}
