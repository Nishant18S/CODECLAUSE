import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Event {
    private String name;
    private LocalDateTime dateTime;
    private String location;
    private List<Attendee> attendees;

    public Event(String name, LocalDateTime dateTime, String location) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
    }

    public void displayDetails() {
        System.out.println("Event Name: " + name);
        System.out.println("Date and Time: " + dateTime);
        System.out.println("Location: " + location);
        System.out.println("Attendees:");
        for (Attendee attendee : attendees) {
            System.out.println(" - " + attendee);
        }
    }

    @Override
    public String toString() {
        return name + " on " + dateTime.toString() + " at " + location;
    }
}
class Attendee {
    private String name;
    private String email;
    private String phoneNumber;

    public Attendee(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " (" + email + ", " + phoneNumber + ")";
    }
}


 class EventManager {
    private List<Event> events;
    private Scanner scanner;

    public EventManager() {
        events = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void createEvent() {
        System.out.println("Enter event name:");
        String name = scanner.nextLine();
        System.out.println("Enter event date and time (YYYY-MM-DDTHH:MM):");
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Enter event location:");
        String location = scanner.nextLine();

        Event event = new Event(name, dateTime, location);
        events.add(event);
        System.out.println("Event created successfully.");
    }

    public void addAttendee() {
        System.out.println("Select event (by index):");
        for (int i = 0; i < events.size(); i++) {
            System.out.println(i + ": " + events.get(i));
        }
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index < 0 || index >= events.size()) {
            System.out.println("Invalid event index.");
            return;
        }

        Event event = events.get(index);
        System.out.println("Enter attendee name:");
        String name = scanner.nextLine();
        System.out.println("Enter attendee email:");
        String email = scanner.nextLine();
        System.out.println("Enter attendee phone number:");
        String phoneNumber = scanner.nextLine();

        Attendee attendee = new Attendee(name, email, phoneNumber);
        event.addAttendee(attendee);
        System.out.println("Attendee added successfully.");
    }

    public void displayEvents() {
        for (Event event : events) {
            event.displayDetails();
            System.out.println();
        }
    }

    public void run() {
        while (true) {
            System.out.println("1. Create Event");
            System.out.println("2. Add Attendee");
            System.out.println("3. Display Events");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createEvent();
                    break;
                case 2:
                    addAttendee();
                    break;
                case 3:
                    displayEvents();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
public class Mains {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        eventManager.run();
    }
}

