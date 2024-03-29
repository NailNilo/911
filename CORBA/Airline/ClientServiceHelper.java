package Airline;


/**
* Airline/ClientServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientService.idl
* lundi 8 janvier 2024 17 h 31 GMT+01:00
*/

abstract public class ClientServiceHelper
{
  private static String  _id = "IDL:Airline/ClientService:1.0";

  public static void insert (org.omg.CORBA.Any a, Airline.ClientService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Airline.ClientService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Airline.ClientServiceHelper.id (), "ClientService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Airline.ClientService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ClientServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Airline.ClientService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Airline.ClientService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Airline.ClientService)
      return (Airline.ClientService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Airline._ClientServiceStub stub = new Airline._ClientServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Airline.ClientService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Airline.ClientService)
      return (Airline.ClientService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Airline._ClientServiceStub stub = new Airline._ClientServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
