package com.hsqyz.paymentdemo.controller;

import com.hsqyz.paymentdemo.entity.Product;
import com.hsqyz.paymentdemo.service.ProductService;
import com.hsqyz.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 商品管理
 */
@Api(tags = "商品管理")
@RestController
@CrossOrigin
@RequestMapping("/api/product")
public class ProductController {

    @Resource
    private ProductService productService;

    /**
     * http://localhost:8090/api/product/test
     */
    @ApiOperation("测试接口")
    @GetMapping("/test")
    public R test() {
        // 返回的时间对不上 2022-08-20T14:40:04.949+00:00，需要设置时间，为了方便查看就格式化
        return R.ok().data("数据", "成功").data("时间", new Date());
    }

    /**
     * 获取商品列表
     */
    @ApiOperation("获取商品列表接口")
    @GetMapping("/list")
    public R getProductList() {
        List<Product> productList = productService.list();
        return R.ok().data("productList", productList);
    }
}
