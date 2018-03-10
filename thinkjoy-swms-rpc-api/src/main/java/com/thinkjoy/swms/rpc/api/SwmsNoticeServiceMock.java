package com.thinkjoy.swms.rpc.api;

import com.thinkjoy.swms.common.base.BaseServiceMock;
import com.thinkjoy.swms.dao.mapper.SwmsNoticeMapper;
import com.thinkjoy.swms.dao.entity.SwmsNotice;
import com.thinkjoy.swms.dao.entity.SwmsNoticeExample;

/**
* 降级实现SwmsNoticeService接口
* @author Miracle.wang
* @date 2018/3/6
*/
public class SwmsNoticeServiceMock extends BaseServiceMock<SwmsNoticeMapper, SwmsNotice, SwmsNoticeExample> implements SwmsNoticeService {

}
