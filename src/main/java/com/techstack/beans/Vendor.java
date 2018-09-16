package com.techstack.beans;

public class Vendor {

	private String vendor_id;
	private String vendor_name;

	public Vendor() {

	}

	public Vendor(String vendor_id, String vendor_name) {
		super();
		this.vendor_id = vendor_id;
		this.vendor_name = vendor_name;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

}
