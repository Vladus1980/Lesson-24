package Ex01;

import java.util.Scanner;

public enum Days {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	int serialNumber;

	Days(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public String toLiteral(boolean fullType) {
		String dayToLiteralFull;
		String dayToLiteralShort;

		switch (Days.this) {
		case MONDAY:
			dayToLiteralFull = "��������";
			dayToLiteralShort = "��.";
			break;
		case TUESDAY:
			dayToLiteralFull = "³������";
			dayToLiteralShort = "³�.";
			break;
		case WEDNESDAY:
			dayToLiteralFull = "������";
			dayToLiteralShort = "���.";
			break;
		case THURSDAY:
			dayToLiteralFull = "������";
			dayToLiteralShort = "���.";
			break;
		case FRIDAY:
			dayToLiteralFull = "�������";
			dayToLiteralShort = "��.";
			break;
		case SATURDAY:
			dayToLiteralFull = "������";
			dayToLiteralShort = "��.";
			break;
		case SUNDAY:
			dayToLiteralFull = "�����";
			dayToLiteralShort = "��.";
			break;
		default:
			dayToLiteralFull = dayToLiteralShort = "";
			break;
		}

		if (fullType)
			return dayToLiteralFull;
		else
			return dayToLiteralShort;
	}

	public static Days inputDay() {
		
		Scanner scanner = new Scanner(System.in);
		Integer returnedNumber = 0;
		Days foundDay = null;

		System.out.print("������ ����� ��� �����: ");
		if (scanner.hasNextInt()) {
			int nextInt = scanner.nextInt();

			if (nextInt > 0 && nextInt <= Days.values().length) {
				returnedNumber = nextInt;
			} else
				System.out.println("����� ��� ����� �� 1 �� 7");
		} else
			System.out.println("������ �������� �����");

		for (Days day : Days.values()) {
			if (day.getSerialNumber() == returnedNumber) {
				foundDay = day;
			}
		}

		return foundDay;
	}
}
