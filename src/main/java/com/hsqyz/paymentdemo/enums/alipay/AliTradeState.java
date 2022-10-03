package com.hsqyz.paymentdemo.enums.alipay;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 支付宝订单状态枚举
 */
@Getter
@AllArgsConstructor
public enum  AliTradeState {

    /**
     * 支付成功
     */
    SUCCESS("TRADE_SUCCESS"),

    /**
     * 未支付
     */
    NOTPAY("WAIT_BUYER_PAY"),

    /**
     * 已关闭
     */
    CLOSED("TRADE_CLOSED"),

    /**
     * 退款成功
     */
    REFUND_SUCCESS("REFUND_SUCCESS"),

    /**
     * 退款失败
     */
    REFUND_ERROR("REFUND_ERROR");

    /**
     * 交易状态
     */
    private final String status;

}
