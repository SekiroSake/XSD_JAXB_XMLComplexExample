
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

import com.test.rss.*;

public class App {
	public static void main(String[] args) {
//		ObjectFactory factory = new ObjectFactory();
//		try {
//			File file = new File("src/main/xml/file.xml");
//			
//			Employee employee1 = factory.createEmployee();
//			List<String> e1Project = employee1.getProject();
//			employee1.setEmplyeeId(1);
//			employee1.setClient("Client1");
//			employee1.setEmployeeName("France");
//			e1Project.add("e1Project1");
//			e1Project.add("e1Project2");
//			
//			Employee employee2 = factory.createEmployee();
//			List<String> e2Project = employee2.getProject();
//			employee2.setEmplyeeId(2);
//			employee2.setClient("Client2");
//			employee2.setEmployeeName("Brown");
//			e2Project.add("e2Project1");
//			e2Project.add("e2Project2");
//			e2Project.add("e2Project3");
//			e2Project.add("e2Project4");
//
//			Employer employer = factory.createEmployer();
//			employer.setEmployerId(1);
//			employer.setEmployerName("Damon");
//			
//
//
//			Department department = factory.createDepartment();
//			department.setDepartmentId(1);
//			department.setDepartmentName("Google");
//			department.setEmployer(employer);
//			
//			List<Employee> empList =  department.getEmployee();
//			empList.add(employee1);
//			empList.add(employee2);
//
//			JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
//			JAXBElement<Department> element = factory.createNewDepartment(department);
//
//			Marshaller marshaller = context.createMarshaller();
//			marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
//			marshaller.marshal(element, System.out);
//			marshaller.marshal(element, file);
//			boolean valid = validateXMLSchema("src/main/xsd/complex.xsd", "src/main/xml/file.xml");
//			System.out.println();
//			System.out.println("========Validation result========");
//			System.out.println(valid);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}

	}

	public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		} catch (SAXException e1) {
			System.out.println("SAX Exception: " + e1.getMessage());
			return false;
		}

		return true;

	}
}