package com.example.exercise.generated;

import com.example.exercise.generated.OrderDetails;
import com.example.exercise.generated.OrderDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    long countByExample(OrderDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int deleteByExample(OrderDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int insert(OrderDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int insertSelective(OrderDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    List<OrderDetails> selectByExample(OrderDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    OrderDetails selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByExampleSelective(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByExample(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByPrimaryKeySelective(OrderDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_details
     *
     * @mbg.generated Sat May 04 03:04:05 JST 2019
     */
    int updateByPrimaryKey(OrderDetails record);
}