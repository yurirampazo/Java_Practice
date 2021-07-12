package exceptions.mvcpattern.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation (Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long stayingTime() {
        long diff = checkout.getTime() - checkin.getTime();
        //TimeUnit é um enum para padrão de tempo, convert recebe o tempo e a UM
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkin, Date checkout){
        Date now = new Date();
        if(!checkin.after(now) || checkout.before(now)) {
            return "Reservation date must be in the future";
        }
        if (!checkout.after(checkin)) {
            return "check-in must be made before check-out.";
        }

        this.checkin = checkin;
        this.checkout = checkout;
        return  null;
    }

    @Override
    public String toString(){
        return "Room"
                +  roomNumber
                + "\nCheck-in: "
                + sdf.format(checkin)
                + "\nCheckout: "
                + sdf.format(checkout)
                + "\nStaying Time: "
                + stayingTime() + " nights";

    }
}
