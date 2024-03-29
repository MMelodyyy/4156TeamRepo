package com.java.rollercoaster.dao;

import com.java.rollercoaster.pojo.userAccount;
import com.java.rollercoaster.pojo.userAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int countByExample(userAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int deleteByExample(userAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int deleteByPrimaryKey(String phoneNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int insert(userAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int insertSelective(userAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    List<userAccount> selectByExample(userAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    userAccount selectByPrimaryKey(String phoneNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") userAccount record, @Param("example") userAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByExample(@Param("record") userAccount record, @Param("example") userAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByPrimaryKeySelective(userAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByPrimaryKey(userAccount record);
}