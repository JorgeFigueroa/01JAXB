package it.jaad.jaxb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JAXBMarshall {
	
	private static final Logger log = LoggerFactory.getLogger(JAXBMarshall.class);
	
	public static void main(String[] args){
		
		Profesor profesor = new Profesor();
		profesor.setCodigo(123);
		profesor.setApellido("Sanchez");
		profesor.setFechaIngreso(new GregorianCalendar(2017, 8 , 16).getTime());
		profesor.setNombre("Jose");

		Map<String, String> appendixes = new LinkedHashMap<String, String>();
		appendixes.put("1", "test1");
		appendixes.put("2", "test2");
		appendixes.put("3", "test3");
		appendixes.put("4", "test4");
		profesor.setMap(appendixes);
		
		try {
			File profesorXml = new File("profesor.xml");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(profesor, profesorXml);
			marshaller.marshal(profesor, baos);
			
			log.info("salida:\n" + new String(baos.toByteArray()));
			
		} catch (Exception e) {
			log.error("Error al generar el archivo", e);
		}

	}

}
