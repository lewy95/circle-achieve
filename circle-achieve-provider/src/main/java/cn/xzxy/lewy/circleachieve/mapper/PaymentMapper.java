package cn.xzxy.lewy.circleachieve.mapper;

import cn.xzxy.lewy.circleachieve.pojo.Payment;
import cn.xzxy.lewy.circleachieve.pojo.PaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentMapper {
    long countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(Integer paymentId);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(Integer paymentId);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}