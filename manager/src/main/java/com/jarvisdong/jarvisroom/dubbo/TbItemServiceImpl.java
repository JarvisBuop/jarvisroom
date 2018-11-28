package com.jarvisdong.jarvisroom.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.jarvisdong.kit.TbItemService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JarvisDong on 2018/11/28.
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class TbItemServiceImpl implements TbItemService {

    @Override
    public String selectAll(String str) {
        return "1111"+str;
    }
}
