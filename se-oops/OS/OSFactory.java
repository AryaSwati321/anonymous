class OSFactory
{
  public static OS createOS(String OStype)
  {    
    switch(OStype)
    {
      case "Android":
       return new Android();
      
      case "iOS":
       return new iOS();
      
       case "Blackberry":
       return new Blackberry();
	

	default:
		throw new IllegalArguementException("Invalid OSType");
    }

    
 }

}
