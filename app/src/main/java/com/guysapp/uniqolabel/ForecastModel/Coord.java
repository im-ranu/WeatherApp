package com.guysapp.uniqolabel.ForecastModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Coord implements Serializable {

	@SerializedName("lon")
	private double lon;

	@SerializedName("lat")
	private double lat;

	public void setLon(double lon){
		this.lon = lon;
	}

	public double getLon(){
		return lon;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}
}