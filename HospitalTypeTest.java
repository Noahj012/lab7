import org.junit.Assert;
import org.junit.Test;


public class HospitalTypeTest 
{
	@Test
	public void StackHospitalTest()
	{
		StackHospital<Person> stackHos = new StackHospital<Person>();
		Person p = new SickPerson("Noah" , 19, 5);
		Person q = new SickPerson("No" , 9, 21);
		stackHos.addPatient(p);
		stackHos.addPatient(q);
		Assert.assertEquals("Not the correct Patient",q, stackHos.nextPatient());
		Assert.assertEquals("Not the correct Patient",q, stackHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",1, stackHos.numPatients());
		Assert.assertEquals("Not the correct Patient","Stack Hospital", stackHos.hospitalType());
		Assert.assertEquals("Not the correct Patient","Noah Severity level 5", stackHos.allPatientInfo());
		Assert.assertEquals("Not the correct Patient",p, stackHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",0, stackHos.numPatients());
	} 
	
	@Test
	public void QueueHospital()
	{
		QueueHospital<Person> qHos = new QueueHospital<Person>();
		Person p = new SickPerson("Noah" , 19, 5);
		Person q = new SickPerson("No" , 9, 21);
		qHos.addPatient(p);
		qHos.addPatient(q);
		Assert.assertEquals("Not the correct Patient",p, qHos.nextPatient());
		Assert.assertEquals("Not the correct Patient",p, qHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",1, qHos.numPatients());
		Assert.assertEquals("Not the correct Patient","Queue Hospital", qHos.hospitalType());
		Assert.assertEquals("Not the correct Patient","No Severity level 21", qHos.allPatientInfo());
		Assert.assertEquals("Not the correct Patient",q, qHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",0, qHos.numPatients());
	}
	
	@Test
	public void PriorityQueueHospital()
	{
		PriorityQueueHospital<Person> pQHos = new PriorityQueueHospital<Person>();
		Person p = new SickPerson("Noah" , 19, 22);
		Person q = new SickPerson("No" , 9, 21);
		pQHos.addPatient(p);
		pQHos.addPatient(q);
		Assert.assertEquals("Not the correct Patient",p, pQHos.nextPatient());
		Assert.assertEquals("Not the correct Patient",p, pQHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",1, pQHos.numPatients());
		Assert.assertEquals("Not the correct Patient","Priority Queue Hospital", pQHos.hospitalType());
		Assert.assertEquals("Not the correct Patient","No Severity level 21", pQHos.allPatientInfo());
		Assert.assertEquals("Not the correct Patient",q, pQHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",0, pQHos.numPatients());
		Person a = new HealthyPerson("Andrew", 19, "Checkup");
		Person b = new HealthyPerson("Andy", 9, "Scared");
		pQHos.addPatient(a);
		pQHos.addPatient(b);
		Assert.assertEquals("Not the correct Patient",a, pQHos.nextPatient());
		Assert.assertEquals("Not the correct Patient",a, pQHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",1, pQHos.numPatients());
		Assert.assertEquals("Not the correct Patient","Andy In for Scared", pQHos.allPatientInfo());
		Assert.assertEquals("Not the correct Patient",b, pQHos.treatNextPatient());
		Assert.assertEquals("Not the correct Patient",0, pQHos.numPatients());
		
	}

}
