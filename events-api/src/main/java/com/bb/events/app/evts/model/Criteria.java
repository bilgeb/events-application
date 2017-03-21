package com.bb.events.app.evts.model;

/**
 * Created by bilge on 21/03/17.
 */
public interface Criteria<K> {
    boolean apply(K item);
}
