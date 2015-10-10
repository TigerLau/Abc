package com.ruipengkj.exchange;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.ruipengkj.exchange.ExchangeRateResultBean.ExchangeRateBean;
import com.show.api.ShowApiRequest;



public class ExchangeRateUtil {
	
	private static String url = "http://route.showapi.com/105-30";
	private static String appid = "10636";
	private static String appSecret = "fb59de4bc7004ee3ac0e49afde873752";
	
	private static ShowApiRequest request;
	
	public static List<Map<String, Object>> getCurrencyList(){
		return Currency.TransList();
	}
	
	public static List<Map<String, Object>> getExchangeRate(){
		if(request == null){
			request = new ShowApiRequest(url, appid, appSecret);
		}
		String response = request.post();
		ExchangeRateResultBean resultBean = new Gson().fromJson(response, ExchangeRateResultBean.class);
		List<ExchangeRateBean> exchangeRateBeanList = resultBean.getShowapi_res_body().getList();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(ExchangeRateBean exchangeRateBean:exchangeRateBeanList){
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			map.put("updateTime", exchangeRateBean.getDay()+exchangeRateBean.getTime());
			map.put("rate", exchangeRateBean.getZhesuan());
			map.put("currencyName", exchangeRateBean.getName());
			map.put("currencyCode", exchangeRateBean.getCode());
			list.add(map);
		}
		return list;
	}
	
	public static Map<String, Object> getExchangeRate(String code){
		if(request == null){
			request = new ShowApiRequest(url, appid, appSecret);
		}
		request.addTextPara("code", code);
		String response = request.post();
		ExchangeRateResultBean resultBean = new Gson().fromJson(response, ExchangeRateResultBean.class);
		List<ExchangeRateBean> exchangeRateBeanList = resultBean.getShowapi_res_body().getList();
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		if(exchangeRateBeanList.size() > 0){
			map.put("updateTime", exchangeRateBeanList.get(0).getDay()+exchangeRateBeanList.get(0).getTime());
			map.put("rate", exchangeRateBeanList.get(0).getZhesuan());
			map.put("currencyName", exchangeRateBeanList.get(0).getName());
			map.put("currencyCode", exchangeRateBeanList.get(0).getCode());
			return map;
		}
		return null;
	}

}
