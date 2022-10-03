package com.hsqyz.paymentdemo.service.impl;

import com.hsqyz.paymentdemo.entity.Product;
import com.hsqyz.paymentdemo.mapper.ProductMapper;
import com.hsqyz.paymentdemo.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
