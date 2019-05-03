package com.example.exercise.generated;

import com.example.exercise.generated.Changelog;
import com.example.exercise.generated.ChangelogExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangelogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    long countByExample(ChangelogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int deleteByExample(ChangelogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int insert(Changelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int insertSelective(Changelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    List<Changelog> selectByExample(ChangelogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    Changelog selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByExampleSelective(@Param("record") Changelog record, @Param("example") ChangelogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByExample(@Param("record") Changelog record, @Param("example") ChangelogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByPrimaryKeySelective(Changelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.changelog
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByPrimaryKey(Changelog record);
}