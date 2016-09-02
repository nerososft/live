package org.nero.live.core.user.dao;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.nero.live.user.entity.MemberInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * author： nero
 * email: nerosoft@outlook.com
 * data: 16-8-31
 * time: 下午4:06.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})
public class MemberInfoDaoTest extends TestCase {


    @Resource
    private MemberInfoDao memberInfoDao;

    public void testGetMemberInfoByMemberId() throws Exception {
        System.out.println(memberInfoDao.getMemberInfoByMemberId(1).toString());
    }

    public void testAddMember() throws Exception {
        MemberInfo memberInfo = new MemberInfo();
        memberInfoDao.addMember(memberInfo);
    }

}