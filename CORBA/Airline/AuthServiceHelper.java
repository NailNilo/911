package Airline;


/**
* Airline/AuthServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AuthService.idl
* lundi 8 janvier 2024 17 h 30 GMT+01:00
*/

abstract public class AuthServiceHelper
{
  private static String  _id = "IDL:Airline/AuthService:1.0";

  public static void insert (org.omg.CORBA.Any a, Airline.AuthService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Airline.AuthService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Airline.AuthServiceHelper.id (), "AuthService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Airline.AuthService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AuthServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Airline.AuthService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Airline.AuthService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Airline.AuthService)
      return (Airline.AuthService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Airline._AuthServiceStub stub = new Airline._AuthServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Airline.AuthService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Airline.AuthService)
      return (Airline.AuthService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Airline._AuthServiceStub stub = new Airline._AuthServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
