package com.bb.events.app.evts.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */
public class Venue {
    @XStreamAlias("venue_name")
    private String name;

    @XStreamAlias("venue_id")
    private String svid;

    @XStreamAsAttribute
    @XStreamAlias("id")
    private String attributeId;

    @XStreamAlias("venue_type")
    private String type;

    @XStreamAlias("venue_url")
    private String url;

    @XStreamAlias("venue_display")
    private int display;

    @XStreamAlias("venue_address")
    private String address;

    @XStreamAlias("city_name")
    private String city;

    @XStreamAlias("region_name")
    private String region;

    @XStreamAlias("description")
    private String description;

    @XStreamAlias("region_abbr")
    private String regionAbbreviation;

    @XStreamAlias("postal_code")
    private String postalCode;

    @XStreamAlias("country_name")
    private String country;

    @XStreamAlias("county_abbr2")
    private String countryTwoLetterAbbreviation;

    @XStreamAlias("country_abbr")
    private String countryThreeLetterAbbreviation;

    @XStreamAlias("latitude")
    private double latitude;

    @XStreamAlias("longitude")
    private double longitude;

    @XStreamAlias("url_type")
    private String urlType;

    @XStreamAlias("geocode_type")
    private String geocodeType;
    
    @XStreamAlias("parents")
    private List<Venue> parents;

    @XStreamAlias("child")
    private List<Venue> children;
    
    @XStreamAlias("events")
    private String events;
    
    @XStreamAlias("links")
    private String links;
    
    @XStreamAlias("comments")
    private String comments;
    
    @XStreamAlias("trackbacks")
    private String trackbacks;
    
    @XStreamAlias("property")
    private String properties;

    @XStreamAlias("tags")
    private String tags;

    public Venue(String description, String name, String svid, String attributeId, String type, String url, int display, String address, String city, String region, String regionAbbreviation, String postalCode, String country, String countryTwoLetterAbbreviation, String countryThreeLetterAbbreviation, double latitude, double longitude, String urlType, String geocodeType, List<Venue> parents, List<Venue> children, String events, String links, String comments, String trackbacks, String properties, String tags) {
        this.description = description;
        this.name = name;
        this.svid = svid;
        this.attributeId = attributeId;
        this.type = type;
        this.url = url;
        this.display = display;
        this.address = address;
        this.city = city;
        this.region = region;
        this.regionAbbreviation = regionAbbreviation;
        this.postalCode = postalCode;
        this.country = country;
        this.countryTwoLetterAbbreviation = countryTwoLetterAbbreviation;
        this.countryThreeLetterAbbreviation = countryThreeLetterAbbreviation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.urlType = urlType;
        this.geocodeType = geocodeType;
        this.parents = parents;
        this.children = children;
        this.events = events;
        this.links = links;
        this.comments = comments;
        this.trackbacks = trackbacks;
        this.properties = properties;
        this.tags = tags;
    }

    public String getCountryThreeLetterAbbreviation() {
        return countryThreeLetterAbbreviation;
    }

    public String getName() {
        return name;
    }

    public String getSvid() {
        return svid;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public int getDisplay() {
        return display;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getDescription() {
        return description;
    }

    public String getRegionAbbreviation() {
        return regionAbbreviation;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryTwoLetterAbbreviation() {
        return countryTwoLetterAbbreviation;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getUrlType() {
        return urlType;
    }

    public String getGeocodeType() {
        return geocodeType;
    }

    public List<Venue> getParents() {
        return parents;
    }

    public List<Venue> getChildren() {
        return children;
    }

    public String getEvents() {
        return events;
    }

    public String getLinks() {
        return links;
    }

    public String getComments() {
        return comments;
    }

    public String getTrackbacks() {
        return trackbacks;
    }

    public String getProperties() {
        return properties;
    }

    public String getTags() {
        return tags;
    }
}
