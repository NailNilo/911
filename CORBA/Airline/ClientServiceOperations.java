package Airline;


/**
* Airline/ClientServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientService.idl
* lundi 8 janvier 2024 17 h 31 GMT+01:00
*/

public interface ClientServiceOperations 
{
  void registerNewPassenger (String passengerName, String phonenumber, String address, String email, String passport, String seattype);
  void viewAllFlights ();
  void availableseats ();
  void payment (double pay);
} // interface ClientServiceOperations