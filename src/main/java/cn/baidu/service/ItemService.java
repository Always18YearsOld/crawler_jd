package cn.baidu.service;

import cn.baidu.pojo.Item;

import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/12/18
 */
public interface ItemService {

    /**
     * 保存商品
     */
    public void save(Item item);

    /**
     * 根据条件查询商品
     */
    public List<Item> findAll(Item item);
}
