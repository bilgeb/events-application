package com.bb.events.app.evts.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */
@XStreamAlias("event")
public class Event {
    @XStreamAlias("id")
    @XStreamAsAttribute
    private String seid;

    @XStreamAlias("id")
    @XStreamAsAttribute
    private String id;

    @XStreamAlias("title")
    private String title;

    @XStreamAlias("olson_path")
    private String olsonPath;

    @XStreamAlias("url")
    private String url;
    @XStreamAlias("description")
    private String description;
    @XStreamAlias("start_time")
    private String start_time;
    @XStreamAlias("stop_time")
    private String stop_time;

    @XStreamAlias("venue_id")
    private String venue_id;
    @XStreamAlias("venue_url")
    private String venue_url;
    @XStreamAlias("venue_name")
    private String venue_name;
    @XStreamAlias("venue_display")
    private String venue_display;
    @XStreamAlias("venue_address")
    private String venue_address;
    @XStreamAlias("city_name")
    private String city_name;
    @XStreamAlias("region_name")
    private String region_name;
    @XStreamAlias("postal_code")
    private String postal_code;
    @XStreamAlias("country_name")
    private String country_name;

    @XStreamAlias("venue_type")
    private String type;

    @XStreamAlias("venue_display")
    private int display;

    @XStreamAlias("venue_address")
    private String address;

    @XStreamAlias("region_abbr")
    private String regionAbbreviation;

    @XStreamAlias("country_abbr2")
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

    @XStreamAlias("privacy")
    private String privacy;

    @XStreamAlias("withdrawn")
    private boolean withdrawn;

    @XStreamAlias("withdrawn_note")
    private String withdrawnNote;

    @XStreamAlias("links")
    private String links;

    @XStreamAlias("comments")
    private String comments;

    @XStreamAlias("tags")
    private String tags;

    @XStreamAlias("trackbacks")
    private String trackbacks;

    @XStreamAlias("calendar_count")
    private int calendarCount;

    @XStreamAlias("comment_count")
    private int commentCount;

    @XStreamAlias("trackback_count")
    private int trackbackCount;

    @XStreamAlias("tag_count")
    private int tagCount;

    @XStreamAlias("link_count")
    private int linkCount;

    @XStreamAlias("going_count")
    private int goingCount;

    @XStreamAlias("performer_count")
    private int performerCount;

    @XStreamAlias("image_count")
    private int imageCount;

    @XStreamAlias("watching_count")
    private int watchingCount;

    @XStreamAlias("calendars")
    private String calendars;

    @XStreamAlias("properties")
    private String properties;

    @XStreamAlias("groups")
    private String groups;

    @XStreamAlias("going")
    private String going;

    @XStreamAlias("performers")
    private List<Performer> performers;

    @XStreamAlias("image")
    private String image;

    @XStreamAlias("tz_id")
    private String tzId;

    @XStreamAlias("tz_olson_path")
    private String tzOlsonPath;

    @XStreamAlias("tz_country")
    private String tzCountry;

    @XStreamAlias("tz_city")
    private String tzCity;

    @XStreamAlias("all_day")
    private boolean allDay;

    @XStreamAlias("free")
    private boolean free;

    @XStreamAlias("price")
    private String price;

    @XStreamAlias("owner")
    private String owner;

    @XStreamAlias("created")
    private String created;

    @XStreamAlias("modified")
    private String modified;

    @XStreamAlias("recur_string")
    private String recur_string;

    @XStreamAlias("parents")
    private List<Event> parents;

    @XStreamAlias("children")
    private List<Event> children;

    public Event(String type, String seid, String id, String title, String olsonPath, String url, String description, String start_time, String stop_time, String venue_id, String venue_url, String venue_name, String venue_display, String venue_address, String city_name, String region_name, String postal_code, String country_name, int display, String address, String regionAbbreviation, String countryTwoLetterAbbreviation, String countryThreeLetterAbbreviation, double latitude, double longitude, String urlType, String geocodeType, String privacy, boolean withdrawn, String withdrawnNote, String links, String comments, String tags, String trackbacks, int calendarCount, int commentCount, int trackbackCount, int tagCount, int linkCount, int goingCount, int performerCount, int imageCount, int watchingCount, String calendars, String properties, String groups, String going, List<Performer> performers, String image, String tzId, String tzOlsonPath, String tzCountry, String tzCity, boolean allDay, boolean free, String price, String owner, String created, String modified, String recur_string, List<Event> parents, List<Event> children) {
        this.type = type;
        this.seid = seid;
        this.id = id;
        this.title = title;
        this.olsonPath = olsonPath;
        this.url = url;
        this.description = description;
        this.start_time = start_time;
        this.stop_time = stop_time;
        this.venue_id = venue_id;
        this.venue_url = venue_url;
        this.venue_name = venue_name;
        this.venue_display = venue_display;
        this.venue_address = venue_address;
        this.city_name = city_name;
        this.region_name = region_name;
        this.postal_code = postal_code;
        this.country_name = country_name;
        this.display = display;
        this.address = address;
        this.regionAbbreviation = regionAbbreviation;
        this.countryTwoLetterAbbreviation = countryTwoLetterAbbreviation;
        this.countryThreeLetterAbbreviation = countryThreeLetterAbbreviation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.urlType = urlType;
        this.geocodeType = geocodeType;
        this.privacy = privacy;
        this.withdrawn = withdrawn;
        this.withdrawnNote = withdrawnNote;
        this.links = links;
        this.comments = comments;
        this.tags = tags;
        this.trackbacks = trackbacks;
        this.calendarCount = calendarCount;
        this.commentCount = commentCount;
        this.trackbackCount = trackbackCount;
        this.tagCount = tagCount;
        this.linkCount = linkCount;
        this.goingCount = goingCount;
        this.performerCount = performerCount;
        this.imageCount = imageCount;
        this.watchingCount = watchingCount;
        this.calendars = calendars;
        this.properties = properties;
        this.groups = groups;
        this.going = going;
        this.performers = performers;
        this.image = image;
        this.tzId = tzId;
        this.tzOlsonPath = tzOlsonPath;
        this.tzCountry = tzCountry;
        this.tzCity = tzCity;
        this.allDay = allDay;
        this.free = free;
        this.price = price;
        this.owner = owner;
        this.created = created;
        this.modified = modified;
        this.recur_string = recur_string;
        this.parents = parents;
        this.children = children;
    }

    public int getLinkCount() {
        return linkCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getTrackbackCount() {
        return trackbackCount;
    }

    public int getTagCount() {
        return tagCount;
    }

    public int getCalendarCount() {
        return calendarCount;
    }

    public String getRecur_string() {
        return recur_string;
    }

    public String getRegion_name() {
        return region_name;
    }

    public String getSeid() {
        return seid;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOlsonPath() {
        return olsonPath;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getStop_time() {
        return stop_time;
    }

    public String getVenue_id() {
        return venue_id;
    }

    public String getVenue_url() {
        return venue_url;
    }

    public String getVenue_name() {
        return venue_name;
    }

    public String getVenue_display() {
        return venue_display;
    }

    public String getVenue_address() {
        return venue_address;
    }

    public String getCity_name() {
        return city_name;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getPrivacy() {
        return privacy;
    }

    public boolean isWithdrawn() {
        return withdrawn;
    }

    public String getWithdrawnNote() {
        return withdrawnNote;
    }

    public String getLinks() {
        return links;
    }

    public String getComments() {
        return comments;
    }

    public String getTags() {
        return tags;
    }

    public String getTrackbacks() {
        return trackbacks;
    }

    public String getCalendars() {
        return calendars;
    }

    public String getProperties() {
        return properties;
    }

    public String getGroups() {
        return groups;
    }

    public String getGoing() {
        return going;
    }

    public List<Performer> getPerformers() {
        return performers;
    }

    public String getImage() {
        return image;
    }

    public String getTzId() {
        return tzId;
    }

    public String getTzOlsonPath() {
        return tzOlsonPath;
    }

    public String getTzCountry() {
        return tzCountry;
    }

    public String getTzCity() {
        return tzCity;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public boolean isFree() {
        return free;
    }

    public String getPrice() {
        return price;
    }

    public List<Event> getParents() {
        return parents;
    }

    public List<Event> getChildren() {
        return children;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getType() {
        return type;
    }

    public int getDisplay() {
        return display;
    }

    public String getAddress() {
        return address;
    }

    public String getRegionAbbreviation() {
        return regionAbbreviation;
    }

    public String getCountryTwoLetterAbbreviation() {
        return countryTwoLetterAbbreviation;
    }

    public String getCountryThreeLetterAbbreviation() {
        return countryThreeLetterAbbreviation;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getUrlType() {
        return urlType;
    }

    public String getGeocodeType() {
        return geocodeType;
    }
}
