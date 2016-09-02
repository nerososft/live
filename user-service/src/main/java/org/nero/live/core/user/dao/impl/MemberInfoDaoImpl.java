package org.nero.live.core.user.dao.impl;

import org.nero.live.core.dao.impl.BaseDaoImpl;
import org.nero.live.core.user.dao.MemberInfoDao;
import org.nero.live.user.entity.MemberInfo;

import java.util.List;

/**
 * author： nero
 * email: nerosoft@outlook.com
 * data: 16-8-31
 * time: 下午1:04.
 */
public class MemberInfoDaoImpl extends BaseDaoImpl<MemberInfo> implements MemberInfoDao {

    public MemberInfo getMemberInfoByMemberId(long id) {
        return get(id);
    }

    public MemberInfo getMemberInfoByPhone(long phone) {
        return null;
    }

    public List<MemberInfo> getMemberList(long offset, long limit) {
        return null;
    }

    public MemberInfo getMemberInfoByName(String name) {
        return null;
    }

    public long updateMemberById(long id, MemberInfo memberInfo) {
        return 0;
    }

    public long freezeMemberById(long id) {
        return 0;
    }

    public long addMember(MemberInfo memberInfo) {
        return 0;
    }
}
