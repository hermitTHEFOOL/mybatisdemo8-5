package com.qingqiao.crud.mapper;

import com.qingqiao.crud.entity.Goods;

import java.util.List;

/**
 * @author Fan Zihan
 * @date 2022/08/05 14:54
 **/
public interface GoodsMapper {

    List<Goods> queryAll();

    Integer insertGoods(Goods goods);

    int deleteGoods(Integer id);

    // 修改
    int updateGoods(Goods goods);

    // 按照id查询
    Goods queryGoodsById(Integer id);
}
