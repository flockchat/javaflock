package co.flock.event;

import co.flock.model.Event;

public interface EventListener<T extends Event> {
    void handle(T event);
}
