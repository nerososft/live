package org.nero.live.core.user.dao;

import org.apache.ibatis.javassist.compiler.ast.Member;
import org.nero.live.core.dao.BaseDao;
import org.nero.live.user.entity.MemberInfo;

import java.util.List;

/**
 * 会员信息表数据层接口
 * author : yang
 * Created by nero on 16-8-31.
 */
public interface MemberInfoDao extends BaseDao<MemberInfo> {


    /**
     * 获取会员信息
     * @param id
     * @return
     */
    public MemberInfo getMemberInfoByMemberId(long id);

    /**
     * 通过注册电话获取用户信息
     * @param phone
     * @return
     */
    public MemberInfo getMemberInfoByPhone(long phone);

    /**
     * 分页获取会员信息列表
     * @param offset
     * @param limit
     * @return
     */
    public List<MemberInfo> getMemberList(long offset, long limit);

    /**
     * 通过用户昵称获取用户信息
     * @param name
     * @return
     */
    public MemberInfo getMemberInfoByName(String name);

    /**
     * 更新会员信息
     * @param id
     * @param memberInfo
     * @return
     */
    public long updateMemberById(long id,MemberInfo memberInfo);

    /**
     * 冻结会员
     * @param id
     * @return
     */
    public long freezeMemberById(long id);

    /**
     * 添加新会员
     * @param memberInfo
     * @return
     */
    public long addMember(MemberInfo memberInfo);


}
