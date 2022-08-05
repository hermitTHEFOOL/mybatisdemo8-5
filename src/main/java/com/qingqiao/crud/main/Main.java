package com.qingqiao.crud.main;

import com.qingqiao.crud.entity.Goods;
import com.qingqiao.crud.mapper.GoodsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Fan Zihan
 * @date 2022/08/05 14:52
 **/
public class Main {
    public static void main(String[] args) {

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = factory.openSession();
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            /*//查询
            queryAll(mapper);
            */
            /*//添加
            insertGoods(mapper,sqlSession);*/
           /* //删除
            deleteGoods(mapper,sqlSession);*/
            //update(mapper,sqlSession);
            queryGoodsById(mapper);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void queryGoodsById(GoodsMapper mapper) {
        Goods goods = mapper.queryGoodsById(16);
        System.out.println(goods);
    }

    private static void update(GoodsMapper mapper, SqlSession sqlSession) {
        Goods goods = new Goods(16, "梅特龙星人", "1999-5-6", "地球", 3);
        int i = mapper.updateGoods(goods);
        sqlSession.commit();
    }

    private static void deleteGoods(GoodsMapper mapper, SqlSession sqlSession) {
        int i = mapper.deleteGoods(18);
        sqlSession.commit();
    }

    private static void insertGoods(GoodsMapper mapper, SqlSession sqlSession) {
        Goods goods = new Goods(0, "www", "2020-8-3", "地球", 1);
        Integer i = mapper.insertGoods(goods);
        sqlSession.commit();
    }

    private static void queryAll(GoodsMapper mapper){
        List<Goods> goods = mapper.queryAll();
        for (Goods good : goods) {
            System.out.println(good);
        }
    }
}
