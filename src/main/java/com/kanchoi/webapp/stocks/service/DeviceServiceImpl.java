package com.kanchoi.webapp.stocks.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kanchoi.webapp.stocks.dao.DeviceCostDao;
import com.kanchoi.webapp.stocks.dao.DevicePortfolioDao;
import com.kanchoi.webapp.stocks.dao.DevicePortfolioDetailDao;
import com.kanchoi.webapp.stocks.dao.DeviceProfitLossDao;
import com.kanchoi.webapp.stocks.dao.DeviceStockExchangeDao;
import com.kanchoi.webapp.stocks.dao.DeviceUserDao;
import com.kanchoi.webapp.stocks.dao.DeviceUserPortfolioDao;
import com.kanchoi.webapp.stocks.model.DeviceCost;
import com.kanchoi.webapp.stocks.model.DevicePortfolio;
import com.kanchoi.webapp.stocks.model.DevicePortfolioDetail;
import com.kanchoi.webapp.stocks.model.DeviceProfitLoss;
import com.kanchoi.webapp.stocks.model.DeviceSettings;
import com.kanchoi.webapp.stocks.model.DeviceStockExchange;
import com.kanchoi.webapp.stocks.model.DeviceUser;
import com.kanchoi.webapp.stocks.model.DeviceUserPortfolio;
import com.kanchoi.webapp.stocks.model.UserPortfolios;

@Service("deviceService")
@Transactional(value = "transactionManager", rollbackFor = Throwable.class)
public class DeviceServiceImpl implements DeviceService {
	private static Log log = LogFactory.getLog(DeviceServiceImpl.class);

	@Autowired
	@Qualifier("deviceUserDao")
	private DeviceUserDao deviceUserDao;
	
	@Autowired
	@Qualifier("deviceStockExchangeDao")
	private DeviceStockExchangeDao deviceStockExchangeDao;
	
	@Autowired
	@Qualifier("deviceCostDao")
	private DeviceCostDao deviceCostDao;
	
	@Autowired
	@Qualifier("deviceUserPortfolioDao")
	private DeviceUserPortfolioDao deviceUserPortfolioDao;
	
	@Autowired
	@Qualifier("devicePortfolioDao")
	private DevicePortfolioDao devicePortfolioDao;
	
	@Autowired
	@Qualifier("devicePortfolioDetailDao")
	private DevicePortfolioDetailDao devicePortfolioDetailDao;
	
	@Autowired
	@Qualifier("deviceProfitLossDao")
	private DeviceProfitLossDao deviceProfitLossDao;
	
	

	public DeviceSettings getDeviceSettings(String deviceId) {
		
		List<DeviceUser> duList = deviceUserDao.findByDeviceId(deviceId);
		List<DeviceStockExchange> dseList = deviceStockExchangeDao.findByDeviceId(deviceId);
		List<DeviceCost> dcList = deviceCostDao.findByDeviceId(deviceId);
		
		DeviceSettings ds = new DeviceSettings();
		ds.setDeviceUser(duList != null ? duList.get(0) : null);
		ds.setDeviceStockExchange(dseList != null ? dseList.get(0) : null);
		ds.setDeviceCost(dcList != null ? dcList.get(0) : null);
		
		return ds;
		
	}
	
	public DeviceCost saveDeviceCost(DeviceCost deviceCost) {
		DeviceCost dc = deviceCostDao.findOne(deviceCost.getId());
		if (dc == null) {
			deviceCost.setId(null);
			return deviceCostDao.save(deviceCost);
		} else {
			dc.setCommission(deviceCost.getCommission());
			dc.setDeviceId(deviceCost.getDeviceId());
			dc.setMinChar(deviceCost.getMinChar());
			dc.setTax(deviceCost.getTax());
			dc.setTranCost(deviceCost.getTranCost());
			return deviceCostDao.save(dc);
		}
	}
	
	public DeviceStockExchange saveDeviceStockExchange(DeviceStockExchange deviceStockExchange) {
		DeviceStockExchange dse = deviceStockExchangeDao.findOne(deviceStockExchange.getId());
		if (dse == null) {
			deviceStockExchange.setId(null);
			return deviceStockExchangeDao.save(deviceStockExchange);
		} else {
			dse.setArea(deviceStockExchange.getArea());
			dse.setCode(deviceStockExchange.getCode());
			dse.setDeviceId(deviceStockExchange.getDeviceId());
			dse.setMarket(deviceStockExchange.getMarket());
			return deviceStockExchangeDao.save(dse);
		}
	}
	
	public DeviceUser saveDeviceUser(DeviceUser deviceUser) {
		DeviceUser du = deviceUserDao.findOne(deviceUser.getId());
		if (du == null) {
			deviceUser.setId(null);
			return deviceUserDao.save(deviceUser);
		} else {
			du.setAddTradingFee(deviceUser.getAddTradingFee());
			du.setCreateTime(deviceUser.getCreateTime());
			du.setDeviceId(deviceUser.getDeviceId());
			du.setEmail(deviceUser.getEmail());
			du.setGreenAsRise(deviceUser.getGreenAsRise());
			du.setName(deviceUser.getName());
			du.setPhoto(deviceUser.getPhoto());
			du.setShare(deviceUser.getShare());
			du.setType(deviceUser.getType());
			return deviceUserDao.save(du);
		}
	}
	
	public UserPortfolios getUserPortfolios(String deviceId, Long userId) {
		UserPortfolios up = new UserPortfolios();
		up.setDeviceId(deviceId);
		up.setUserId(userId);
		
		List<DeviceUserPortfolio> dupList = deviceUserPortfolioDao.findByDeviceIdAndUserId(deviceId, userId);
		if (dupList != null && dupList.size() > 0) {
			for (DeviceUserPortfolio dup : dupList) {
				DevicePortfolio dp = devicePortfolioDao.findOne(dup.getPortfolioId());
				up.getPortfolioList().add(dp);		
			}
		}
		
		return up;
	}

	public DeviceUserPortfolio saveDeviceUserPortfolio(DeviceUserPortfolio deviceUserPortfolio) {
		DeviceUserPortfolio dup = deviceUserPortfolioDao.findOne(deviceUserPortfolio.getId());
		if (dup == null) {
			deviceUserPortfolio.setId(null);
			return deviceUserPortfolioDao.save(deviceUserPortfolio);
		} else {
			dup.setCreateTime(deviceUserPortfolio.getCreateTime());
			dup.setDeviceId(deviceUserPortfolio.getDeviceId());
			dup.setPortfolioId(deviceUserPortfolio.getPortfolioId());
			dup.setUserId(deviceUserPortfolio.getUserId());
			return deviceUserPortfolioDao.save(dup);
		}
	}

	public DevicePortfolio saveDevicePortfolio(DevicePortfolio devicePortfolio) {
		DevicePortfolio dp = devicePortfolioDao.findOne(devicePortfolio.getId());
		if (dp == null) {
			devicePortfolio.setId(null);
			return devicePortfolioDao.save(devicePortfolio);
		} else {
			dp.setCreateTime(devicePortfolio.getCreateTime());
			dp.setDeviceId(devicePortfolio.getDeviceId());
			dp.setName(devicePortfolio.getName());
			dp.setShare(devicePortfolio.getShare());
			return devicePortfolioDao.save(dp);
		}
	}

	public DevicePortfolioDetail saveDevicePortfolioDetail(DevicePortfolioDetail devicePortfolioDetail) {
		DevicePortfolioDetail dpd = devicePortfolioDetailDao.findOne(devicePortfolioDetail.getId());
		if (dpd == null) {
			devicePortfolioDetail.setId(null);
			return devicePortfolioDetailDao.save(devicePortfolioDetail);
		} else {
			dpd.setAction(devicePortfolioDetail.getAction());
			dpd.setActionPrice(devicePortfolioDetail.getActionPrice());
			dpd.setActionQty(devicePortfolioDetail.getActionQty());
			dpd.setActionTime(devicePortfolioDetail.getActionTime());
			dpd.setDeviceId(devicePortfolioDetail.getDeviceId());
			dpd.setMarketCode(devicePortfolioDetail.getMarketCode());
			dpd.setPortfolioId(devicePortfolioDetail.getPortfolioId());
			dpd.setSequence(devicePortfolioDetail.getSequence());
			dpd.setStockName(devicePortfolioDetail.getStockName());
			dpd.setStockSym(devicePortfolioDetail.getStockSym());
			dpd.setTradingFee(devicePortfolioDetail.getTradingFee());
			return devicePortfolioDetailDao.save(dpd);
		}
	}

	public DeviceProfitLoss saveDeviceProfitLoss(DeviceProfitLoss deviceProfitLoss) {
		DeviceProfitLoss dpl = deviceProfitLossDao.findOne(deviceProfitLoss.getId());
		if (dpl == null) {
			deviceProfitLoss.setId(null);
			return deviceProfitLossDao.save(deviceProfitLoss);
		} else {
			dpl.setAmount(deviceProfitLoss.getAmount());
			dpl.setDeviceId(deviceProfitLoss.getDeviceId());
			dpl.setPortfolioId(deviceProfitLoss.getPortfolioId());
			dpl.setStatus(deviceProfitLoss.getStatus());
			dpl.setUpdateTime(deviceProfitLoss.getUpdateTime());
			dpl.setUserId(deviceProfitLoss.getUserId());
			return deviceProfitLossDao.save(dpl);
		}
	}
}
