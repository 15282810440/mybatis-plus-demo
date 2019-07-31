package com.onfish.yshyheartbeatcollectionreport.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author 何欣
 * @date 2019/7/31 16:09
 */
public abstract class BaseController<T, S extends IService> {
    protected IService<T> service;

    protected abstract void setService(S service);

    boolean insert(T entity){
       return service.save(entity);
    }

    boolean deleteById(Serializable id){
        return service.removeById(id);
    }

    boolean deleteByMap(@Param("cm") Map<String, Object> columnMap){
        return service.removeByMap(columnMap);
    }

    boolean delete(@Param("ew") Wrapper<T> wrapper){
        return service.remove(wrapper);
    }

    boolean deleteBatchIds(@Param("coll") Collection<? extends Serializable> idList){
        return service.removeByIds(idList);
    }

    boolean updateById(@Param("et") T entity){
        return service.updateById(entity);
    }

    boolean update(@Param("et") T entity, @Param("ew") Wrapper<T> updateWrapper){
        return service.update(updateWrapper);
    }

    T selectById(Serializable id){
        return service.getById(id);
    }

    Collection<T> selectBatchIds(@Param("coll") Collection<? extends Serializable> idList){
        return service.listByIds(idList);
    }

    Collection<T> selectByMap(@Param("cm") Map<String, Object> columnMap){
        return service.listByMap(columnMap);
    }

    T selectOne(@Param("ew") Wrapper<T> queryWrapper){
        return service.getOne(queryWrapper);
    }

    Integer selectCount(@Param("ew") Wrapper<T> queryWrapper){
        return service.count(queryWrapper);
    }

    List<T> selectList(@Param("ew") Wrapper<T> queryWrapper){
        return service.list(queryWrapper);
    }

    List<Map<String, Object>> selectMaps(@Param("ew") Wrapper<T> queryWrapper){
        return service.listMaps(queryWrapper);
    }

    List<Object> selectObjs(@Param("ew") Wrapper<T> queryWrapper){
        return service.listObjs(queryWrapper);
    }

    IPage<T> selectPage(IPage<T> page, @Param("ew") Wrapper<T> queryWrapper){
        return service.page(page, queryWrapper);
    }

    IPage<Map<String, Object>> selectMapsPage(IPage<T> page, @Param("ew") Wrapper<T> queryWrapper){
        return service.pageMaps(page, queryWrapper);
    }
}
