/**
 * Java main class example - Hello World
 * The class illustrates how to write comments used
 * to generate JavaDoc documentation
 *
 * @author Dan
 * @version 2.00, 11 Dec 2014
 */

package playground;
/**
*
* Simple java program prints out Hello World.
*
* The program prints Hello World and first command line parameter on the Console
*
* @param String array of command line entries - prints first one

*/
public class Helloworld {

	public static void main(String[] args) {
		
		oldPrintMessage("Hello World ");
		if (args.length > 0){
		   newPrintMessage(args[0]);
		}
		newPrintMessage("\n\n");

	}
    /**
 *
 * Simple method example.
 * The method prints a received message on the Console
 *
 * @param message String variable to be printed
 * @deprecated
 * @see Helloworld
 * @since version 1.00
 */
public static void oldPrintMessage(String message)
{
    System.out.printf(message);
}

/**
*
* Simple method example.
* The method prints a received message on the Console
*
* @param message String variable to be printed
* @see Helloworld
* @since version 2.00
*/
public static void newPrintMessage(String message)
{
 System.out.printf(message);
}

}
