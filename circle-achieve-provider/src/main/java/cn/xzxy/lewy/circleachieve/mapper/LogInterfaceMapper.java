package cn.xzxy.lewy.circleachieve.mapper;


import cn.xzxy.lewy.circleachieve.pojo.LogInterface;
import cn.xzxy.lewy.circleachieve.pojo.LogInterfaceWithBLOBs;

public interface LogInterfaceMapper {
    int deleteByPrimaryKey(String logId);

    int insert(LogInterfaceWithBLOBs record);

    int insertSelective(LogInterfaceWithBLOBs record);

    LogInterfaceWithBLOBs selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(LogInterfaceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LogInterfaceWithBLOBs record);

    int updateByPrimaryKey(LogInterface record);
}