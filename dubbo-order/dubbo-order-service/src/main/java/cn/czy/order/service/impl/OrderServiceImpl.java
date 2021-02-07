package cn.czy.order.service.impl;

import cn.czy.goods.model.dto.GoodsDTO;
import cn.czy.goods.model.vo.GoodsGetVO;
import cn.czy.goods.service.GoodsService;
import cn.czy.order.model.dto.UserOrderListDTO;
import cn.czy.order.model.vo.UserOrderListQueryVO;
import cn.czy.order.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: czy
 * @date: 2021/2/7
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @DubboReference
    private GoodsService goodsService;

    @Override
    public List<UserOrderListDTO> getUserOrderList(UserOrderListQueryVO query) {
        GoodsDTO goods = goodsService.getById(new GoodsGetVO());
        return new ArrayList<>();
    }
}
