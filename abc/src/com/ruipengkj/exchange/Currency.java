package com.ruipengkj.exchange;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public enum Currency {
	
	EUR(1, "EUR", "欧元"),
	USD(2, "USD", "美元"),
	GBP(3, "GBP", "英镑"),
	RUB(4, "RUB", "卢布"),
	AUD(5, "AUD", "澳大利亚元"),
	JPY(6, "JPY", "日元"),
	CHF(7, "CHF", "瑞士法郎"),
	TWD(8, "TWD", "新台币"),
	BRL(9, "BRL", "巴西里亚尔"),
	CAD(10, "CAD", "加拿大元"),
	DKK(11, "DKK", "丹麦克朗"),
	HKD(12, "HKD", "港币"),
	IDR(13, "IDR", "印尼卢比"),
	KRW(14, "KRW", "韩国元"),
	MOP(15, "MOP", "澳门元"),
	MYR(16, "MYR", "林吉特"),
	NOK(17, "NOK", "挪威克朗"),
	NZD(18, "NZD", "新西兰元"),
	PHP(19, "PHP", "菲律宾比索"),
	SEK(20, "SEK", "瑞典克朗"),
	SGD(21, "SGD", "新加坡元"),
	THB(22, "THB", "泰国铢");

	private int index;
	private String name;
	private String code;

	private Currency(int index, String code, String name) {
		this.index = index;
		this.code = code;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static List<Map<String,Object>> TransList() {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for(Currency currency : Currency.values()) {
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			map.put("currencyName", currency.getName());
			map.put("currencyCode", currency.getCode());
			list.add(map);
		}
		return list;
	}
}
