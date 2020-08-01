package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.Payment;

/**
 * @author shuaiyin.zhang
 * @description
 * @date 2020/08/01
 */
@Mapper
public interface PaymentMapper {
	/**
	 * create a new Payment record into db.
	 *
	 * @param record new record
	 * @return lines of record changed
	 */
	int create(Payment record);

	/**
	 * query Payment record by primary key.
	 *
	 * @param id primary key
	 * @return record selected
	 */
	Payment getPaymentById(@Param("id") Long id);
}
