package cn.czy.order.controller;

import cn.czy.order.model.dto.UserOrderListDTO;
import cn.czy.order.model.vo.UserOrderListQueryVO;
import cn.czy.order.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: czy
 * @date: 2021/2/7
 **/
@RequestMapping("/api/order")
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/user/order/list/get")
    public List<UserOrderListDTO> userOrderList(@RequestBody UserOrderListQueryVO query){
        return orderService.getUserOrderList(new UserOrderListQueryVO());
    }
}
