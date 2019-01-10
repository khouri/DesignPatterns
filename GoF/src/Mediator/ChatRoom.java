/*
 * Objeto utilizado para permitir comunicacao entre outros objetos
 * pattern behavioral.
 * */

package Mediator;

import java.util.Date;

public class ChatRoom {
	
	public static void showMessage(User user, String message){
		System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
	}
}