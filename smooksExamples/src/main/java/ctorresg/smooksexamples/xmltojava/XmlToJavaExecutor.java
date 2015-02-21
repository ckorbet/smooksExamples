package ctorresg.smooksexamples.xmltojava;

import java.io.IOException;

import javax.xml.transform.stream.StreamSource;

import org.milyn.Smooks;
import org.milyn.payload.JavaResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

public class XmlToJavaExecutor {

	private static final Logger LOGGER = LoggerFactory.getLogger(XmlToJavaExecutor.class);

	public static final void main(final String args[]){
		Smooks smooks = null;
		try {
			smooks = new Smooks("/src/main/java/ctorresg/smooksexamples/xmltojava/smooks-config.xml");
			LOGGER.info("Creado smooks con el archivo de configuracion 'smooks.codig.xml'. Creando el JavaResult...");
			final JavaResult javaResult = new JavaResult();
			LOGGER.info("Filtrando el input message al JavaResult...");
			smooks.filterSource(new StreamSource("file:src/main/java/ctorresg/smooksexamples/xmltojava/inputMsg.xml"), javaResult);
			LOGGER.info("Filtrado correctamente. Extrayendo el Order...");
			final Order order = javaResult.getBean(Order.class);
			LOGGER.info("Order extraido: " + order.toString());
		} catch (final IOException ioExcp) {
			LOGGER.error("", ioExcp);
		} catch (final SAXException saxEcp) {
			LOGGER.error("", saxEcp);
		} finally{
			if(smooks!=null){
				smooks.close();
				LOGGER.info("Smooks cerrado");
			}
		}

	}

}
