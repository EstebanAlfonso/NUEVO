package colaborativo;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Fecha {
	private DayOfWeek dia;
	private Month mes;
	private Year año;
	
	public Fecha(DayOfWeek dia, Month mes, Year año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public DayOfWeek getDia() {
		return dia;
	}

	public void setDia(DayOfWeek dia) {
		this.dia = dia;
	}

	public Month getMes() {
		return mes;
	}

	public void setMes(Month mes) {
		this.mes = mes;
	}

	public Year getAño() {
		return año;
	}

	public void setAño(Year año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}

	public static void main(String[] args) {
		Fecha f = new Fecha(DayOfWeek.of(1), Month.of(2), Year.of(2013));
		
		System.out.println(f);
	}
	
}
