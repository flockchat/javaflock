package com.flock.event;

import com.flock.model.Event;

public interface EventListenerWithResponse<T extends Event, U> {
    U handle(T event);
}