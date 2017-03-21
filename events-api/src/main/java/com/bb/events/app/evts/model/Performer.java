package com.bb.events.app.evts.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */
@XStreamAlias("performer")
public class Performer {
    @XStreamAlias("id")
    private String spid;

    @XStreamAlias("id")
    @XStreamAsAttribute
    private String attributeId;

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("is_human")
    private boolean human;

    @XStreamAlias("short_bio")
    private String shortBio;

    @XStreamAlias("long_bio")
    private String longBio;

    @XStreamAlias("demand_count")
    private int demandCount;

    @XStreamAlias("demand_member_count")
    private int demandMemberCount;

    @XStreamAlias("event_count")
    private int eventCount;

    @XStreamAlias("created")
    private String created;

    @XStreamAlias("creator")
    private String creator;

    @XStreamAlias("withdrawn")
    private boolean withdrawn;

    @XStreamAlias("withdrawn_note")
    private String withdrawnNote;

    @XStreamAlias("links")
    private String links;

    @XStreamAlias("comments")
    private String comments;

    @XStreamAlias("images")
    private String images;

    @XStreamAlias("tags")
    private String tags;

    @XStreamAlias("properties")
    private String properties;

    @XStreamAlias("events")
    private List<Event> events;

    public Performer(int eventCount, String spid, String attributeId, String name, boolean human, String shortBio, String longBio, int demandCount, int demandMemberCount, String created, String creator, boolean withdrawn, String withdrawnNote, String links, String comments, String images, String tags, String properties, List<Event> events) {
        this.eventCount = eventCount;
        this.spid = spid;
        this.attributeId = attributeId;
        this.name = name;
        this.human = human;
        this.shortBio = shortBio;
        this.longBio = longBio;
        this.demandCount = demandCount;
        this.demandMemberCount = demandMemberCount;
        this.created = created;
        this.creator = creator;
        this.withdrawn = withdrawn;
        this.withdrawnNote = withdrawnNote;
        this.links = links;
        this.comments = comments;
        this.images = images;
        this.tags = tags;
        this.properties = properties;
        this.events = events;
    }

    public String getImages() {
        return images;
    }

    public String getSpid() {
        return spid;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public String getName() {
        return name;
    }

    public boolean isHuman() {
        return human;
    }

    public String getShortBio() {
        return shortBio;
    }

    public String getLongBio() {
        return longBio;
    }

    public int getDemandCount() {
        return demandCount;
    }

    public int getDemandMemberCount() {
        return demandMemberCount;
    }

    public int getEventCount() {
        return eventCount;
    }

    public String getCreated() {
        return created;
    }

    public String getCreator() {
        return creator;
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

    public String getProperties() {
        return properties;
    }

    public List<Event> getEvents() {
        return events;
    }
}
