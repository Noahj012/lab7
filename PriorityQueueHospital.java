import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>// extends Comparable<PatientType> > 
{
	private PriorityQueue<PatientType> priorityQueueHospital = new PriorityQueue<>();

	//@Override
	public void addPatient(PatientType patient) 
	{
		//
		priorityQueueHospital.add(patient);
		
	}

	//@Override
	public PatientType nextPatient() 
	{
		//
		return priorityQueueHospital.peek();
	}

	//@Override
	public PatientType treatNextPatient() 
	{
		//
		return priorityQueueHospital.poll();
	}

	//@Override
	public int numPatients() 
	{
		// TODO Auto-generated method stub
		return priorityQueueHospital.size();
	}

	//@Override
	public String hospitalType() 
	{
		// TODO Auto-generated method stub
		return "Priority Queue Hospital";
	}

	//@Override
	public String allPatientInfo() 
	{
		// TODO Auto-generated method stub
		Object[] priorityQueueHospitalArray = priorityQueueHospital.toArray();
		String allInfo = "";

		for (int i = 0; i < priorityQueueHospitalArray.length; ++i)
		{
			allInfo += priorityQueueHospitalArray[i];
		}
		return allInfo;
	}

}
