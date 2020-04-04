class CustomException
{
   public static void main(String args[])
   {
      try {
         throw new YearAheadException("Year can't be future");
      }
      catch (YearAheadException e) {
         System.out.println(e);
      }
   }
}

class YearAheadException extends Exception
{
   YearAheadException(String s)
   {
      super(s);
   }
}
