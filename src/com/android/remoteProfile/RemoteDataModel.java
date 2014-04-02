package com.android.remoteProfile;

import java.util.ArrayList;

import com.android.entity.AccountModel;
import com.android.trend.ChartPointModel;
import com.android.trend.RecordModel;

public class RemoteDataModel {
	private AccountModel account;
	private ArrayList<ChartPointModel> healthdata;
	private ArrayList<RecordModel> eventdata;

	public AccountModel getAccount() {
		return account;
	}

	public void setAccount(AccountModel account) {
		this.account = account;
	}

	public ArrayList<ChartPointModel> getHealthdata() {
		return healthdata;
	}

	public void setHealthdata(ArrayList<ChartPointModel> healthdata) {
		this.healthdata = healthdata;
	}

	public ArrayList<RecordModel> getEventdata() {
		return eventdata;
	}

	public void setEventdata(ArrayList<RecordModel> eventdata) {
		this.eventdata = eventdata;
	}

}
