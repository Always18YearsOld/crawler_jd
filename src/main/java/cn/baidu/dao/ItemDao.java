package cn.baidu.dao;

import cn.baidu.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：ltb
 * @date ：2020/12/18
 */
public interface ItemDao extends JpaRepository<Item,Long> {
}
