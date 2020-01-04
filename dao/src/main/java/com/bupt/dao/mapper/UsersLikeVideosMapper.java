package com.bupt.dao.mapper;

import com.bupt.dao.entity.UsersLikeVideos;
import com.bupt.dao.entity.UsersLikeVideosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersLikeVideosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    long countByExample(UsersLikeVideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int deleteByExample(UsersLikeVideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int insert(UsersLikeVideos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int insertSelective(UsersLikeVideos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    List<UsersLikeVideos> selectByExample(UsersLikeVideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    UsersLikeVideos selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int updateByExampleSelective(@Param("record") UsersLikeVideos record, @Param("example") UsersLikeVideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int updateByExample(@Param("record") UsersLikeVideos record, @Param("example") UsersLikeVideosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int updateByPrimaryKeySelective(UsersLikeVideos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_like_videos
     *
     * @mbg.generated Sat Jan 04 21:39:39 CST 2020
     */
    int updateByPrimaryKey(UsersLikeVideos record);
}