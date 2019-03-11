import java.util.LinkedList;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{
	private LinkedList<PatientType> queueHospital = new LinkedList<>();

	@Override
	public void addPatient(PatientType patient) 
	{
		//
		queueHospital.add(patient);
		
	}

	@Override
	public PatientType nextPatient() 
	{
		//
		return queueHospital.getFirst();
	}

	@Override
	public PatientType treatNextPatient() 
	{
		//
		return queueHospital.removeFirst();
	}

	@Override
	public int numPatients() 
	{
		// TODO Auto-generated method stub
		return queueHospital.size();
	}

	@Override
	public String hospitalType() 
	{
		// TODO Auto-generated method stub
		return "Queue Hospital";
	}

	@Override
	public String allPatientInfo() 
	{
		// TODO Auto-generated method stub
		String allInfo = "";
		for (int i = 0; i < queueHospital.size(); ++i)
		{
			allInfo += queueHospital.get(i).toString().toString();
		}
		return allInfo;
	}

}
