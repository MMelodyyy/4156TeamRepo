package com.java.rollercoaster.dao;

import com.java.rollercoaster.pojo.ticket;
import com.java.rollercoaster.pojo.ticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ticketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int countByExample(ticketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int deleteByExample(ticketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int deleteByPrimaryKey(String ticketId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int insert(ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int insertSelective(ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    List<ticket> selectByExample(ticketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    ticket selectByPrimaryKey(String ticketId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByExampleSelective(@Param("record") ticket record, @Param("example") ticketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByExample(@Param("record") ticket record, @Param("example") ticketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByPrimaryKeySelective(ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    int updateByPrimaryKey(ticket record);
}