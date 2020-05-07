package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.FilmCategory;
import cn.xzxy.lewy.circleachieve.pojo.FilmCategoryExample;
import cn.xzxy.lewy.circleachieve.pojo.FilmCategoryKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmCategoryMapper {
    long countByExample(FilmCategoryExample example);

    int deleteByExample(FilmCategoryExample example);

    int deleteByPrimaryKey(FilmCategoryKey key);

    int insert(FilmCategory record);

    int insertSelective(FilmCategory record);

    List<FilmCategory> selectByExample(FilmCategoryExample example);

    FilmCategory selectByPrimaryKey(FilmCategoryKey key);

    int updateByExampleSelective(@Param("record") FilmCategory record, @Param("example") FilmCategoryExample example);

    int updateByExample(@Param("record") FilmCategory record, @Param("example") FilmCategoryExample example);

    int updateByPrimaryKeySelective(FilmCategory record);

    int updateByPrimaryKey(FilmCategory record);
}