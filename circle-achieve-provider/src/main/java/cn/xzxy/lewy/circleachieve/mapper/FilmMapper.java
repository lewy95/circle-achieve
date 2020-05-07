package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.Film;
import cn.xzxy.lewy.circleachieve.pojo.FilmExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmMapper {
    long countByExample(FilmExample example);

    int deleteByExample(FilmExample example);

    int deleteByPrimaryKey(Integer filmId);

    int insert(Film record);

    int insertSelective(Film record);

    List<Film> selectByExample(FilmExample example);

    Film selectByPrimaryKey(Integer filmId);

    int updateByExampleSelective(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKey(Film record);
}