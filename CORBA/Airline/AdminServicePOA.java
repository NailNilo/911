package Airline;


/**
* Airline/AdminServicePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AdminService.idl
* lundi 8 janvier 2024 17 h 31 GMT+01:00
*/

public abstract class AdminServicePOA extends org.omg.PortableServer.Servant
 implements Airline.AdminServiceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addNewFlight", new java.lang.Integer (0));
    _methods.put ("addNewAirport", new java.lang.Integer (1));
    _methods.put ("registerNewPassenger", new java.lang.Integer (2));
    _methods.put ("viewAllFlights", new java.lang.Integer (3));
    _methods.put ("editFlight", new java.lang.Integer (4));
    _methods.put ("editAirport", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Airline/AdminService/addNewFlight
       {
         String code = in.read_string ();
         String departureAirport = in.read_string ();
         String arrivalAirport = in.read_string ();
         String departureTime = in.read_string ();
         String arrivalTime = in.read_string ();
         double price = in.read_double ();
         this.addNewFlight (code, departureAirport, arrivalAirport, departureTime, arrivalTime, price);
         out = $rh.createReply();
         break;
       }

       case 1:  // Airline/AdminService/addNewAirport
       {
         String code = in.read_string ();
         String city = in.read_string ();
         this.addNewAirport (code, city);
         out = $rh.createReply();
         break;
       }

       case 2:  // Airline/AdminService/registerNewPassenger
       {
         String passengerName = in.read_string ();
         String phonenumber = in.read_string ();
         String address = in.read_string ();
         String email = in.read_string ();
         String passport = in.read_string ();
         String seattype = in.read_string ();
         this.registerNewPassenger (passengerName, phonenumber, address, email, passport, seattype);
         out = $rh.createReply();
         break;
       }

       case 3:  // Airline/AdminService/viewAllFlights
       {
         this.viewAllFlights ();
         out = $rh.createReply();
         break;
       }

       case 4:  // Airline/AdminService/editFlight
       {
         this.editFlight ();
         out = $rh.createReply();
         break;
       }

       case 5:  // Airline/AdminService/editAirport
       {
         this.editAirport ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Airline/AdminService:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public AdminService _this() 
  {
    return AdminServiceHelper.narrow(
    super._this_object());
  }

  public AdminService _this(org.omg.CORBA.ORB orb) 
  {
    return AdminServiceHelper.narrow(
    super._this_object(orb));
  }


} // class AdminServicePOA