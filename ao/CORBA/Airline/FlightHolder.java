package Airline;

/**
* Airline/FlightHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientService.idl
* lundi 8 janvier 2024 17 h 31 GMT+01:00
*/

public final class FlightHolder implements org.omg.CORBA.portable.Streamable
{
  public Airline.Flight value = null;

  public FlightHolder ()
  {
  }

  public FlightHolder (Airline.Flight initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Airline.FlightHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Airline.FlightHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Airline.FlightHelper.type ();
  }

}
