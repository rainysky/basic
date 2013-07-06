package com.rainy.mini.sample.model;

import java.util.Date;

import com.rainy.mini.base.model.BaseVO;

/**
 * 订单实体
 * 
 * @author yhb
 * @date 2012-1-13
 */
public class Order extends BaseVO {
	/**
	 * 支付订单号
	 */
	private String pkid;
	/**
	 * 商圈订单号
	 */
	private String mallOrderId;
	/**
	 * 商户ID
	 */
	private String merchantId;
	/**
	 * 商户名称
	 */
	private String merchantName;
	/**
	 * 终端ID
	 */
	private String terminalId;
	/**
	 * 总金额
	 */
	private Long amount;
	/**
	 * 商圈ID
	 */
	private String mallId;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 到期时间
	 */
	private Date bolishDate;
	/**
	 * 支付时间
	 */
	private Date payDate;
	/**
	 * 订单创建时间
	 */
	private Date createDate;
	/**
	 * 订单更新时间
	 */
	private Date updateDate;
	/**
	 * csn号
	 */
	private String csn;
	/**
	 * 状态 0未支付；1支付失败；2支付成功； 3交易关闭(未完成支付)；4撤销交易；5退货
	 */
	private Integer status;

	/**
	 * 交易类型，0、消费，1、查询余额，2、信用卡还款，3、转账
	 */
	private String transType;

	/**
	 * 设备序列号
	 */
	private String sn;

	/**
	 * 扣款
	 */
	private Long debit;

	/**
	 * 利润
	 */
	private Float profit;

	/** 应用编号 */
	private String appId;

	/** SP */
	private String sp;

	/** 交易所在省 */
	private String province;

	/** 交易所在市 */
	private String city;

	/** 手机号 */
	private String phone;

	/** 代发分润（单位分） */
	private Long debitDf;

	/** 付款账号 */
	private String fromAccount;

	/** 接收账号 */
	private String receiveAccount;

	/** 商户ID */
	private String merId;

	/** 交易IP */
	private String IP;

	/**
	 * 撤销交易、退货订单号,互联网支付退款,撤销交易的时候,需要该字段。 本身无实际意义,主要如果只用PKID标示的话,当退款的时候会报重复交易
	 * 所以需要另外一个退款ID，再进行退款时候的唯一标示。
	 */
	private String bsOrderId;

	/**
	 * 订单签名
	 */
	private String sign;

	public String getPkid() {
		return pkid;
	}

	public void setPkid(String pkid) {
		this.pkid = pkid;
	}

	public String getMallOrderId() {
		return mallOrderId;
	}

	public void setMallOrderId(String mallOrderId) {
		this.mallOrderId = mallOrderId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getBolishDate() {
		return bolishDate;
	}

	public void setBolishDate(Date bolishDate) {
		this.bolishDate = bolishDate;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getCsn() {
		return csn;
	}

	public void setCsn(String csn) {
		this.csn = csn;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Long getDebit() {
		return debit;
	}

	public void setDebit(Long debit) {
		this.debit = debit;
	}

	public Float getProfit() {
		return profit;
	}

	public void setProfit(Float profit) {
		this.profit = profit;
	}

	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId appId
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * @return the sp
	 */
	public String getSp() {
		return sp;
	}

	/**
	 * @param sp sp
	 */
	public void setSp(String sp) {
		this.sp = sp;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province province
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return debitDf
	 */
	public Long getDebitDf() {
		return debitDf;
	}

	/**
	 * @param debitDf debitDf
	 */
	public void setDebitDf(Long debitDf) {
		this.debitDf = debitDf;
	}

	/**
	 * @return fromAccount
	 */
	public String getFromAccount() {
		return fromAccount;
	}

	/**
	 * @param fromAccount fromAccount
	 */
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	/**
	 * @return receiveAccount
	 */
	public String getReceiveAccount() {
		return receiveAccount;
	}

	/**
	 * @param receiveAccount receiveAccount
	 */
	public void setReceiveAccount(String receiveAccount) {
		this.receiveAccount = receiveAccount;
	}

	/**
	 * @return merId
	 */
	public String getMerId() {
		return merId;
	}

	/**
	 * @param merId merId
	 */
	public void setMerId(String merId) {
		this.merId = merId;
	}

	/**
	 * @return iP
	 */
	public String getIP() {
		return IP;
	}

	/**
	 * @param ip iP
	 */
	public void setIP(String ip) {
		IP = ip;
	}

	public String getBsOrderId() {
		return bsOrderId;
	}

	public void setBsOrderId(String bsOrderId) {
		this.bsOrderId = bsOrderId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

}