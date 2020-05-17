package com.covid.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
// Generated May 1, 2020, 8:54:03 PM by Hibernate Tools 5.2.12.Final
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", schema = "release1")
public class Address implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 57749860496954082L;
	private int addressId;
	private Integer userId;
	private String addressType;
	private String companyName;
	private String inCareOf;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String city;
	private String districtCounty;
	private String stateTerritory;
	private String postCode;
	private String country;

	public Address() {
	}

	public Address(final int addressId) {
		this.addressId = addressId;
	}

	public Address(final int addressId, final Integer userId, final String addressType, final String companyName,
			final String inCareOf, final String addressLine1, final String addressLine2, final String addressLine3,
			final String city, final String districtCounty, final String stateTerritory, final String postCode,
			final String country) {
		this.addressId = addressId;
		this.userId = userId;
		this.addressType = addressType;
		this.companyName = companyName;
		this.inCareOf = inCareOf;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.districtCounty = districtCounty;
		this.stateTerritory = stateTerritory;
		this.postCode = postCode;
		this.country = country;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "address_id", unique = true, nullable = false)
	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(final int addressId) {
		this.addressId = addressId;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(final Integer userId) {
		this.userId = userId;
	}

	@Column(name = "address_type", length = 10)
	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(final String addressType) {
		this.addressType = addressType;
	}

	@Column(name = "company_name", length = 10)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "in_care_of", length = 10)
	public String getInCareOf() {
		return this.inCareOf;
	}

	public void setInCareOf(final String inCareOf) {
		this.inCareOf = inCareOf;
	}

	@Column(name = "address_line_1", length = 10)
	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(final String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	@Column(name = "address_line_2", length = 10)
	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(final String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@Column(name = "address_line_3", length = 10)
	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(final String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	@Column(name = "city", length = 10)
	public String getCity() {
		return this.city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	@Column(name = "district_county", length = 10)
	public String getDistrictCounty() {
		return this.districtCounty;
	}

	public void setDistrictCounty(final String districtCounty) {
		this.districtCounty = districtCounty;
	}

	@Column(name = "state_territory", length = 10)
	public String getStateTerritory() {
		return this.stateTerritory;
	}

	public void setStateTerritory(final String stateTerritory) {
		this.stateTerritory = stateTerritory;
	}

	@Column(name = "post_code", length = 10)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(final String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "country", length = 10)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

}