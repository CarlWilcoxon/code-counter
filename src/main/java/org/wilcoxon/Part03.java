package org.wilcoxon;

import org.restlet.resource.*;
import org.restlet.Server;
import org.restlet.data.Protocol;


/*
 * Hello world!
 *
 */
public class Part03 extends ServerResource
{
  public static void main( String[] args ) throws Exception
  {
    // Create a HTTP server and listen on port 3000
    System.out.println( "Hello World!" );
    new Server(Protocol.HTTP, 3000, Part03.class).start();
  }

  @Get("txt")
  public String toString() {
    return "Hello, World";
  }
}
