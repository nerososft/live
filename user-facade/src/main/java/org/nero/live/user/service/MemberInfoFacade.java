package org.nero.live.user.service;

import org.nero.live.user.entity.MemberInfo;
import org.nero.live.user.exceptions.UserBizException;

/**
 * 会员基本信息对外接口
 * Created by nero on 16-8-30.
 */

public interface MemberInfoFacade {


    /**
     * 根据Id获取会员信息
     * @param id
     * @return
     */
    public MemberInfo getMemberInfoById(long id) throws UserBizException;


}
