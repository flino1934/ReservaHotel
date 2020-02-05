package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			int number = Integer.parseInt(JOptionPane.showInputDialog("Enter room number: "));
			Date checkIn = sdf.parse(JOptionPane.showInputDialog("Check-In"));
			Date checkOut = sdf.parse(JOptionPane.showInputDialog("Check-Out"));

			Reservation reservation = new Reservation(checkIn, checkOut, number);
			System.out.println(reservation);

			System.out.println("Update");

			checkIn = sdf.parse(JOptionPane.showInputDialog("Check-In"));
			checkOut = sdf.parse(JOptionPane.showInputDialog("Check-Out"));

			reservation.updateDate(checkIn, checkOut);
			System.out.println(reservation);

		} catch (ParseException e) {

			System.out.println("Data invalida!");

		} catch (DomainException e) {

			System.out.println(e.getMessage());

		}
	}

}
