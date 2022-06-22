package com.restApinew.restApinew.entity;

public class Api {
	
	@Override
	public String toString() {
		return "Api [binRange=" + binRange + ", cardBrand=" + cardBrand + ", cardIssuer=" + cardIssuer + ", cardType="
				+ cardType + ", cardSubtype=" + cardSubtype + ", country=" + country + ", countryCode=" + countryCode
				+ ", iso=" + iso + ", currencyCode=" + currencyCode + ", url=" + url + ", contact=" + contact + "]";
	}

	public Api() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBinRange() {
		return binRange;
	}

	public void setBinRange(String binRange) {
		this.binRange = binRange;
	}

	public String getCardBrand() {
		return cardBrand;
	}

	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardSubtype() {
		return cardSubtype;
	}

	public void setCardSubtype(String cardSubtype) {
		this.cardSubtype = cardSubtype;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	private String binRange;
	private String cardBrand;
	private String cardIssuer;
	private String cardType;
	private String cardSubtype;
	private String country;
	private String countryCode;
	private String iso;
	private String currencyCode;
	private String url;
	private String contact;
	
	public Api(String binRange, String cardBrand, String cardIssuer, String cardType, String cardSubtype,
			String country, String countryCode, String iso, String currencyCode, String url, String contact) {
		super();
		this.binRange = binRange;
		this.cardBrand = cardBrand;
		this.cardIssuer = cardIssuer;
		this.cardType = cardType;
		this.cardSubtype = cardSubtype;
		this.country = country;
		this.countryCode = countryCode;
		this.iso = iso;
		this.currencyCode = currencyCode;
		this.url = url;
		this.contact = contact;
	}
	
}
