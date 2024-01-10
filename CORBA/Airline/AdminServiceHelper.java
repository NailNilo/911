package Airline;


/**
* Airline/AdminServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AdminService.idl
* lundi 8 janvier 2024 17 h 31 GMT+01:00
*/

abstract public class AdminServiceHelper
{
  private static String  _id = "IDL:Airline/AdminService:1.0";

  public static void insert (org.omg.CORBA.Any a, Airline.AdminService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Airline.AdminService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Airline.AdminServiceHelper.id (), "AdminService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Airline.AdminService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AdminServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Airline.AdminService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Airline.AdminService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Airline.AdminService)
      return (Airline.AdminService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Airline._AdminServiceStub stub = new Airline._AdminServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Airline.AdminService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Airline.AdminService)
      return (Airline.AdminService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Airline._AdminServiceStub stub = new Airline._AdminServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
