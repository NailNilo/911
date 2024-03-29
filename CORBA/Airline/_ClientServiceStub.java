package Airline;


/**
* Airline/_ClientServiceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientService.idl
* lundi 8 janvier 2024 17 h 31 GMT+01:00
*/

public class _ClientServiceStub extends org.omg.CORBA.portable.ObjectImpl implements Airline.ClientService
{

  public void registerNewPassenger (String passengerName, String phonenumber, String address, String email, String passport, String seattype)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registerNewPassenger", true);
                $out.write_string (passengerName);
                $out.write_string (phonenumber);
                $out.write_string (address);
                $out.write_string (email);
                $out.write_string (passport);
                $out.write_string (seattype);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                registerNewPassenger (passengerName, phonenumber, address, email, passport, seattype        );
            } finally {
                _releaseReply ($in);
            }
  } // registerNewPassenger

  public void viewAllFlights ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("viewAllFlights", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                viewAllFlights (        );
            } finally {
                _releaseReply ($in);
            }
  } // viewAllFlights

  public void availableseats ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("availableseats", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                availableseats (        );
            } finally {
                _releaseReply ($in);
            }
  } // availableseats

  public void payment (double pay)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("payment", true);
                $out.write_double (pay);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                payment (pay        );
            } finally {
                _releaseReply ($in);
            }
  } // payment

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Airline/ClientService:1.0"};

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
} // class _ClientServiceStub
