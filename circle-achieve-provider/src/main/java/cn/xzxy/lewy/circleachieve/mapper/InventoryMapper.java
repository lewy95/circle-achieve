package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.Inventory;
import cn.xzxy.lewy.circleachieve.pojo.InventoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryMapper {
    long countByExample(InventoryExample example);

    int deleteByExample(InventoryExample example);

    int deleteByPrimaryKey(Integer inventoryId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    List<Inventory> selectByExample(InventoryExample example);

    Inventory selectByPrimaryKey(Integer inventoryId);

    int updateByExampleSelective(@Param("record") Inventory record, @Param("example") InventoryExample example);

    int updateByExample(@Param("record") Inventory record, @Param("example") InventoryExample example);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}