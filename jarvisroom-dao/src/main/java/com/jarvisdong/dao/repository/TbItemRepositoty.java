package com.jarvisdong.dao.repository;

import com.jarvisdong.dao.entity.TbItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 获取tb_item 表中的数据
 */
public interface TbItemRepositoty extends JpaRepository<TbItemEntity, Long> {

}
