package com.thinkjoy.swms.rpc.api;

import com.thinkjoy.swms.common.base.BaseServiceMock;
import com.thinkjoy.swms.dao.mapper.SwmsPoorMapper;
import com.thinkjoy.swms.dao.entity.SwmsPoor;
import com.thinkjoy.swms.dao.entity.SwmsPoorExample;

/**
* 降级实现SwmsPoorService接口
* @author Miracle.wang
* @date 2018/3/6
*/
public class SwmsPoorServiceMock extends BaseServiceMock<SwmsPoorMapper, SwmsPoor, SwmsPoorExample> implements SwmsPoorService {

}
