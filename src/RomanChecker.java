public class RomanChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "VII", "LXXXVIII", "CCCXIV", "MMMCDXC" };

        for( int i = 0; i < 4; i++ )
        {
            if( i == 0 ) {
                { s = Roman.convert( 7 ); }
                snippet = "{ s = Roman.convert( 7 ); }";
            }
            if( i == 1 ) {
                { s = Roman.convert( 88 ); }
                snippet = "{ s = Roman.convert( 88 ); }";
            }
            if( i == 2 ) {
                { s = Roman.convert( 314 ); }
                snippet = "{ s = Roman.convert( 314 ); }";
            }
            if( i == 3 ) {
                { s = Roman.convert( 3490 ); }
                snippet = "{ s = Roman.convert( 3490 ); }";
            }


            if( !s.equals( t[i]))
            {
                System.out.println( "---- On code snippet:" );
                System.out.println( snippet );
                System.out.println( "---- Expected value of String s:" );
                System.out.println( t[i] );
                System.out.println( "---- Actual value of String s:" );
                System.out.println( s );
                return;
            }
        }
        System.out.println( "Passed all tests." );
      
    }
}