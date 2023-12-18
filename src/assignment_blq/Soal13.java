package assignment_blq;

public class Soal13 {

	static int calcAngle(double h, double m) {
		
		if (h < 0 || m < 0 || m > 60) {
			System.out.println("Input Salah");
			return -1;
		}

		if (h == 12)
			h = 0;
		if (m == 60) {
			m = 0;
			h += 1;

		}

		if (h > 12) {
			h = h - 12;
		}


		int hour_angle = (int) (0.5 * (h * 60 + m));
		int minute_angle = (int) (6 * m);


		int angle = Math.abs(hour_angle - minute_angle);

		angle = Math.min(360 - angle, angle);

		return angle;
	}


	public static void main(String[] args) {
		System.out.println("Jam 3:00 -> " + calcAngle(3, 0) + " derajat");
		System.out.println("Jam 5:30 -> " + calcAngle(5, 30) + " derajat");
		System.out.println("Jam 2:20 -> " + calcAngle(2, 20) + " derajat");
	}

}
