package org.example.controller;

import org.example.domain.CommonResult;
import org.example.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author shuaiyin.zhang
 * @description
 * @date 2020/08/13
 */
@RestController
public class AccountController {

	@Resource
	AccountService accountService;

	/**
	 * 扣减账户余额
	 */
	@RequestMapping("/account/decrease")
	public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
		accountService.decrease(userId, money);
		return new CommonResult(200, "扣减账户余额成功！");
	}
}

