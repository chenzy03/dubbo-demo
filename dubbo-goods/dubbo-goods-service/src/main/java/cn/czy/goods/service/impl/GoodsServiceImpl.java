package cn.czy.goods.service.impl;

import cn.czy.goods.model.dto.GoodsDTO;
import cn.czy.goods.model.vo.GoodsGetVO;
import cn.czy.goods.service.GoodsService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author: czy
 * @date: 2021/2/5
 **/
@DubboService
public class GoodsServiceImpl implements GoodsService {

    @Override
    public GoodsDTO getById(GoodsGetVO var) {
        return new GoodsDTO();
    }

    @Override
    public int add() {
        return 0;
    }
}
