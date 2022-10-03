package com.hsqyz.paymentdemo.enums.wxpay;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 微信回调通知API枚举
 */
@AllArgsConstructor
@Getter
public enum WxNotifyType {

	/**
	 * 支付通知
	 */
	NATIVE_NOTIFY("/api/wx-pay/native/notify"),

	/**
	 * 支付通知V2
	 */
	NATIVE_NOTIFY_V2("/api/wx-pay-v2/native/notify"),


	/**
	 * 退款结果通知
	 */
	REFUND_NOTIFY("/api/wx-pay/refunds/notify");

	/**
	 * 类型
	 */
	private final String type;
}
