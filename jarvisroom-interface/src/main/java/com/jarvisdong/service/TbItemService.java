package com.jarvisdong.service;

import com.jarvisdong.pojo.TbItem;
import org.springframework.data.domain.Page;

public interface TbItemService {
    Page<TbItem> findAllTbItemByPage(int currentPage);
}
