package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date checkIn;
	private Date checkOut;
	private Integer room;

	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(Date checkIn, Date checkOut, Integer room) {
		super();
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.room = room;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {

		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	public void updateDate(Date checkIn, Date checkOut) {

		this.checkIn = checkIn;
		this.checkOut = checkOut;

	}

	@Override
	public String toString() {

		return "Room: "+room+", CheckIn: "+sdf.format(checkIn)+", CheckOut: "+sdf.format(checkOut)+", Durations: "+duration()+" nights: ";

	}

}
