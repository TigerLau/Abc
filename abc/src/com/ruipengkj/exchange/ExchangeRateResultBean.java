package com.ruipengkj.exchange;

import java.util.List;

public class ExchangeRateResultBean {

	private int showapi_res_code;
	private String showapi_res_error;
	private ShowapiResBody showapi_res_body;

	public int getShowapi_res_code() {
		return showapi_res_code;
	}

	public void setShowapi_res_code(int showapi_res_code) {
		this.showapi_res_code = showapi_res_code;
	}

	public String getShowapi_res_error() {
		return showapi_res_error;
	}

	public void setShowapi_res_error(String showapi_res_error) {
		this.showapi_res_error = showapi_res_error;
	}

	public ShowapiResBody getShowapi_res_body() {
		return showapi_res_body;
	}

	public void setShowapi_res_body(ShowapiResBody showapi_res_body) {
		this.showapi_res_body = showapi_res_body;
	}

	public class ShowapiResBody {
		private int listSize;
		private int ret_code;
		private List<ExchangeRateBean> list;

		public int getListSize() {
			return listSize;
		}

		public void setListSize(int listSize) {
			this.listSize = listSize;
		}

		public int getRet_code() {
			return ret_code;
		}

		public void setRet_code(int ret_code) {
			this.ret_code = ret_code;
		}

		public List<ExchangeRateBean> getList() {
			return list;
		}

		public void setList(List<ExchangeRateBean> list) {
			this.list = list;
		}

	}

	public class ExchangeRateBean {
		private String chao_in; // 现钞买入价
		private String chao_out; // 现钞卖出价
		private String hui_in; // 现汇买入价
		private String hui_out; // 现汇买入价
		private String day; // yyyy-MM-dd 日期
		private String time; // hh:mm:ss 时间
		private String name; // 货币名
		private String code; // 货币代码
		private String zhesuan; // 中行折算价

		public String getChao_in() {
			return chao_in;
		}

		public void setChao_in(String chao_in) {
			this.chao_in = chao_in;
		}

		public String getChao_out() {
			return chao_out;
		}

		public void setChao_out(String chao_out) {
			this.chao_out = chao_out;
		}

		public String getHui_in() {
			return hui_in;
		}

		public void setHui_in(String hui_in) {
			this.hui_in = hui_in;
		}

		public String getHui_out() {
			return hui_out;
		}

		public void setHui_out(String hui_out) {
			this.hui_out = hui_out;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
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

		public String getZhesuan() {
			return zhesuan;
		}

		public void setZhesuan(String zhesuan) {
			this.zhesuan = zhesuan;
		}
	}

}
