package co.flock.model;

public interface EventListener<T extends Event> {
    void handle(T event);
}
