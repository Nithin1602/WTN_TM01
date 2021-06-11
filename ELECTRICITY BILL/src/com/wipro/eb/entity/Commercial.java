package com.wipro.eb.entity;
public class Commercial extends Connection {
	public Commercial(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		int units=currentReading-previousReading;
		float billamount=0.0f;
		float ElectricityDuty=0.0f;
		if(units>100)
		{
			billamount=50*slabs[0]+50*slabs[1]+(units-100)*slabs[2];
		}
		else if(units>50 && units<=100)
		{
			billamount=50*slabs[0]+(units-50)*slabs[1];
		}
		else
		{
			billamount=units*slabs[0];
		}
		if(billamount>=10000)
		{
			ElectricityDuty=billamount*0.09f;
		}
		else if(billamount>=5000)
		{
			ElectricityDuty=billamount*0.06f;
		}
		else
		{
			ElectricityDuty=billamount*0.02f;
		}
		return billamount+ElectricityDuty;
	}
}
