package com.java.rollercoaster.dao;

import com.java.rollercoaster.pojo.userPassword;
import com.java.rollercoaster.pojo.userPasswordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userPasswordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int countByExample(userPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int deleteByExample(userPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int deleteByPrimaryKey(Integer phoneNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int insert(userPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int insertSelective(userPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    List<userPassword> selectByExample(userPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    userPassword selectByPrimaryKey(Integer phoneNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") userPassword record, @Param("example") userPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int updateByExample(@Param("record") userPassword record, @Param("example") userPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int updateByPrimaryKeySelective(userPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password
     *
     * @mbggenerated Thu Nov 05 16:41:45 CST 2020
     */
    int updateByPrimaryKey(userPassword record);
}