package co.flock.model;

public interface EventListenerWithResponse<T extends Event, U> {
    U handle(T event);
}