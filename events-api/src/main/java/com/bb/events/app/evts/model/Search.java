package com.bb.events.app.evts.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created by bilge on 21/03/17.
 */
@XStreamAlias("search")
public class Search {

    @XStreamAlias("total_items")
    private int totalItems;

    @XStreamAlias("page_size")
    private int pageSize;

    @XStreamAlias("page_count")
    private int pageCount;

    @XStreamAlias("page_number")
    private int pageNumber;

    @XStreamAlias("page_items")
    private int pageItems;

    @XStreamAlias("first_item")
    private int firstItem;

    @XStreamAlias("last_item")
    private int lastItem;

    @XStreamAlias("search_time")
    private double searchTime;

    @XStreamAlias("events")
    private List<Event> events;

    @XStreamAlias("venue")
    private List<Venue> venues;

    @XStreamAlias("performer")
    private List<Performer> performers;

    @XStreamAlias("demand")
    private String demands;

    public Search(int lastItem, int totalItems, int pageSize, int pageCount, int pageNumber, int pageItems, int firstItem, double searchTime, List<Event> events, List<Venue> venues, List<Performer> performers, String demands) {
        this.lastItem = lastItem;
        this.totalItems = totalItems;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.pageNumber = pageNumber;
        this.pageItems = pageItems;
        this.firstItem = firstItem;
        this.searchTime = searchTime;
        this.events = events;
        this.venues = venues;
        this.performers = performers;
        this.demands = demands;
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageItems() {
        return pageItems;
    }

    public int getFirstItem() {
        return firstItem;
    }

    public int getLastItem() {
        return lastItem;
    }

    public double getSearchTime() {
        return searchTime;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Performer> getPerformers() {
        return performers;
    }

    public String getDemands() {
        return demands;
    }
}
