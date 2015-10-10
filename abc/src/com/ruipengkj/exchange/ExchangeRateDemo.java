package com.ruipengkj.exchange;

import java.util.List;
import java.util.Map;

public class ExchangeRateDemo {

	public static void main(String adfas[]) throws Exception {
		List<Map<String, Object>> list = ExchangeRateUtil.getExchangeRate();
		System.out.println(list.toString());
//		Map<String, Object> map = ExchangeRateUtil.getExchangeRate("RUB");
//		System.out.println(map.toString());
//		List<Map<String, Object>> currencyList = ExchangeRateUtil.getCurrencyList();
//		System.out.println(currencyList.toString());
	}
}
