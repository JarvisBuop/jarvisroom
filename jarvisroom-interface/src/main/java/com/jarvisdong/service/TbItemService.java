package com.jarvisdong.service;

import com.jarvisdong.pojo.TbItem;
import com.jarvisdong.pojo.custom.SerialPageTo;

public interface TbItemService {
    SerialPageTo<TbItem> findAllTbItemByPage(int currentPage);
}
