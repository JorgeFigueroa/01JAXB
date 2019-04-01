package it.jaad.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JAXBUnMarshall {
	
	private static final Logger LOG = LoggerFactory.getLogger(JAXBUnMarshall.class);	
	
	public static void main(String[] args){
		
		try {
			File profesorXml = new File("profesor.xml");
			JAXBContext jaxContext = JAXBContext.newInstance(Profesor.class);
			Unmarshaller unamarshaller = jaxContext.createUnmarshaller();
			Profesor profesor = (Profesor) unamarshaller.unmarshal(profesorXml);
			
			LOG.info("Datos del profesor:");
			LOG.info("Codigo      :" + profesor.getCodigo());
			LOG.info("Nombre      :" + profesor.getNombre());
			LOG.info("Apellido    :" + profesor.getApellido());
			LOG.info("FechaIngreso:" + profesor.getFechaIngreso());

		} catch (Exception e) {
			LOG.error("Error al generar el archivo", e);
		}
	
	
}
	
}
	

