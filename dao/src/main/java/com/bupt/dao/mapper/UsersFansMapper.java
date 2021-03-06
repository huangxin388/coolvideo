package com.bupt.dao.mapper;

import com.bupt.dao.entity.UsersFans;
import com.bupt.dao.entity.UsersFansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersFansMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    long countByExample(UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int deleteByExample(UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int insert(UsersFans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int insertSelective(UsersFans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    List<UsersFans> selectByExample(UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    UsersFans selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") UsersFans record, @Param("example") UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int updateByExample(@Param("record") UsersFans record, @Param("example") UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int updateByPrimaryKeySelective(UsersFans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sat Jan 04 21:39:09 CST 2020
     */
    int updateByPrimaryKey(UsersFans record);
}