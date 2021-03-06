package com.pinyougou.product.model.domain;

import java.math.BigDecimal;
import com.pinyougou.common.core.mybatis.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author theodo
 * @since 2019-01-12
 */
@Data
@Accessors(chain = true)
@TableName("tb_seckill_goods")
public class TbSeckillGoods extends BaseEntity<TbSeckillGoods> {

    private static final long serialVersionUID = 1L;

    /**
     * spu ID
     */
	@TableField("goods_id")
	private Long goodsId;
    /**
     * sku ID
     */
	@TableField("item_id")
	private Long itemId;
    /**
     * 标题
     */
	private String title;
    /**
     * 商品图片
     */
	@TableField("small_pic")
	private String smallPic;
    /**
     * 原价格
     */
	private BigDecimal price;
    /**
     * 秒杀价格
     */
	@TableField("cost_price")
	private BigDecimal costPrice;
    /**
     * 商家ID
     */
	@TableField("seller_id")
	private String sellerId;
    /**
     * 添加日期
     */
	@TableField("create_time")
	private LocalDateTime createTime;
    /**
     * 审核日期
     */
	@TableField("check_time")
	private LocalDateTime checkTime;
    /**
     * 审核状态
     */
	private String status;
    /**
     * 开始时间
     */
	@TableField("start_time")
	private LocalDateTime startTime;
    /**
     * 结束时间
     */
	@TableField("end_time")
	private LocalDateTime endTime;
    /**
     * 秒杀商品数
     */
	private Integer num;
    /**
     * 剩余库存数
     */
	@TableField("stock_count")
	private Integer stockCount;
    /**
     * 描述
     */
	private String introduction;


}
