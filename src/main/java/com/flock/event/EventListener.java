package com.flock.event;

import com.flock.model.Event;

public interface EventListener<T extends Event> {
    void handle(T event);
}
