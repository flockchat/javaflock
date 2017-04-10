package co.flock.event;

import co.flock.model.Event;

public interface EventListenerWithResponse<T extends Event, U> {
    U handle(T event);
}