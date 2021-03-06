package com.bupt.dao.mapper;

import com.bupt.dao.entity.SearchRecords;
import com.bupt.dao.entity.SearchRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchRecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    long countByExample(SearchRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int deleteByExample(SearchRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int insert(SearchRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int insertSelective(SearchRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    List<SearchRecords> selectByExample(SearchRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    SearchRecords selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int updateByExampleSelective(@Param("record") SearchRecords record, @Param("example") SearchRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int updateByExample(@Param("record") SearchRecords record, @Param("example") SearchRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int updateByPrimaryKeySelective(SearchRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table search_records
     *
     * @mbg.generated Sat Jan 04 21:38:00 CST 2020
     */
    int updateByPrimaryKey(SearchRecords record);
}