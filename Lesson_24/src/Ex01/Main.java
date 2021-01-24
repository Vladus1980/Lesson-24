package Ex01;

import java.util.Scanner;

public class Main {
	public static int menu() {
		System.out.println("1 - �������� ��������");
		System.out.println("2 - �������� ������ �� ����");
		System.out.println("3 - �������� ������ �� ����");
		System.out.println("4 - �������� ������ �� �������");
		System.out.println("5 - �������� ���");
		System.out.println("6 - �������� ���");
		System.out.println("7 - �������� ����");
		System.out.println("8 - �������� ������ ���� �� ����");
		System.out.println("9 - �������� ������ ���� �� ����");
		System.out.println("10 - �������� ������ ������ ���� �� �������");
		System.out.println("11 - �������� ������� ���� �� ����");
		System.out.println("12 - �������� ������� ���� �� ����");
		System.out.println("13 - ������� ������� ���� �� �������");
		System.out.println("14 - ������ �����");
		System.out.println("15 - �������� �����");
		System.out.println("0 - �����");

		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ��: ");
		int menuChoise = scanner.nextInt();

		return menuChoise;
	}

	public static void main(String[] args) {
		Cinema cinema = null;

		while (true) {
			switch (menu()) {

			case 1: {
				cinema = Cinema.inputCinema();
				break;
			}

			case 2: {
				cinema.addTimeTableToCinema();
				break;
			}

			case 3: {
				cinema.removeTimeTableFromCinema();
				break;
			}

			case 4: {
				cinema.viewCinemaTimeTable();
				break;
			}

			case 5: {
				cinema.addHallToCinema();
				break;
			}

			case 6: {
				cinema.removeHallFromCinema();
				break;
			}

			case 7: {
				cinema.viewCinemaHalls();
				break;
			}

			case 8: {
				cinema.addTimeTableToHallInCinema();
				break;
			}

			case 9: {
				cinema.removeTimeTableFromHallInCinema();
				break;
			}

			case 10: {
				cinema.viewHallTimeTableInCinema();
				break;
			}

			case 11: {
				cinema.addScheduleToHallInCinema();
				break;
			}

			case 12: {
				cinema.removeScheduleFromHallInCinema();
				break;
			}

			case 13: {
				cinema.viewHallScheduleInCinema();
				break;
			}

			case 14: {
				cinema.addMovieToSeanceInScheduleInHallInCinema();
				break;
			}

			case 15: {
				cinema.removeMovieFromSeanceInScheduleInAllHallsInCinema();
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}

			default: {
				System.err.println("�������, ������ ��� ����");
				break;
			}
			}
		}
	}
}
