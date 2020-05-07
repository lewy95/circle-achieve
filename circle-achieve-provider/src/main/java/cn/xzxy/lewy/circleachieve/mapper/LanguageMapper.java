package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.Language;
import cn.xzxy.lewy.circleachieve.pojo.LanguageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LanguageMapper {
    long countByExample(LanguageExample example);

    int deleteByExample(LanguageExample example);

    int deleteByPrimaryKey(Integer languageId);

    int insert(Language record);

    int insertSelective(Language record);

    List<Language> selectByExample(LanguageExample example);

    Language selectByPrimaryKey(Integer languageId);

    int updateByExampleSelective(@Param("record") Language record, @Param("example") LanguageExample example);

    int updateByExample(@Param("record") Language record, @Param("example") LanguageExample example);

    int updateByPrimaryKeySelective(Language record);

    int updateByPrimaryKey(Language record);
}