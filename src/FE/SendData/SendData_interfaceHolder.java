package FE.SendData;

/**
* SendData/SendData_interfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SendData_interface.idl
* Saturday, April 9, 2022 4:31:42 o'clock PM EDT
*/

public final class SendData_interfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public SendData_interface value = null;

  public SendData_interfaceHolder ()
  {
  }

  public SendData_interfaceHolder (SendData_interface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SendData_interfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SendData_interfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SendData_interfaceHelper.type ();
  }

}
