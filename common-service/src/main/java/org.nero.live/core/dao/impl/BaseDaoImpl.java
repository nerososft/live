package org.nero.live.core.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.nero.live.core.dao.BaseDao;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;
/**
 * 泛型DAO基类实现
 *
 * author： nero
 * email: nerosoft@outlook.com
 * data: 16-8-31
 * time: 下午2:24.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {


    @Resource(name="sqlSessionTemplate")
    private SqlSession session;
    private final String path = "org.nero.live.nero.entity";
    private Class type;

    public BaseDaoImpl(){
        this.type = this.getDAOClass();
    }

    @SuppressWarnings("all")
    private Class getDAOClass(){
        Class clazz = (Class)((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
        return clazz;
    }

    private String getMethodPath(String methodType){
        return path + type.getSimpleName() + "Mapper." + methodType;
    }

    public void save(T obj) {
        session.insert(getMethodPath("save"), obj);
    }

    public void delete(T obj) {
        session.delete(getMethodPath("delete"), obj);
    }

    public void update(T obj) {
        session.update(getMethodPath("update"), obj);
    }

    public T get(long id) {
        return session.selectOne(getMethodPath("get"),id);
    }

    public List<T> list() {
        return session.selectList(getMethodPath("list"));
    }

}
