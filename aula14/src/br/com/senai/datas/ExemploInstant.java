package br.com.senai.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExemploInstant {

	public static void main(String[] args) {
//		LocalDateTime d = LocalDateTime.now();
//		System.out.println(d);
		
		Instant dataDeHoje = Instant.now();
		System.out.println(dataDeHoje);
		
		LocalDateTime dataLocalTime = LocalDateTime.ofInstant(dataDeHoje, ZoneId.systemDefault());
		System.out.println(dataLocalTime);
		
		LocalDateTime dataHoraPais = LocalDateTime.ofInstant(dataDeHoje, ZoneId.of("Portugal"));
		System.out.println(dataHoraPais);
/*		Instant dataString = Instant.parse("2023-05-17T08:00:00Z");
		System.out.println(dataString);
*/		
		
		
	}

}
