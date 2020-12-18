package cn.baidu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ：ltb
 * @date ：2020/12/18
 */
@Entity
@Table(name="jd_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long spu;
    private Long sku;
    private String title;
    private Double price;
    private String url;
    private Date created;
    private Date updated;

}
