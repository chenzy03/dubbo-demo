package cn.czy.order.service;

import cn.czy.order.model.dto.UserOrderListDTO;
import cn.czy.order.model.vo.UserOrderListQueryVO;

import java.util.List;

/**
 * @author: czy
 * @date: 2021/2/7
 **/

public interface OrderService {

    List<UserOrderListDTO> getUserOrderList(UserOrderListQueryVO query);
}
