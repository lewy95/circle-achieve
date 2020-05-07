package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.FilmText;
import cn.xzxy.lewy.circleachieve.pojo.FilmTextExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmTextMapper {
    long countByExample(FilmTextExample example);

    int deleteByExample(FilmTextExample example);

    int deleteByPrimaryKey(Integer filmId);

    int insert(FilmText record);

    int insertSelective(FilmText record);

    List<FilmText> selectByExample(FilmTextExample example);

    FilmText selectByPrimaryKey(Integer filmId);

    int updateByExampleSelective(@Param("record") FilmText record, @Param("example") FilmTextExample example);

    int updateByExample(@Param("record") FilmText record, @Param("example") FilmTextExample example);

    int updateByPrimaryKeySelective(FilmText record);

    int updateByPrimaryKey(FilmText record);
}