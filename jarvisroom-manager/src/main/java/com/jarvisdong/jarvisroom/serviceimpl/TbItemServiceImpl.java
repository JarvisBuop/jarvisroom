package com.jarvisdong.jarvisroom.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jarvisdong.dao.entity.TbItemEntity;
import com.jarvisdong.dao.repository.TbItemRepositoty;
import com.jarvisdong.jarvisroom.util.SimpleBeanUtils;
import com.jarvisdong.pojo.TbItem;
import com.jarvisdong.service.TbItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;


@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@Transactional
public class TbItemServiceImpl implements TbItemService {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    TbItemRepositoty tbItemRepositoty;

    @Override
    public Page<TbItem> findAllTbItemByPage(int currentPage) {
        PageRequest pageable = PageRequest.of(currentPage, 10, new Sort(Sort.Direction.DESC, "created"));
        Page<TbItemEntity> all = tbItemRepositoty.findAll(pageable);
        //此处建议直接使用sql查询;
        List<TbItem> tbItems = SimpleBeanUtils.copyBean(TbItem.class, all.getContent());
        return new PageImpl<TbItem>(tbItems,all.getPageable(),all.getTotalElements());
    }
}
