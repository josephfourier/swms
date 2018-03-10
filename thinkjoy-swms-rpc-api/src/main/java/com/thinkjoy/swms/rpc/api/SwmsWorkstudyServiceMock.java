package com.thinkjoy.swms.rpc.api;

import com.thinkjoy.swms.common.base.BaseServiceMock;
import com.thinkjoy.swms.dao.mapper.SwmsWorkstudyMapper;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudy;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudyExample;

/**
* 降级实现SwmsWorkstudyService接口
* @author Miracle.wang
* @date 2018/3/6
*/
public class SwmsWorkstudyServiceMock extends BaseServiceMock<SwmsWorkstudyMapper, SwmsWorkstudy, SwmsWorkstudyExample> implements SwmsWorkstudyService {

}
