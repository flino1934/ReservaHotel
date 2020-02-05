package application;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws HeadlessException, ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter room number: "));
		Date checkIn = sdf.parse(JOptionPane.showInputDialog("Check-In"));
		Date checkOut = sdf.parse(JOptionPane.showInputDialog("Check-Out"));

		if (!checkOut.after(checkIn)) {

			System.out.println("Error in reservation data de check-out antes de check-in");

		} else {

			Reservation reservation = new Reservation(checkIn, checkOut, number);
			System.out.println(reservation);

			System.out.println("Update");

			checkIn = sdf.parse(JOptionPane.showInputDialog("Check-In"));
			checkOut = sdf.parse(JOptionPane.showInputDialog("Check-Out"));

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {

				System.out.println("As datas de atualiza��o devem ser futuras");

			} else if (!checkOut.after(checkIn)) {

				System.out.println("Error in reservation data de check-out antes de check-in");

			} else {

				reservation.updateDate(checkIn, checkOut);
				System.out.println(reservation);

			}

		}

	}

}