package com.thinkjoy.swms.rpc.api;

import com.thinkjoy.swms.common.base.BaseServiceMock;
import com.thinkjoy.swms.dao.mapper.SwmsInsuranceOrderMapper;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceOrder;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceOrderExample;

/**
* 降级实现SwmsInsuranceOrderService接口
* @author Miracle.wang
* @date 2018/3/6
*/
public class SwmsInsuranceOrderServiceMock extends BaseServiceMock<SwmsInsuranceOrderMapper, SwmsInsuranceOrder, SwmsInsuranceOrderExample> implements SwmsInsuranceOrderService {

}
