package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.Actor;
import cn.xzxy.lewy.circleachieve.pojo.ActorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActorMapper {
    long countByExample(ActorExample example);

    int deleteByExample(ActorExample example);

    int deleteByPrimaryKey(Integer actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    List<Actor> selectByExample(ActorExample example);

    Actor selectByPrimaryKey(Integer actorId);

    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}