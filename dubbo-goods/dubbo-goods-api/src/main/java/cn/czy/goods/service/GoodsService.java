package cn.czy.goods.service;

import cn.czy.goods.model.dto.GoodsDTO;
import cn.czy.goods.model.vo.GoodsGetVO;

public interface GoodsService {

    GoodsDTO getById(GoodsGetVO var);

    int add();
}
