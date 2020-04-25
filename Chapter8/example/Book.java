package Chapter8.example;
// Fig. 8.10: Book.java
// Declaring an enum type with constructor and explicit instance fields
// and accessors for these fields
// Java How to Program, 10th Ed. (Deitel) Page 331


public enum Book
{
   JHTP( "Java How to Program", "2012" ),
   CHTP( "C How to Program", "2007" ),
   IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
   CPPHTP( "C++ How to Program", "2012" ),
   VBHTP( "Visual Basic 2010 How to Program", "2011" ),
   CSHARPHTP( "Visual C# 2010 How to Program", "2011" );

   private final String title;
   private final String copyrightYear;

   Book( String bookTitle, String year )
   {
      title = bookTitle;
      copyrightYear = year;
   }

   public String getTitle()
   {
      return title;
   }

   public String getCopyrightYear()
   {
      return copyrightYear;
   }
}
