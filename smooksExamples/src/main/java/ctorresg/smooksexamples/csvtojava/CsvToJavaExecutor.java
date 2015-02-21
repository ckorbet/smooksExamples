package ctorresg.smooksexamples.csvtojava;

import java.io.IOException;
import java.util.List;

import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.event.report.HtmlReportGenerator;
import org.milyn.payload.JavaResult;
import org.milyn.payload.StringSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

public class CsvToJavaExecutor {

	private static final Logger LOGGER = LoggerFactory.getLogger(CsvToJavaExecutor.class);

	@SuppressWarnings("unchecked")
	public static void main(final String[] args) {
		Smooks smooks = null;
		try {
			LOGGER.info("Creado smooks con el archivo de configuracion 'smooks.codig.xml'. Creando el JavaResult...");
			smooks = new Smooks("/src/main/java/ctorresg/smooksexamples/csvtojava/smooks-config.xml");
			final ExecutionContext executionContext = smooks.createExecutionContext();
			final JavaResult result = new JavaResult();
			executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
			LOGGER.info("Filtrando el input message al JavaResult...");
			smooks.filterSource(executionContext, new StringSource("file:src/main/java/ctorresg/smooksexamples/csvtojava/inputMsg.csv"), result);
			LOGGER.info("Filtrado correctamente. Extrayendo el Customers...");
			final List<Customer> resList = (List<Customer>) result.getBean("customerList");
			for(final Customer iter : resList){
				LOGGER.info("Customer: " + iter.toString());
			}
			LOGGER.info("Extraidos " + resList.size() + " Customers");
		} catch (final SmooksException smoExcp) {
			LOGGER.error("", smoExcp);
		} catch (final IOException ioExcp) {
			LOGGER.error("", ioExcp);
		} catch (final SAXException saxEcp) {
			LOGGER.error("", saxEcp);
		} finally {
			if(smooks!=null){
				smooks.close();
			}
		}
	}

}
