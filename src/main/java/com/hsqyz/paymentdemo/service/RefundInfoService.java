package com.hsqyz.paymentdemo.service;

import com.hsqyz.paymentdemo.entity.RefundInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 退款信息业务接口
 */
public interface RefundInfoService extends IService<RefundInfo> {

    RefundInfo createRefundByOrderNo(String orderNo, String reason, String paymentType);

    void updateRefund(String content);

    List<RefundInfo> getNoRefundOrderByDuration(int i, String payType);

    void updateRefundForAlipay(String refundNo, String body, String status);
}
