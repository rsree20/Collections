package com.collections.set;

public class RedBus implements Comparable<RedBus> {
	
	@Override
	public int compareTo(RedBus bus) {
		// TODO Auto-generated method stub
		int fareSort= this.fare.compareTo(bus.fare);
		
		if(fareSort == 0) {
			int arrivalValue = this.arrivalTime.compareTo(bus.arrivalTime);
			
			if(arrivalValue ==0) {
				return this.serviceNo.compareTo(bus.serviceNo);
			}
			else {
				return arrivalValue;
			}
				
		}else {
			return fareSort;
		}
	}
	
	
	
	public RedBus(Integer serviceNo, String serviceName, String departureTime, String arrivalTime, String fare) {
		super();
		this.serviceNo = serviceNo;
		this.serviceName = serviceName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}
	
	@Override
	public String toString() {
		
		return serviceNo+" : "+serviceName+" : "+departureTime+" : "+arrivalTime+" : "+fare;
	}

	private Integer serviceNo;
	
	private String serviceName;
	
	private String departureTime;
	
	private String arrivalTime;
	
	private String fare;
	
	

	public Integer getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(Integer serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	
	

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}


}
