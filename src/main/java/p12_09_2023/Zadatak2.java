package p12_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        User host = new User("Milan");
        User guest = new User("Milos Josifovic");
        ZoomCall zoomCall = new ZoomCall("https://us02web.zoom.us/postattendee?mn=r-2Eo-BJeD9Gdc83GjV1z_QeYxtKKeACx9Pq.OVnim_baMk2yzke7",
                "dasdfarfqqwd",host);
        host.licenceType(150);
        zoomCall.setGuest(guest);
        zoomCall.printInfo();
        host.resetLicence();
        zoomCall.printInfo();

    }
}
