public class Booking {

        public int availableTickets;

        public Booking(int totalTickets) {
            this.availableTickets = totalTickets;
        }

        public synchronized void bookTicket(String passengerName, int numTickets) {
            if (availableTickets >= numTickets) {
                System.out.println(passengerName + " successfully booked " + numTickets + " ticket(s).");
                availableTickets -= numTickets;
            } else {
                System.out.println(passengerName + " failed to book tickets. Not enough available tickets.");
            }
        }

        public static void main(String[] args) {
            Booking bookingSystem = new Booking(12);

            Thread passenger1 = new Thread(() -> bookingSystem.bookTicket("Passenger 1", 2));
            Thread passenger2 = new Thread(() -> bookingSystem.bookTicket("Passenger 2", 4));
            Thread passenger3 = new Thread(() -> bookingSystem.bookTicket("Passenger 3", 6));

            passenger1.start();
            passenger2.start();
            passenger3.start();
        }
    }
