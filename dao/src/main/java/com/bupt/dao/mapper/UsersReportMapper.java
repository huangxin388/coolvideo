package com.bupt.dao.mapper;

import com.bupt.dao.entity.UsersReport;
import com.bupt.dao.entity.UsersReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    long countByExample(UsersReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int deleteByExample(UsersReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int insert(UsersReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int insertSelective(UsersReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    List<UsersReport> selectByExample(UsersReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    UsersReport selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") UsersReport record, @Param("example") UsersReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int updateByExample(@Param("record") UsersReport record, @Param("example") UsersReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int updateByPrimaryKeySelective(UsersReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_report
     *
     * @mbg.generated Sat Jan 04 21:40:04 CST 2020
     */
    int updateByPrimaryKey(UsersReport record);
}