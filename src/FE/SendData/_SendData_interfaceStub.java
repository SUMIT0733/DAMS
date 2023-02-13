package FE.SendData;

/**
* SendData/_SendData_interfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SendData_interface.idl
* Saturday, April 9, 2022 4:31:42 o'clock PM EDT
*/

public class _SendData_interfaceStub extends org.omg.CORBA.portable.ObjectImpl implements SendData_interface
{

  public String sayHello ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("sayHello", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return sayHello (        );
            } finally {
                _releaseReply ($in);
            }
  } // sayHello

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown


  //string login_credentials(string str);
  public boolean authenticate (String client_userName, String client_password)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("authenticate", true);
                $out.write_string (client_userName);
                $out.write_string (client_password);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return authenticate (client_userName, client_password        );
            } finally {
                _releaseReply ($in);
            }
  } // authenticate


  //MTL Admin
  public String printMsg (String msg)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("printMsg", true);
                $out.write_string (msg);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return printMsg (msg        );
            } finally {
                _releaseReply ($in);
            }
  } // printMsg


  //Appointment Creation
  public String add_appointment (String options_appointment_type_admin, String final_appointmentID_admin, int slot_numbers, String admin_Id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add_appointment", true);
                $out.write_string (options_appointment_type_admin);
                $out.write_string (final_appointmentID_admin);
                $out.write_long (slot_numbers);
                $out.write_string (admin_Id);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return add_appointment (options_appointment_type_admin, final_appointmentID_admin, slot_numbers, admin_Id        );
            } finally {
                _releaseReply ($in);
            }
  } // add_appointment


  //List of Appointment
  public String list_appointment_availability (String appointment_type, String admin_Id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("list_appointment_availability", true);
                $out.write_string (appointment_type);
                $out.write_string (admin_Id);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return list_appointment_availability (appointment_type, admin_Id        );
            } finally {
                _releaseReply ($in);
            }
  } // list_appointment_availability


  //Book appointment
  public String book_appointment (String patient_Id, String appointmentID, String appointmentType)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("book_appointment", true);
                $out.write_string (patient_Id);
                $out.write_string (appointmentID);
                $out.write_string (appointmentType);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return book_appointment (patient_Id, appointmentID, appointmentType        );
            } finally {
                _releaseReply ($in);
            }
  } // book_appointment


  //Get Scheduled Appointment
  public String get_appointment_schedule (String patient_Id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_appointment_schedule", true);
                $out.write_string (patient_Id);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_appointment_schedule (patient_Id        );
            } finally {
                _releaseReply ($in);
            }
  } // get_appointment_schedule


  //Get Cancel Appointment
  public String cancel_appointment (String patient_Id, String appointmentID, String appointmentType)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("cancel_appointment", true);
                $out.write_string (patient_Id);
                $out.write_string (appointmentID);
                $out.write_string (appointmentType);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return cancel_appointment (patient_Id, appointmentID, appointmentType        );
            } finally {
                _releaseReply ($in);
            }
  } // cancel_appointment


  //Get Remove Appointment
  public String remove_appointment (String appointmentID, String appointmentType, String patientID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_appointment", true);
                $out.write_string (appointmentID);
                $out.write_string (appointmentType);
                $out.write_string (patientID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return remove_appointment (appointmentID, appointmentType, patientID        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_appointment


  //Swap Appointment
  public String swap_appointment (String patientID, String old_appointmentID, String old_appointmentType, String new_appointmentID, String new_appointmentType)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("swap_appointment", true);
                $out.write_string (patientID);
                $out.write_string (old_appointmentID);
                $out.write_string (old_appointmentType);
                $out.write_string (new_appointmentID);
                $out.write_string (new_appointmentType);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return swap_appointment (patientID, old_appointmentID, old_appointmentType, new_appointmentID, new_appointmentType        );
            } finally {
                _releaseReply ($in);
            }
  } // swap_appointment

  public String fault (String adminID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("fault", true);
                $out.write_string (adminID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return fault (adminID        );
            } finally {
                _releaseReply ($in);
            }
  } // fault

  public String crash (String adminID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("crash", true);
                $out.write_string (adminID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return crash (adminID        );
            } finally {
                _releaseReply ($in);
            }
  } // crash

  public String general (String adminID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("general", true);
                $out.write_string (adminID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return general (adminID        );
            } finally {
                _releaseReply ($in);
            }
  } // general

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SendData/SendData_interface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _SendData_interfaceStub