package FE.SendData;


/**
* SendData/SendData_interfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SendData_interface.idl
* Saturday, April 9, 2022 4:31:42 o'clock PM EDT
*/

public interface SendData_interfaceOperations 
{
  String sayHello ();
  void shutdown ();

  //string login_credentials(string str);
  boolean authenticate (String client_userName, String client_password);

  //MTL Admin
  String printMsg (String msg);

  //Appointment Creation
  String add_appointment (String options_appointment_type_admin, String final_appointmentID_admin, int slot_numbers, String admin_Id);

  //List of Appointment
  String list_appointment_availability (String appointment_type, String admin_Id);

  //Book appointment
  String book_appointment (String patient_Id, String appointmentID, String appointmentType);

  //Get Scheduled Appointment
  String get_appointment_schedule (String patient_Id);

  //Get Cancel Appointment
  String cancel_appointment (String patient_Id, String appointmentID, String appointmentType);

  //Get Remove Appointment
  String remove_appointment (String appointmentID, String appointmentType, String patientID);

  //Swap Appointment
  String swap_appointment (String patientID, String old_appointmentID, String old_appointmentType, String new_appointmentID, String new_appointmentType);
  String fault (String adminID);
  String crash (String adminID);
  String general (String adminID);
} // interface SendData_interfaceOperations
