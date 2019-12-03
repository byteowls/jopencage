package com.byteowls.jopencage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JOpenCageComponents {
  @JsonProperty("ISO_3166-1_alpha-2")
  private String iso31661;
  @JsonProperty("_type")
  private String type;
  private String city;
  @JsonProperty("city_district")
  private String cityDistrict;
  private String country;
  @JsonProperty("country_code")
  private String countryCode;
  private String county;
  private String postcode;
  private String road;
  @JsonProperty("house_number")
  private String houseNumber;
  private String state;
  private String region;
  @JsonProperty("political_union")
  private String politicalUnion;
  private String suburb;
  private String town;
  private String village;

  public String getISO31661() {
    return iso31661;
  }

  public String getType() {
    return type;
  }

  public String getCity() {
    return city;
  }

  public String getCityDistrict() {
    return cityDistrict;
  }

  public String getCountry() {
    return country;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public String getCounty() {
    return county;
  }

  public String getPostcode() {
    return postcode;
  }

  public String getRoad() {
    return road;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public String getState() {
    return state;
  }

  public String getPoliticalUnion() {
    return politicalUnion;
  }

  public String getSuburb() {
    return suburb;
  }

  public String getTown() {
    return town;
  }

  public String getRegion() {
    return region;
  }

  public String getVillage() {
    return village;
  }
}
