package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.Staff;
import cn.xzxy.lewy.circleachieve.pojo.StaffExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffMapper {
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExampleWithBLOBs(StaffExample example);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExampleWithBLOBs(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKeyWithBLOBs(Staff record);

    int updateByPrimaryKey(Staff record);
}