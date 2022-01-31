package com.fifteen.events.local;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * EventLocal class to be create whenever the user created a new event. This
 * event
 * will be stored locally inside our local.db file and will be sync to the
 * remote database every minutes or so. Each event will have an event ID
 * to unique identify it, the ID is created by the user email_a unique ID
 * generated by the UUID.
 * 
 * @author Triet Huynh
 */
@Getter
@Setter
@NoArgsConstructor
public class EventLocal {
  private String eventID = "null";
  private String eventName = "null";
  private String eventDescription = "null";
  private GregorianCalendar startTime = new GregorianCalendar();
  private GregorianCalendar dayOfEvent = new GregorianCalendar();
  private long event_duration_minute = 0;
  private int minutesUntilReminder = 0;
  private Set<String> participants_email = new HashSet<String>();
  private Location location = new Location();
  private String priority;

  public EventLocal(String eventName, String eventDescription, GregorianCalendar startTime,
      GregorianCalendar dayOfEvent, long event_duration_minute, int minutesUntilReminder,
      Set<String> participants_email, Location location, String priority) {

    this.eventID = UUID.randomUUID().toString();
    this.eventName = eventName;
    this.eventDescription = eventDescription;
    this.startTime = startTime;
    this.dayOfEvent = dayOfEvent;
    this.event_duration_minute = event_duration_minute;
    this.minutesUntilReminder = minutesUntilReminder;
    this.participants_email.addAll(participants_email);
    this.location = location;
    this.priority = priority;
  }

  public void addParticipant(String[] participantsEmails) {
    for (int i = 0; i < participantsEmails.length; i++) {
      this.participants_email.add("\"" + participantsEmails[i] + "\"");
    }

  }
}
