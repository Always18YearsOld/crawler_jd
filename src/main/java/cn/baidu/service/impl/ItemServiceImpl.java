package cn.baidu.service.impl;

import cn.baidu.dao.ItemDao;
import cn.baidu.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/12/18
 */
@Service
public class ItemServiceImpl {
    @Autowired
    private ItemDao itemDao;

    /**
     * 保存商品
     */
    public void save(Item item){
        itemDao.save(item);
    }

    /**
     * 根据条件查询商品
     */
    public List<Item> findAll(Item item){
        Example<Item> example = Example.of(item);
        List<Item> list = itemDao.findAll(example);
        return list;
    }
}
