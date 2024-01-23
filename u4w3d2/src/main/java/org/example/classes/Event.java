package org.example.classes;

import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    @Column(name = "event_date")
    private String eventDate;
    private String decription;
    @Enumerated(EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;
    @Column(name = "max_enter")
    private int maxEnter;

    public Event() {

    }

    public Event(String title, String eventDate, String decription, EventType eventType, int maxEnter) {

        this.title = title;
        this.eventDate = eventDate;
        this.decription = decription;
        this.eventType = eventType;
        this.maxEnter = maxEnter;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getMaxEnter() {
        return maxEnter;
    }

    public void setMaxEnter(int maxEnter) {
        this.maxEnter = maxEnter;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", decription='" + decription + '\'' +
                ", eventType=" + eventType +
                ", maxEnter=" + maxEnter +
                '}';
    }
}
